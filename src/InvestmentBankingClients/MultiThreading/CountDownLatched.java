package InvestmentBankingClients.MultiThreading;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatched {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Random random = new Random();
        WorkerThread workerThread1 = new WorkerThread(latch,random.nextInt(5000));
        WorkerThread workerThread2 = new WorkerThread(latch,random.nextInt(5000));
        WorkerThread workerThread3 = new WorkerThread(latch,random.nextInt(5000));

        new Thread(workerThread1,"WT-11").start();;
        new Thread(workerThread2,"WT-22").start();;
        new Thread(workerThread3,"WT-33").start();;
        try{
            latch.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Finished main method");
    }


}
class WorkerThread implements Runnable{
    private CountDownLatch latch;
    private int delay;

    public WorkerThread(CountDownLatch latch, int delay) {
        this.latch = latch;
        this.delay = delay;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        int delay = this.delay;
        System.out.println(name +" slepping for "+delay+" ms");
        try {
            Thread.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.latch.countDown();;
        System.out.println(name+"finished");

    }
}
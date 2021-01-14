package InvestmentBankingClients.MultiThreading;

public class PrintSeq implements Runnable{

    public int PRINT_NUMBERS_UPTO = 100;
    static int number =1;
    int remainder;
    static Object lock = new Object();

    PrintSeq(int remainder){
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO - 1) {
            synchronized (lock) {
                while (number % 4 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }


    public static void main(String[] args) {
        PrintSeq runnable1=new PrintSeq(1);
        PrintSeq runnable2=new PrintSeq(2);
        PrintSeq runnable3=new PrintSeq(0);
        PrintSeq runnable4= new PrintSeq(3);

    Thread t1=new Thread(runnable1,"T1");
    Thread t2=new Thread(runnable2,"T2");
    Thread t3=new Thread(runnable3,"T3");
    Thread t4=new Thread(runnable4,"T4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
}
}

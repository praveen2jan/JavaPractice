package InvestmentBankingClients.Singleton;

public class DoubleChecking {
    private static DoubleChecking instance;
    private DoubleChecking(){};

    public static DoubleChecking getInstance(){
        if(instance==null){
            synchronized (DoubleChecking.class){
                if(instance==null)
                    instance=new DoubleChecking();
            }
        }
        return instance;
    }
}

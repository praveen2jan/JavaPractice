package InvestmentBankingClients.Singleton;

public class StaticBlockInit {
    private static StaticBlockInit instance;
    private StaticBlockInit(){}
    static {
        try {
            instance=new StaticBlockInit();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    public static StaticBlockInit getInstance(){
        return instance;
    }

}

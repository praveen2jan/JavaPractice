package InvestmentBankingClients.Singleton;

public class UsingInnerClass {
    private UsingInnerClass(){}
    private static class SingletonHelper{
        private static final UsingInnerClass INSTACNE = new UsingInnerClass();
    }
    public static UsingInnerClass getInstance(){
        return SingletonHelper.INSTACNE;
    }
}

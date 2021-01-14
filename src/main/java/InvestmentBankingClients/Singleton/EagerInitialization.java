package InvestmentBankingClients.Singleton;

//Creational Design Pattern
//restricts instantiation and ensures one instance of the class
// create global accesss point
//used for loggin, driver objects , caching and thread pool
// used in other patterns as well like builder, prototype and facade
// eg. Runtime class and Desktop class
public class EagerInitialization {
    private static final EagerInitialization eagerInitialization = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance(){
        return eagerInitialization;
    }

}

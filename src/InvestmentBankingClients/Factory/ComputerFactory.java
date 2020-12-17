package InvestmentBankingClients.Factory;

public class ComputerFactory {
    public static Computer getComputer(String type){
        if("PC".equalsIgnoreCase(type)){
            return new PC();
        }else if("Server".equalsIgnoreCase(type)){
            return new Server();
        }
        return null;
    }
}

package InvestmentBankingClients.Factory;

public class Server extends Computer {
    private String ram;
    private String hdd;

    public Server(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    public Server() {
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }
}

package InvestmentBankingClients.Factory;

public class PC extends Computer {
    private String ram;
    private String hdd;

    public PC() {
    }

    public PC(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
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

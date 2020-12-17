package InvestmentBankingClients.Factory;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();

    public String toString(){
        return "RAM="+ this.getRAM()+" HDD="+this.getHDD();
    }
}

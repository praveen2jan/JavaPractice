package InvestmentBankingClients.Adapter;

public class ObjectAdapter implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(),10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(),40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts()/i);
    }


}

public class VEICULODOMESTICO extends VEICULO {

    public int Passageiros;
    public String Freio;
    public boolean AirBag;

    public VEICULODOMESTICO() {

    }

    public VEICULODOMESTICO(int Passageiros,String Freio, boolean AirBag) {
        super();
        this.Passageiros = Passageiros;
        this.Freio = Freio;
        this.AirBag = AirBag;

    }

    @Override
    public String Insert() {
        return String.format(
                "INSERT INTO VEICULODOMESTICO (Modelo, AnoFabricacao, Montadora, cor, Passageiros, Freio, AirBag) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), Passageiros, Freio, AirBag);
    }

    public int getPassageiros() {
        return Passageiros;
    }

    public void setPassageiros(int passageiros) {
        Passageiros = passageiros;
    }

    public String getFreio() {
        return Freio;
    }

    public void setFreio(String freio) {
        Freio = freio;
    }

    public boolean isAirBag() {
        return AirBag;
    }

    public void setAirBag(boolean airBag) {
        AirBag = airBag;
    }

}
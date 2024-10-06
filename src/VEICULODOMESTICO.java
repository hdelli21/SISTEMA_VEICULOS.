public class VEICULODOMESTICO extends VEICULO {

    public int passageiros;
    public String freio;
    public boolean airBag;

    public VEICULODOMESTICO() {
        // Construtor padrão
    }

    public VEICULODOMESTICO(int passageiros, String freio, boolean airBag) {
        super(); // Inicializa os atributos da superclasse
        this.passageiros = passageiros;
        this.freio = freio;
        this.airBag = airBag;
    }

    @Override
    public String insert() {
        return String.format(
            "INSERT INTO VEICULODOMESTICO (Modelo, AnoFabricacao, Montadora, Cor, Passageiros, Freio, AirBag) " +
            "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
            getModelo(), getAnoFabricacao(), getMontadora(), getCor(), passageiros, freio, airBag);
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        if (passageiros <= 0) {
            throw new IllegalArgumentException("Número de passageiros deve ser positivo.");
        }
        this.passageiros = passageiros;
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

}

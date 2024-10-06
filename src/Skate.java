public class Skate extends VEICULO {

    public String Marca;
    public String TipoRodas;

    public Skate() {

    }

    public Skate(String Marca, String TipoRodas) {
        super();
        this.Marca = Marca;
        this.TipoRodas = TipoRodas;
    }

    public String Insert() {
        return String.format(
                "INSERT INTO Skate (Modelo, AnoFabricacao, Montadora, Cor, Passageiros, Marca, TipoRodas) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), TipoRodas, Marca);

    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipoRodas() {
        return TipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
        TipoRodas = tipoRodas;
    }
}
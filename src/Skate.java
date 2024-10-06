public class Skate extends VEICULO {

    private String marca;
    private String tipoRodas;

    public Skate() {
        // Construtor padrão
    }

    public Skate(String modelo, int anoFabricacao, String montadora, String cor, String marca, String tipoRodas) {
        super(modelo, anoFabricacao, montadora, cor); // Inicializa os atributos da superclasse
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Skate (Modelo, AnoFabricacao, Montadora, Cor, Marca, TipoRodas) " +
                        "VALUES ('%s', %d, '%s', '%s', '%s', '%s');",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), marca, tipoRodas);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoRodas() {
        return tipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }
}

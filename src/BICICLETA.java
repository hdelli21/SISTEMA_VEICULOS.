public class BICICLETA extends VEICULO {

    public String Material;
    public String Marca;
    public int Marchas;
    public boolean Amortecedores;

    public BICICLETA() {

    }

    public BICICLETA(String Material, int Marchas, boolean Amortecedores, String Marca) {
        super();
        this.Amortecedores = Amortecedores;
        this.Marchas = Marchas;
        this.Material = Material;
        this.Marca = Marca;
    }

    @Override
    public String Insert() {
        return String.format(
                "INSERT INTO BICICLETA (Modelo, AnoFabricacao, Montadora, Cor, Passageiros, Material, Marchas,Amortecedores, Marca) "
                        +
                        "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), Material, Marchas, Amortecedores, Marca);
    }

    public String getMaterial() {
        return Material;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public int getMarchas() {
        return Marchas;
    }

    public void setMarchas(int marchas) {
        Marchas = marchas;
    }

    public boolean isAmortecedores() {
        return Amortecedores;
    }

    public void setAmortecedores(boolean amortecedores) {
        Amortecedores = amortecedores;
    }
}

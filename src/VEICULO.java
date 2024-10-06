public abstract class VEICULO {

    public String Modelo;
    public int anoFabricacao;
    public String Montadora;
    public String Cor;

    public VEICULO() {

    }

    public VEICULO(String Modelo, int anoFabricacao, String Montadora, String Cor) {
        this.Modelo = Modelo;
        this.Montadora = Montadora;
        this.anoFabricacao = anoFabricacao;
        this.Cor = Cor;

        if (Modelo == null || Modelo.isEmpty() || anoFabricacao <= 0) {
            throw new IllegalArgumentException("Modelo e ano de fabricação são obrigatórios.");
        }

    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMontadora() {
        return Montadora;
    }

    public void setMontadora(String montadora) {
        Montadora = montadora;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    // Método abstrato para gerar o comando insert
    public abstract String Insert();
}

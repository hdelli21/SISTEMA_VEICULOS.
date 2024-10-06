public abstract class VEICULO {

    public String modelo;
    public int anoFabricacao;
    public String montadora;
    public String cor;

    public VEICULO() {
        // Construtor padrão
    }

    public VEICULO(String modelo, int anoFabricacao, String montadora, String cor) {
        if (modelo == null || modelo.isEmpty() || anoFabricacao <= 0) {
            throw new IllegalArgumentException("Modelo e ano de fabricação são obrigatórios.");
        }

        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao <= 0) {
            throw new IllegalArgumentException("Ano de fabricação deve ser maior que zero.");
        }
        this.anoFabricacao = anoFabricacao;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método abstrato para gerar o comando insert
    public abstract String insert();
}

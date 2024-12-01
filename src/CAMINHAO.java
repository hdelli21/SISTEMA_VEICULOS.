public class CAMINHAO extends VEICULO {
    public int eixo;
    public int peso;

    public CAMINHAO() {
        // Construtor padrão
    }

    public CAMINHAO(String modelo, int anoFabricacao, String montadora, String cor,int eixo, int peso) {
        super(); // Inicializa os atributos da superclasse
        this.eixo = eixo;
        this.peso = peso;
    
    }

    public int getEixo() {
        return eixo;
    }

    public void setEixo(int eixo) {
        if (eixo <= 0) {
            throw new IllegalArgumentException("Número de eixos deve ser um valor positivo.");
        }
        this.eixo = eixo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser um valor positivo.");
        }
        this.peso = peso;
    }
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO CAMINHAO (modelo, ano_fabricacao, montadora, cor, eixo, peso) " +
                             "VALUES ('%s', %d, '%s', '%s', %d, %d);",
                             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getEixo(), getPeso());
    }
}

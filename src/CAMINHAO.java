public class CAMINHAO extends VEICULO {
    public int Eixo;
    public int Peso;

    public CAMINHAO() {

    }

    public CAMINHAO(int Eixo, int Peso) {
        super();
        this.Eixo = Eixo;
        this.Peso = Peso;

    }

    @Override
    public String Insert() {
        return String.format(
                "INSERT INTO CAMINHAO (Modelo, AnoFabricacao, Montadora, Cor, Passageiros, Eixo, Peso) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), Eixo, Peso);
    }

    public int getEixo() {
        return Eixo;
    }

    public void setEixo(int eixo) {
        Eixo = eixo;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }
}

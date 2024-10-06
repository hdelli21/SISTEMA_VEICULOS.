public class MOTOCICLETAS extends VEICULO {
    
    public int cilindradas;
    public int torque;

    public MOTOCICLETAS() {
        // Construtor padrão
    }

    public MOTOCICLETAS(int cilindradas, int torque) {
        super(); // Inicializa os atributos da superclasse
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    @Override
    public String insert() {
        return String.format(
                "INSERT INTO MOTOCICLETAS (Modelo, AnoFabricacao, Montadora, Cor, Cilindradas, Torque) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, %d);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), cilindradas, torque);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("Cilindradas devem ser um valor positivo.");
        }
        this.cilindradas = cilindradas;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        if (torque <= 0) {
            throw new IllegalArgumentException("Torque deve ser um valor positivo.");
        }
        this.torque = torque;
    }
}

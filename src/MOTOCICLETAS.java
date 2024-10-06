public class MOTOCICLETAS extends VEICULO {
    
    public int Cilindradas;
    public int Torque;


public MOTOCICLETAS(){

}
public MOTOCICLETAS (int Cilindradas,int Torque){
    super();
this.Cilindradas = Cilindradas;
this.Torque = Torque;
}
@Override
    public String Insert() {
        return String.format(
                "INSERT INTO MOTOCICLETAS (Modelo, AnoFabricacao, Montadora, Cor, Passageiros, Cilindradas, Torque) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), Cilindradas, Torque);
}
public int getCilindradas() {
    return Cilindradas;
}
public void setCilindradas(int cilindradas) {
    Cilindradas = cilindradas;
}
public int getTorque() {
    return Torque;
}
public void setTorque(int torque) {
    Torque = torque;
}

}
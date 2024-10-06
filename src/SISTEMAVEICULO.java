public class SISTEMAVEICULO {

    public static void main(String[] args) {
        // Criando um objeto de Automóvel Doméstico
        VEICULODOMESTICO carro = new VEICULODOMESTICO();
        carro.setModelo("Sedan");
        carro.setAnoFabricacao(2020);
        carro.setMontadora("Toyota");
        carro.setCor("Preto");
        carro.setPassageiros(5);
        carro.setFreio("Disco");
        carro.setAirBag(true);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Montadora: " + carro.getMontadora());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Máximo de Passageiros: " + carro.getPassageiros());
        System.out.println("Tipo de Freio: " + carro.getFreio());
        System.out.println("Airbag: " + (carro.isAirBag() ? "Sim" : "Não"));
        System.out.println("Comando SQL: " + carro.insert());

        // Criando um objeto de Motocicleta
        MOTOCICLETAS moto = new MOTOCICLETAS();
        moto.setModelo("Ninja");
        moto.setAnoFabricacao(2022);
        moto.setMontadora("Kawasaki");
        moto.setCor("Verde");
        moto.setCilindradas(1000);
        moto.setTorque(120);

        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano de Fabricação: " + moto.getAnoFabricacao());
        System.out.println("Montadora: " + moto.getMontadora());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("Torque: " + moto.getTorque());
        System.out.println("Comando SQL: " + moto.insert());

        // Criando um objeto de Caminhão
        CAMINHAO caminhao = new CAMINHAO();
        caminhao.setModelo("Cargo");
        caminhao.setAnoFabricacao(2019);
        caminhao.setMontadora("Ford");
        caminhao.setCor("Branco");
        caminhao.setEixo(3);
        caminhao.setPeso(12000);

        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Ano de Fabricação: " + caminhao.getAnoFabricacao());
        System.out.println("Montadora: " + caminhao.getMontadora());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Quantidade de Eixos: " + caminhao.getEixo());
        System.out.println("Peso Bruto: " + caminhao.getPeso());
        System.out.println("Comando SQL: " + caminhao.insert());

        // Criando um objeto de Bicicleta
        BICICLETA bicicleta = new BICICLETA();
        bicicleta.setModelo("Mountain Bike");
        bicicleta.setMarca("Caloi");
        bicicleta.setCor("Azul");
        bicicleta.setMaterial("Alumínio");
        bicicleta.setMarchas(21);
        bicicleta.setAmortecedores(true);

        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Cor: " + bicicleta.getCor());
        System.out.println("Material: " + bicicleta.getMaterial());
        System.out.println("Marchas: " + bicicleta.getMarchas());
        System.out.println("Amortecedor: " + (bicicleta.isAmortecedores() ? "Sim" : "Não"));
        System.out.println("Comando SQL: " + bicicleta.insert());

        // Criando um objeto de Skate
        Skate skate = new Skate();
        skate.setModelo("Longboard");
        skate.setMarca("Santa Cruz");
        skate.setCor("Vermelho");
        skate.setTipoRodas("Goma");

        System.out.println("Modelo: " + skate.getModelo());
        System.out.println("Marca: " + skate.getMarca());
        System.out.println("Cor: " + skate.getCor());
        System.out.println("Tipo de Rodas: " + skate.getTipoRodas());
        System.out.println("Comando SQL: " + skate.insert());
    }
}

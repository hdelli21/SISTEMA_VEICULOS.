

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

        // Inserir dados do carro no banco
        inserirVeiculo(carro);

        // Criando um objeto de Motocicleta
        MOTOCICLETAS moto = new MOTOCICLETAS();
        moto.setModelo("Ninja");
        moto.setAnoFabricacao(2022);
        moto.setMontadora("Kawasaki");
        moto.setCor("Verde");
        moto.setCilindradas(1000);
        moto.setTorque(120);

        // Inserir dados da moto no banco
        inserirVeiculo(moto);

        // Criando um objeto de Caminhão
        CAMINHAO caminhao = new CAMINHAO();
        caminhao.setModelo("Cargo");
        caminhao.setAnoFabricacao(2019);
        caminhao.setMontadora("Ford");
        caminhao.setCor("Branco");
        caminhao.setEixo(3);
        caminhao.setPeso(12000);

        // Inserir dados do caminhão no banco
        inserirVeiculo(caminhao);

        // Criando um objeto de Bicicleta
        BICICLETA bicicleta = new BICICLETA();
        bicicleta.setModelo("Mountain Bike");
        bicicleta.setMarca("Caloi");
        bicicleta.setCor("Azul");
        bicicleta.setMaterial("Alumínio");
        bicicleta.setMarchas(21);
        bicicleta.setAmortecedores(true);

        // Inserir dados da bicicleta no banco
        inserirVeiculo(bicicleta);

        // Criando um objeto de Skate
        Skate skate = new Skate();
        skate.setModelo("Longboard");
        skate.setMarca("Santa Cruz");
        skate.setCor("Vermelho");
        skate.setTipoRodas("Goma");

        // Inserir dados do skate no banco
        inserirVeiculo(skate);
    }

    // Método genérico para inserir qualquer tipo de veículo
    public static void inserirVeiculo(VEICULO veiculo) {
        // Estabelecer a conexão com o banco
        try (Connection conexao = CONEXAOBD_VEICULO.conectar()) {
            String sql = "";

            // Preparar o comando SQL de inserção dependendo do tipo do veículo
            if (veiculo instanceof VEICULODOMESTICO) {
                VEICULODOMESTICO carro = (VEICULODOMESTICO) veiculo;
                sql = "INSERT INTO VEICULODOMESTICO (modelo, ano_fabricacao, montadora, cor, passageiros, freio, airBag) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, carro.getModelo());
                    stmt.setInt(2, carro.getAnoFabricacao());
                    stmt.setString(3, carro.getMontadora());
                    stmt.setString(4, carro.getCor());
                    stmt.setInt(5, carro.getPassageiros());
                    stmt.setString(6, carro.getFreio());
                    stmt.setBoolean(7, carro.isAirBag());
                    stmt.executeUpdate();
                }
            } else if (veiculo instanceof MOTOCICLETAS) {
                MOTOCICLETAS moto = (MOTOCICLETAS) veiculo;
                sql = "INSERT INTO MOTOCICLETAS (modelo, ano_fabricacao, montadora, cor, cilindradas, torque) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, moto.getModelo());
                    stmt.setInt(2, moto.getAnoFabricacao());
                    stmt.setString(3, moto.getMontadora());
                    stmt.setString(4, moto.getCor());
                    stmt.setInt(5, moto.getCilindradas());
                    stmt.setInt(6, moto.getTorque());
                    stmt.executeUpdate();
                }
            } else if (veiculo instanceof CAMINHAO) {
                CAMINHAO caminhao = (CAMINHAO) veiculo;
                sql = "INSERT INTO CAMINHAO (modelo, ano_fabricacao, montadora, cor, eixo, peso) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, caminhao.getModelo());
                    stmt.setInt(2, caminhao.getAnoFabricacao());
                    stmt.setString(3, caminhao.getMontadora());
                    stmt.setString(4, caminhao.getCor());
                    stmt.setInt(5, caminhao.getEixo());
                    stmt.setInt(6, caminhao.getPeso());
                    stmt.executeUpdate();
                }
            } else if (veiculo instanceof BICICLETA) {
                BICICLETA bicicleta = (BICICLETA) veiculo;
                sql = "INSERT INTO BICICLETA (modelo, marca, cor, material, marchas, amortecedores) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, bicicleta.getModelo());
                    stmt.setString(2, bicicleta.getMarca());
                    stmt.setString(3, bicicleta.getCor());
                    stmt.setString(4, bicicleta.getMaterial());
                    stmt.setInt(5, bicicleta.getMarchas());
                    stmt.setBoolean(6, bicicleta.isAmortecedores());
                    stmt.executeUpdate();
                }
            } else if (veiculo instanceof Skate) {
                Skate skate = (Skate) veiculo;
                sql = "INSERT INTO Skate (modelo, marca, cor, tipoRodas) VALUES (?, ?, ?, ?)";
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, skate.getModelo());
                    stmt.setString(2, skate.getMarca());
                    stmt.setString(3, skate.getCor());
                    stmt.setString(4, skate.getTipoRodas());
                    stmt.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

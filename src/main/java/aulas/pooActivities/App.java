package aulas.pooActivities;

public class App {
    public static void main(String[] args) {
        // Dados do Endereço
        Endereco endereco = new Endereco();
        endereco.cep = "00000000";

        // Dados do Cliente
        Cliente cliente = new Cliente();

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Houve um erro ao adicionar endereço" + e.getMessage());
        }
    }
}

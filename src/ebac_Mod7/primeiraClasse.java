package ebac_Mod7;

public class primeiraClasse {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua São José dos Campos");
        cliente.setCodigo(1);
        System.out.println("Código do cliente: " + cliente.getCodigo());
        System.out.println("Endereço do cliente: " + cliente.getEndereco());
    }
}

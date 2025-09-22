public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();

        clientes.add(new Cliente("154544joao", "Joao"));
        clientes.add(new Cliente("154544joao", "João"));
        clientes.add(new Cliente("154544joao", "Juca"));

         for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.pegar(i).getValor());
        }
    }
}

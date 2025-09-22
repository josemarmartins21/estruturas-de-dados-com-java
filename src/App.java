public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada<String> lista = new ListaLigada<String>();

        lista.add("Angola");
        lista.add("Congo");
        lista.add("México");
        lista.add("Antuerpia");

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.pegar(i).getValor());
        }
      
    }
}

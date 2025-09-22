public class ProgramamInteiros {
    public static void main(String[] args) {
        ListaLigada<Integer> numeros = new ListaLigada<Integer>();

        numeros.add(20);
        numeros.add(45);
        numeros.add(100);

        for (int i = 0; i < numeros.getTamanho(); i++) {
            System.out.println(numeros.pegar(i).getValor());
        }
    }
}

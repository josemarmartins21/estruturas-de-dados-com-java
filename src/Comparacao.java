import java.util.ArrayList;

class Comparacao {
    public static void main(String[] args) {
        ListaLigada<Integer> numeros = new ListaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        // Adição de elementos

        int limite = 100;

        long tempoInicial = System.currentTimeMillis();

        long tempoFinal;



        for (int i = 0; i < limite; i++) {
            vetor.add(i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Adicionou " + limite + " Elemento no vetor");

        System.out.println(tempoFinal - tempoInicial);


        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < limite; i++) {
            numeros.add(i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("\n\nAdicionou " + limite + " Elemento na Lista");

        System.out.println(tempoFinal - tempoInicial);

        System.out.println("Ler valores");

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < numeros.getTamanho(); i++) {
            numeros.pegar(i);
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da Lista com iterador");
       // System.out.println(tempoFinal - tempoInicial);

        IteratorListaLigada<Integer> iterator = numeros.getIterator();
        
        tempoInicial = System.currentTimeMillis();

        while (iterator.temProximo()) {
            System.out.println(iterator.getProximo().getValor() * 2);

        } 

        
       

        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da Lista");
        System.out.println(tempoFinal - tempoInicial);

    }
}
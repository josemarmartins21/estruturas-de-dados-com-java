package busca_binaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            
        }

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual número vc busca?");
        int buscado = leitor.nextInt();

        int cout = 0;

        boolean achou = false;

        int inicio = 0;
        int fim = vetor.length - 1; 
        while (inicio <= fim) {
            int meio = (int)((inicio + fim) / 2);
            cout ++; // conta quantos teste foram feitos

            if (vetor[meio] == buscado) {
                achou = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;

            } else { // so pode ser maior
                fim = meio - 1;
            }
        }

        System.out.println("Quanitdade de testes " + cout);

        if (achou) {
            System.out.println("Achou");

        } else {
            System.out.println("Não achou!");
        }

        leitor.close();
    }
}

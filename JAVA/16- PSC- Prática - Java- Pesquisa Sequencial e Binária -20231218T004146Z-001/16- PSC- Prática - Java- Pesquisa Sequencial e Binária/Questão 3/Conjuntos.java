package segundafase;

import java.util.Arrays;
import java.util.Scanner;

public class Conjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira sequência de números naturais separados por espaço:");
        int[] sequencia1 = lerSequencia(scanner);

        System.out.println("Digite a segunda sequência de números naturais separados por espaço:");
        int[] sequencia2 = lerSequencia(scanner);

        System.out.println("Sequência 1: " + Arrays.toString(sequencia1));
        System.out.println("Sequência 2: " + Arrays.toString(sequencia2));

        int[] conjuntoA = removerDuplicatas(sequencia1);
        int[] conjuntoB = removerDuplicatas(sequencia2);

        System.out.println("Conjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));

      
        int[] conjuntoC = uniao(conjuntoA, conjuntoB);

        
        System.out.println("Conjunto C (união de A e B): " + Arrays.toString(conjuntoC));
    }

    private static int[] lerSequencia(Scanner scanner) {
        String input = scanner.nextLine();
        String[] numerosString = input.split(" ");
        int[] sequencia = new int[numerosString.length];

        for (int i = 0; i < numerosString.length; i++) {
            sequencia[i] = Integer.parseInt(numerosString[i]);
        }

        return sequencia;
    }

    private static int[] removerDuplicatas(int[] sequencia) {
        Arrays.sort(sequencia);

        int tamanhoSemDuplicatas = 1;
        for (int i = 1; i < sequencia.length; i++) {
            if (sequencia[i] != sequencia[i - 1]) {
                tamanhoSemDuplicatas++;
            }
        }

        int[] conjunto = new int[tamanhoSemDuplicatas];
        conjunto[0] = sequencia[0];

        int index = 1;
        for (int i = 1; i < sequencia.length; i++) {
            if (sequencia[i] != sequencia[i - 1]) {
                conjunto[index] = sequencia[i];
                index++;
            }
        }

        return conjunto;
    }

    private static int[] uniao(int[] conjuntoA, int[] conjuntoB) {
        int tamanhoUniao = conjuntoA.length + conjuntoB.length;
        int[] uniao = new int[tamanhoUniao];

      
        System.arraycopy(conjuntoA, 0, uniao, 0, conjuntoA.length);

        int index = conjuntoA.length;

       
        for (int elementoB : conjuntoB) {
            if (!contemElemento(uniao, elementoB)) {
                uniao[index] = elementoB;
                index++;
            }
        }

       
        return Arrays.copyOf(uniao, index);
    }

    private static boolean contemElemento(int[] array, int elemento) {
        for (int valor : array) {
            if (valor == elemento) {
                return true;
            }
        }
        return false;
    }
}

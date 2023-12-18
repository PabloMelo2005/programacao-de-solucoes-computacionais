import java.util.Arrays;
import java.util.Scanner;

class Ordenacao {

    public void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int meio = arr.length / 2;
            int[] esquerda = Arrays.copyOfRange(arr, 0, meio);
            int[] direita = Arrays.copyOfRange(arr, meio, arr.length);

            mergeSort(esquerda);
            mergeSort(direita);

            merge(arr, esquerda, direita);
        }
    }

    private void merge(int[] arr, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                arr[k++] = esquerda[i++];
            } else {
                arr[k++] = direita[j++];
            }
        }

        while (i < esquerda.length) {
            arr[k++] = esquerda[i++];
        }

        while (j < direita.length) {
            arr[k++] = direita[j++];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ordenacao ordenacao = new Ordenacao();
        int[] vetor = new int[10];

        while (true) {
            System.out.println("Escolha um método de ordenação:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Merge Sort");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 6) {
                break;
            }

            System.out.println("Informe 10 números para serem ordenados:");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    ordenacao.bubbleSort(vetor);
                    break;
                case 2:
                    ordenacao.selectionSort(vetor);
                    break;
                case 3:
                    ordenacao.insertionSort(vetor);
                    break;
                case 4:
                    ordenacao.quickSort(vetor, 0, vetor.length - 1);
                    break;
                case 5:
                    ordenacao.mergeSort(vetor);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("Vetor ordenado:");
            System.out.println(Arrays.toString(vetor));
        }

        System.out.println("Programa encerrado.");
    }
}
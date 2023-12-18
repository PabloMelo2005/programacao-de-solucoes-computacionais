import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            int[] vetor = new int[10];

            System.out.println("Informe 10 números para serem ordenados:");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    Ordenacao.bubbleSort(vetor);
                    break;
                case 2:
                    Ordenacao.selectionSort(vetor);
                    break;
                case 3:
                    Ordenacao.insertionSort(vetor);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Vetor ordenado:");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Deseja executar o algoritmo novamente? (1 para sim, 0 para não):");
        } while (scanner.nextInt() == 1);

        scanner.close();
    }
}
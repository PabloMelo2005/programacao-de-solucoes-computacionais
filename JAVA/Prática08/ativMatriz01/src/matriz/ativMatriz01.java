package matriz;

import java.util.Scanner;

public class ativMatriz01 {

	private double[][] matriz = new double[5][5];
	Scanner sc;

	public ativMatriz01() {
		sc = new Scanner(System.in);
	}

	public void addElementos() {

		System.out.println("Informe os números que deseja adicionar(Até 25): ");

		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++)
				matriz[i][j] = sc.nextDouble();

	}

	public void exibicaoMatriz() {
		int i, j;

		System.out.println("\n MATRIZ \n");

		for (i = 0; i < 5; i++) {
			System.out.print("----------------------------- \n");
			System.out.print("| ");
			for (j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.print("----------------------------- \n");

	}

	public void exibicaoLinhasParesColunasImpares() {

		System.out.println("\n Números em linhas pares e colunas ímpares: \n");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (i % 2 == 0 && j % 2 == 1)
					System.out.println("\n [" + matriz[i][j] + "] ");

		}

	}

	public void exibicaoMatrizTransposta() {

		System.out.println("\n MATRIZ TRANSPOSTA \n");

		for (int i = 0; i < 5; i++) {
			System.out.print("----------------------------- \n");
			System.out.print("| ");
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[j][i] + " | ");
			}

			System.out.println();
		}

		System.out.print("----------------------------- \n");

	}

	public void trocarDiagonais() {
		for (int i = 0; i < 5; i++) {
			double temp = matriz[i][i];
			matriz[i][i] = matriz[i][4 - i];
			matriz[i][4 - i] = temp;
		}
	}

	public void exibicaoMatrizDiagonaisTrocadas() {
		int i, j;

		System.out.println("\n MATRIZ COM DIAGONAIS TROCADAS \n");

		for (i = 0; i < 5; i++) {
			System.out.print("----------------------------- \n");
			System.out.print("| ");
			for (j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.print("----------------------------- \n");

	}
}

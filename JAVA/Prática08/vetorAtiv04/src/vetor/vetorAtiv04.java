package vetor;

import java.util.Scanner;

public class vetorAtiv04 {

	private double[] numeros = new double[10];
	Scanner sc;

	public vetorAtiv04() {
		sc = new Scanner(System.in);
	}

	public void addNumeros() {

		System.out.println("Informe os números que deseja adicionar(Até 10): ");

		for (int i = 0; i < 10; i++) {
			numeros[i] = sc.nextDouble();
		}
	}

	public void exibicaoVetor() {

		System.out.println("\n VETOR(REAIS)");

		for (int i = 0; i < 10; i++) {
			System.out.print("\n" + (i) + "° |  [" + numeros[i] + "] ");

		}

		System.out.print("\n");
	}

	public void exibicaoPosicoesPares() {

		System.out.println("\n Números em posições pares: \n");

		for (int i = 0; i < 10; i++) {
			if (i > 0 && i % 2 == 0)
				System.out.println("\n" + (i) + "° |  [" + numeros[i] + "] \n");
			

		}

	}
}

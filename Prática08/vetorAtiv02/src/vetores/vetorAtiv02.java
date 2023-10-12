package vetores;

import java.util.Scanner;

public class vetorAtiv02 {

	private double[] numeros = new double[10];
	Scanner sc;

	public vetorAtiv02() {

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
			System.out.print("\n" + (i + 1) + "° |  [" + numeros[i] + "] ");

		}

		System.out.print("\n");
	}

	public void exibicaoNumNegativos() {

		System.out.print("\n Números negativos do vetor: ");

		for (double num : numeros) {
			if (num < 0)
				System.out.println("\n [" + num + "] ");
		}
	}

}

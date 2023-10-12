package vetor;

import java.util.Scanner;

public class vetorAtiv03 {

	private double[] numeros = new double[10];
	Scanner sc;

	public vetorAtiv03() {

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

	public void exibicaoMaiorMenor() {

		double maior = numeros[0];
		double menor = numeros[0];

		for (int i = 0; i < 10; i++) {
			for (double num : numeros) {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}

			}

		}

		System.out.println("\n Maior número informado: [" + maior + "] \n");
		System.out.println("\n Menor número informado: [" + menor + "] \n");
	}
}

package vetor;

import java.util.Scanner;

public class vetorAtiv01 {
	private int[] numeros = new int[10];
	private int soma_pares = 0;
	Scanner sc;

	public vetorAtiv01() {
		
		sc = new Scanner(System.in);

	}

	public void addNumeros() {

		System.out.println("Informe os números que deseja adicionar(Até 10): ");

		for (int i = 0; i < 10; i++) {
			numeros[i] = sc.nextInt();
		}
	}

	public void exibicaoVetor() {

		System.out.println("\n VETOR(INTEIROS) \n");

		for (int numero : numeros)
			System.out.print("[" + numero + "] ");
		
		System.out.print("\n");
	}

	public int setSomaPares() {

		for (int i = 0; i < 10; i++) {
			if (numeros[i] % 2 == 0) {
				soma_pares += numeros[i];
			}
		}
		
		return soma_pares;
	}
	
	public void exibicaoSomaPares() {
		System.out.println("\n Soma dos números pares: " + soma_pares);
	}

}

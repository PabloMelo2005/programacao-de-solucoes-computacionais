package cadastramento;

import java.util.Scanner;

public class Cadastro {
	private Veiculo[] veiculos;
	Scanner sc;

	public Cadastro() {
		int qtde_max;
		sc = new Scanner(System.in);

		System.out.println("Informe quantos carros deseja cadastrar:");
		qtde_max = sc.nextInt();

		this.veiculos = new Veiculo[qtde_max];

		for (int i = 0; i < qtde_max; i++)
			this.veiculos[i] = new Veiculo();
	}

	public void cadastrar() {
		for (int i = 0; i < veiculos.length; i++) {
			System.out.println("Informe a marca do carro:");
			veiculos[i].setMarca(sc.next());
		}
	}

	public void imprimir() {
		System.out.println("Veiculos cadastrados:");
		for (int i = 0; i < veiculos.length; i++) {
			System.out.println((i + 1) + ") " + veiculos[i].exibe());
		}
	}
	public void encerrar() {
		sc.close();
	}
}

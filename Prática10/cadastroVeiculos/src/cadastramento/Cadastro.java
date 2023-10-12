package cadastramento;

import java.util.Scanner;

public class Cadastro {
	private Veiculo[] veiculos;
	Scanner sc;

	public Cadastro() { /* Método construtor da classe. **/
		int qtde_max;
		sc = new Scanner(System.in);

		System.out.println("Informe quantos carros deseja cadastrar:");
		qtde_max = sc.nextInt();

		this.veiculos = new Veiculo[qtde_max]; /* Definição do tamanho do vetor **/

		for (int i = 0; i < qtde_max; i++)
			this.veiculos[i] = new Veiculo(); /**Definição do armazenamento de cada slot do vetor */
	}

	public void cadastrar() { /** Método que percorre cada um dos slots armazenando as informações. */
		for (int i = 0; i < veiculos.length; i++) { 
			System.out.println("Sobre o carro, nos informe: "); 

			System.out.println("Marca: ");
			veiculos[i].setMarca(sc.next());

			System.out.println("Modelo:");
			veiculos[i].setModelo(sc.next());

			System.out.println("Placa:");
			veiculos[i].setPlaca(sc.next());

			System.out.println("Cor:");
			veiculos[i].setCor(sc.next());

			System.out.println("Número do Chassi:");
			veiculos[i].setNum_chassi(sc.next());

		}
	}

	public void imprimir() { /** Método de impressão do vetor */
		System.out.println("Veiculos cadastrados:");
		for (int i = 0; i < veiculos.length; i++) {
			System.out.println((i + 1) + "º) " + veiculos[i].exibe());
		}
	}

	public void encerrar() { /** Método de encerramento do Scanner. */
		sc.close();
	}
}

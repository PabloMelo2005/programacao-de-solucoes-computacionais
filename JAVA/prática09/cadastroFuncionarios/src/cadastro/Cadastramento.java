package cadastro;

import java.util.Scanner;

public class Cadastramento {

	private Funcionario[] funcionarios;
	Scanner sc;

	public Cadastramento() { /** Método de definição/criação de parâmetros pro vetor. */
		sc = new Scanner(System.in);
		int qtde;

		System.out.println("Quantos funcionários deseja cadastrar?");
		qtde = sc.nextInt();

		this.funcionarios = new Funcionario[qtde];

		for (int i = 0; i < qtde; i++) {
			this.funcionarios[i] = new Funcionario();
		}
	}

	public void registro() { /** Método de registro/ cadastramento de informações. */

		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("Cadastramento de funcionário");

			System.out.println("Nome: ");
			funcionarios[i].setNome(sc.next());

			System.out.println("idade: ");
			funcionarios[i].setIdade(sc.nextInt());
			
			sc.nextLine();

			System.out.println("Endereço: ");
			funcionarios[i].setEndereco(sc.nextLine());

			System.out.println("Telefone: ");
			funcionarios[i].setTelefone(sc.next());
			
			sc.nextLine();

			System.out.println("Salario: ");
			funcionarios[i].setSalario(sc.nextDouble());

			System.out.println("Cargo: ");
			funcionarios[i].setCargo(sc.next());
			
			sc.nextLine();

		}

	}

	public void impressao() { /** Método de impressão das informações */
		System.out.println("Dados do funcionário:");

		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("\n" + "\n" + funcionarios[i].exibe());

		}

	}
	
	public void encerrar() { /** Método de encerramento do Scanner. */
		sc.close();
	}
}

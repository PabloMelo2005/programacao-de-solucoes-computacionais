package pessoa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome, cpf;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		nome = sc.nextLine();
		Pessoa pessoa = new Pessoa(nome);
		
		
		System.out.println("Informe o nome:");
		nome = sc.nextLine();
		System.out.println("Informe o CPF:");
		cpf = sc.nextLine();
		PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
		
		System.out.println(pessoa.exibe());
		System.out.println(pessoaFisica.exibe());
        /*
		System.out.println("Quantas pessoas você quer cadastrar?");
		int qtde = sc.nextInt();

		System.out.println("\nEscolha uma opção: \n1- Pessoa Física \n2- Pessoa Jurídica");
		String opcao = sc.nextLine();

		Pessoa[] pessoa = new Pessoa[qtde];

		for (int i = 0; i < qtde; i++) {
			System.out.println("\nEscolha uma opção: \n1- Pessoa Física \n2- Pessoa Jurídica \nOpção escolhida: ");
			String opcao = sc.nextLine();
			
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			
			if (opcao == "1") {
					
					PessoaFisica pf = new PessoaFisica();
					System.out.println("Digite o CPF: ");
					String cpf = sc.nextLine();
					
					pf.setNome(nome)
					pf.setCPF(cpf);
			}
			
		}*/

	}

}

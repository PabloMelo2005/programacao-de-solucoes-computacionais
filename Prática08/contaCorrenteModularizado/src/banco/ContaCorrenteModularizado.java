package banco;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaCorrenteModularizado {
	Scanner sc;
	private int numero, agencia;
	private double saldo;

	public void iniciarContaCorrente() {
		sc = new Scanner(System.in); 

		try { /* Definição da tentativa à ser avaliada */
			System.out.println("Informe a agência:"); /** Inserção de informações na conta */
			agencia = sc.nextInt();

			System.out.println("Informe o número da conta:");
			numero = sc.nextInt();
		} catch (InputMismatchException e) { /** Aparecer erro caso insira um tipo de informação errado */
			System.out.println("Isso não se enquadra nos tipos aceitáveis de resposta!");
		}
	}

	public void sacar() {
		sc = new Scanner(System.in);

		try { /* Definição da tentativa à ser avaliada */

			System.out.println("Quanto quer sacar?");
			double valor = sc.nextDouble();

			if (saldo >= valor) { /** Condição para que só possa sacar o que tiver na conta ou menos */
				saldo -= valor; /** Subtração e armazenamento na variável saldo no valor retirado */
			} else
				System.out.println("Você não tem saldo o suficiente na sua conta!");

		} catch (InputMismatchException e) { /** Aparecer erro caso insira um tipo de informação errado */
			System.out.println("Isso não se enquadra nos tipos aceitáveis de resposta!");
		}

	}

	public void depositar() {
		sc = new Scanner(System.in);

		try { /* Definição da tentativa à ser avaliada */

			System.out.println("Quanto quer depositar?"); 
			double valor = sc.nextDouble();

			saldo += valor; /* Adição e armazenamento do valor depositado na variável saldo */

		} catch (InputMismatchException e) { /** Aparecer erro caso insira um tipo de informação errado */
			System.out.println("Isso não se enquadra nos tipos aceitáveis de resposta!");
		}
	}

	public void exibe() {

		DecimalFormat df = new DecimalFormat("#.##"); /** Formatação de variável para ser exibida como em valor monetário(com duas casas decimais) */
		String formatacao = df.format(saldo);

		System.out.println("Agência: " + agencia); /** Exibição de variáveis */
		System.out.println("Conta: " + numero);
		System.out.println("Saldo: R$" + formatacao);
	}

	public void encerrar() {
		sc.close(); /** Fechamento do Scanner */
	}
}

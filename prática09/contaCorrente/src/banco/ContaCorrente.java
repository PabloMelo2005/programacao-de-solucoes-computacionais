package banco;

import java.text.DecimalFormat;

public class ContaCorrente {
	
	private int numero, agencia;
	private double saldo;
	
	public void iniciarContaCorrente(int n, int ag) {
		numero = n; /** Inicialização das variáveis */
		agencia = ag;
		saldo = 0;
	}

	public void sacar(double valor) {
		
		if(saldo >= valor) { /** Condição para que só possa sacar o que tiver na conta ou menos */
			saldo -= valor; /** Subtração e armazenamento na variável saldo no valor retirado */
		}
		else
			System.out.println("Você não tem saldo o suficiente na sua conta!");
	}

	public void depositar(double valor) {
		saldo += valor; /* Adição e armazenamento do valor depositado na variável saldo */
	}

	public double consultarSaldo() {
		return (saldo);
	}
	
	public void exibe() {
		
		DecimalFormat df = new DecimalFormat("#.##"); /** Formatação de variável para ser exibida como em valor monetário(com duas casas decimais */
		String formatacao = df.format(saldo); 
		
		System.out.println("Agência: " + agencia);	/** Exibição de variáveis */ 
		System.out.println("Conta: " + numero);	
		System.out.println("Saldo: R$" + formatacao);	
	}
}

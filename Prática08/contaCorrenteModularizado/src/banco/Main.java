package banco;

public class Main {

	public static void main(String[] args) {

		/** Inserção da instância do tipo Conta Corrente pra utilização dos métodos. */

		ContaCorrenteModularizado contaCorrente;

		contaCorrente = new ContaCorrenteModularizado();

		contaCorrente.iniciarContaCorrente(); /** Invocação do método para iniciação de conta corrente */
		
		contaCorrente.depositar();  /** Invocação do método para depósito na conta */

		contaCorrente.exibe(); /** Invocação do método para exibição dos dados da conta */

		contaCorrente.sacar(); /** Invocação do método para saque na conta */

		contaCorrente.exibe();

		contaCorrente.encerrar(); /** Invocação do método para fechamento do Scanner */

	}

}

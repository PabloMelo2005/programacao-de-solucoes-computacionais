package banco;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContaCorrente contaCorrente; /** Inserção da instância do tipo ContaCorrente(Classe) pra utilização dos métodos. */
		double deposito, saque;
		int agencia, num_conta;
		
		contaCorrente = new ContaCorrente();
		
		try { /**Configurar erro caso insira uma informação que não seja do tipo própro para preeenchimento das variáveis*/
			
		System.out.println("Informe a agência:"); /** Armazenamento dos dados da conta.*/
		agencia = sc.nextInt();
		
		System.out.println("Informe o número da conta:");
		num_conta = sc.nextInt();
		 
		contaCorrente.iniciarContaCorrente(num_conta, agencia); /**Invocação do método de Iniciação da conta(definição de parâmetros).*/
		
		/**Inserção do valor do depósito e transcrição da variável da classe ContaCorrente para a da classe Main.*/
		
		System.out.println("Informe o valor que quer depositar: ");
		deposito = sc.nextDouble();
		
		contaCorrente.depositar(deposito); /**Invocação do método de depósito(definição de parâmetros).*/
		
		contaCorrente.consultarSaldo(); /** Retorno do saldo para a classe Main */
		
		contaCorrente.exibe(); /**Exibição dos dados da conta.*/
		
		
		System.out.println("Quanto quer sacar?"); 
		saque = sc.nextDouble(); 
		
		contaCorrente.sacar(saque); /**Inserção do valor do saque e transcrição da variável da classe ContaCorrente para a da classe Main.*/
		
		contaCorrente.consultarSaldo(); /** Retorno do saldo para a classe Main */
		
		contaCorrente.exibe(); /** Re-exibição dos dados da conta. */
		
		sc.close();
		}
		catch (InputMismatchException e) { /** Aparecer erro caso insira um tipo de informação errado */
			System.out.println("Você inseriu um valor que não se configura nos tipos possíveis pra essas informações!");
		}
		
	}
}

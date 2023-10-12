package cadastramento;

public class Main {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro(); /** Criação da instância pra classe. */
		cadastro.cadastrar(); /** Invocação do método de cadastro. */
		cadastro.imprimir(); /** Invocação do método para impressão dos dados.  */
		cadastro.encerrar(); /** Invocação do método para encerramento do Scanner. */
	}

}
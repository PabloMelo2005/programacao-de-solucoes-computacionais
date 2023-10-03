package cadastro;

public class Main {

	public static void main(String[] args) {
		
		Cadastramento cadastro = new Cadastramento(); /** Criação da instância da classe */
		
		cadastro.registro(); /** Invocação do método de registro(Inserção/Cadastramento das informações no vetor). */
		cadastro.impressao(); /** Invocação do método de impressão das informações */
		cadastro.encerrar(); /** Invocação do método de encerramento do Scanner. */

	}

}

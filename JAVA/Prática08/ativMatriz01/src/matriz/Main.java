package matriz;

public class Main {

	public static void main(String[] args) {
		ativMatriz01 matriz = new ativMatriz01(); /* Criação da instância da classe **/

		matriz.addElementos(); /* Invocação do método para adicionar os elementos na matriz. **/

		matriz.exibicaoMatriz(); /* Invocação do método que exibe a matriz. **/

		matriz.exibicaoLinhasParesColunasImpares(); /* Invocação do método que exibe os elementos que estão em uma posição de linha ímpar e coluna par. **/
		
		matriz.exibicaoMatrizTransposta(); /* Invocação do método que exibe a Matriz transposta(linhas viram colunas e vice-versa). **/
		
		matriz.trocarDiagonais(); /* Invocação do método que troca as diagonais. **/
		
		matriz.exibicaoMatrizDiagonaisTrocadas(); /* Invocação do método que exibe a matriz resultante. **/
		

	}

}

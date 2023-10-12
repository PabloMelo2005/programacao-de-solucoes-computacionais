package estabelecimento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Produto 2 \n Nome: "); 
		String nome_prod1 = sc.next();
		
		System.out.println(" Preço: ");
		double preco_prod1 = sc.nextDouble();
		
		Produto prod1 = new Produto(nome_prod1, preco_prod1); /** Criação da instância da classe com definição de atributos do produto 1*/
		
		System.out.println("\n Produto 2 \n Nome: ");
		String nome_prod2 = sc.next();
		
		System.out.println(" Preço: ");
		double preco_prod2 = sc.nextDouble();
		
		Produto prod2 = new Produto(nome_prod2, preco_prod2); /** Criação da instância da classe com definição de atributos do produto 2*/
		
		System.out.println("Informe o percentual de reajuste que deseja aplicar ao preço do produto: ");
		double percentual = sc.nextDouble();
		
		prod1.exibe(); /** Invocação do método de exibição de informações pro primeiro produto*/
		prod2.exibe(); /** Invocação do método de exibição de informações pro segundo produto*/
		
		System.out.println("Ultimo ID gerado: " + Produto.getUltimoId());
		
		prod1.reajustaPreco(percentual); /** Invocação do método de reajuste de preço pro primeiro produto*/
		prod2.reajustaPreco(percentual); /** Invocação do método de reajuste de preço pro segundo produto*/
		
		System.out.println("\n Preço reajustado em " + percentual + "%: \n");
		
		prod1.exibe(); /** Invocação do método de exibição de informações pro primeiro produto(agora pós aplicação do reajuste de preço)*/
		prod2.exibe(); /** Invocação do método de exibição de informações pro segundo produto(agora pós aplicação do reajuste de preço)*/
		
		sc.close();
		

	}

}

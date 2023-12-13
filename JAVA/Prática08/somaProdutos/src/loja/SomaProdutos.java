package loja;

import java.util.Scanner;

public class SomaProdutos {
	private int qtde;
	private double soma;
	
	public void SomarProdutos() { /** método executor da classe. */
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Informe a quantidade de produtos: ");
	        qtde = sc.nextInt();

	        for (int i = 1; i <= qtde; i++) { /** Estocagem dos produtos até a atingir a capacidade máxima definida.*/
	            System.out.println("Informe o preço do " + i + "º produto: ");
	            double preco = sc.nextDouble();
	            soma += preco;
	        }

	        System.out.println("Soma total: " + soma); /* Preço total dos produtos. **/
	        sc.close();
}
}



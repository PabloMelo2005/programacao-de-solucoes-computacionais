package psc;

import java.util.Scanner;

public class Retangulo_Modularizacao {
	private Scanner sc = new Scanner(System.in);
	private float altura, largura;

	public Retangulo_Modularizacao() { /* Método construtor da Classe. */

	}

	public void setAltura() { /** Método para definição da variável altura por meio de input. */
		System.out.print("Informe a altura do retângulo: ");
		altura = sc.nextFloat();
	}

	public void setLargura() { /** Método para definição da variável largura por meio de input. */
		System.out.print("Informe a largura do retângulo: ");
		largura = sc.nextFloat();
	}

	public float calculaArea() { /** Método de cálculo de área */
		return altura * largura;
	}

	public float calculaPerimetro() { /** Método de cálculo de perímetro */
		return (2 * altura) + (2 * largura);
	}

	public void exibe() { /** Método de exibição das informações */
		System.out.println("Altura: " + altura);
		System.out.println("Largura: " + largura);
		System.out.println("Área: " + (altura * largura));
		System.out.println("Perímetro: " + ((2 * altura) + (2 * largura)));
	}
}

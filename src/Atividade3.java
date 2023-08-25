import java.util.Scanner;

public class Atividade3 {
	public static final double cotacaodolar = 4.88;

	public static void main(String[] args) {
		double dolar, reais;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor em reais: ");
		dolar = input.nextDouble();
		
		reais = dolar * cotacaodolar;
		
		System.out.println("Seu valor em reais é: " + reais);
		
		
		

	}

}

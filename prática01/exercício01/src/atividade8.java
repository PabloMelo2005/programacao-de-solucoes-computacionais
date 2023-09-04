import java.util.Scanner;

public class atividade8 {
	public static final double engordar15 = 0.15, emagrecer20 = 0.2;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		double peso, pesoemagrecer, pesoengordar;
		
		System.out.println("Informe o seu peso(kg): " );
		peso = input.nextDouble();
		
		pesoemagrecer = peso - (peso * emagrecer20);
		pesoengordar = peso + (peso * engordar15);
		
		System.out.println("20% de emagrecimento: " + pesoemagrecer);
		System.out.println("15% de ganho de peso: " + pesoengordar);



	}

}

import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double cat1, cat2, hip;
		
		System.out.println("Informe o valor de um cateto: ");
		cat1 = input.nextDouble();
		
		System.out.println("Informe o valor do outro cateto: ");
		cat2 = input.nextDouble();
		
		hip= Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		
		System.out.println("O valor da Hipotenusa é: " + hip);

	}

}

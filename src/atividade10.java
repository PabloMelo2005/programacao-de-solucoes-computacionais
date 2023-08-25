import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double raio, area, comprimento, volume;
		
		System.out.println("Informe o raio da circunferência: ");
		raio = input.nextDouble();
		
		area = 2 * Math.PI * raio;
		comprimento = Math.PI * Math.pow(raio, 2);
		volume = (3 / 4) * Math.PI * Math.pow(raio, 3);
		
		System.out.println("A área é: " + area);
		System.out.println("O volume é: " + volume);
		System.out.println("O comprimento é: " + comprimento);

	}

}

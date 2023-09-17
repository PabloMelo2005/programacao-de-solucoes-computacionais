import java.util.Scanner;

public class atividade1EstruturaCondicional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double media, nota1, nota2;
		
		System.out.println("Informe suas notas:");
		nota1= input.nextDouble();
		nota2 = input.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Sua média é:" + media);
		
		if (media >= 7)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");
		
		



	}

}

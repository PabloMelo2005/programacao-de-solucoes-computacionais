
import java.util.Scanner;

public class atividade1 {
	
	public static void main(String args []) {
		
		Scanner input = new Scanner( System.in );
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Insira a primeira nota:");
		nota1 = input.nextDouble();
		
		System.out.print("Insira a segunda nota:");
		nota2 = input.nextDouble();
		
		System.out.print("Insira a terceira nota:");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua media eh:" + media);
		
	
				
				
	

	}

}

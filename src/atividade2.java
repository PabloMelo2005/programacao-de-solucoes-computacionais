import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	 
	  int anonascimento, anoatual, idade;
	  
	  System.out.println("Informe o ano de seu nascimento:");
	  anonascimento = input.nextInt();
	  
	  System.out.println("Informe o ano em que você está:");
	  anoatual = input.nextInt();
	  
	  idade = anoatual - anonascimento;
	  
	  System.out.println("Sua idade é:" + idade);
	  

	}

}

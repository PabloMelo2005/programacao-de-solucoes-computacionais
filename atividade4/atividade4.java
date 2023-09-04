import java.util.Scanner;

public class atividade4 {
	public static final double aumento = 0.25;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, salariofinal;
		
		System.out.println("Informe o seu valor salarial atual:");
		salario = input.nextDouble();
		
		salariofinal = salario + (salario * aumento);
		
		System.out.println("Seu salário com aumento é: " + salariofinal);
		
		
		
		

	}

}

import java.util.Scanner;

public class atividade7 {
	public static final double salariominimo = 1320;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double salario, qtdesalario;
		
		System.out.println("Informe o seu valor salarial: ");
		salario = input.nextDouble();
		
		qtdesalario = salario / salariominimo;
		
		System.out.println("O seu salário equivale à essa quantidade de salários mínimos: " + qtdesalario);
	
		

	}

}

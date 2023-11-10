package excecao2;

import java.util.Scanner;

public class Divisao {

	Scanner sc;

	public void divisao() throws ArithmeticException {
		sc = new Scanner(System.in);

		System.out.println("Informe o dividendo: ");
		int dividendo = sc.nextInt();

		System.out.println("Informe o divisor: ");
		int divisor = sc.nextInt();

		if (dividendo < 0)
			throw new ArithmeticException(
					"O dividendo não pode ser menor que zero.");
		if (divisor == 0)
			throw new ArithmeticException(
					"O divisor não pode ser igual a 0.");
		
		System.out.println("Resultado: " + dividendo / divisor);

		sc.close();

	}
}

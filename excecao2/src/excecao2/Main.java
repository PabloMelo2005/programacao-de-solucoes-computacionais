package excecao2;

public class Main {

	public static void main(String[] args) {

		Divisao divisao = new Divisao();

		try {
			divisao.divisao();
		}

		catch (ArithmeticException e) {
			System.out.println("Exceção detectada: " + e.toString());
		}

		finally {
			System.out.println("Fim do programa.");
		}
	}
}

package Main;

	import java.util.Scanner;

	class Main {
	    public static int realizarDivisao(int dividendo, int divisor) throws ArithmeticException {
	        if (divisor == 0 || dividendo < 0) {
	            throw new ArithmeticException("error.");
	        }
	        return dividendo / divisor;
	    }
	}

	public class pratica15_ex02 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.println("Informe o dividendo: ");
	            int a = sc.nextInt();

	            System.out.println("Informe o divisor: ");
	            int b = sc.nextInt();

	            System.out.println("Resultado: " + Main.realizarDivisao(a, b));
	        } catch (ArithmeticException e) {
	            System.out.println("ERRO: " + e.getMessage());
	        
	            sc.close();
	        }
	    }
	}


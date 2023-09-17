package atividade2EstruturaCondicional;

import java.util.Scanner;

public class atividade2EstruturaCondicional {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.println("Informe o valor de cada um dos lados:");
		lado1 = input.nextDouble();
		lado2 = input.nextDouble();
		lado3 = input.nextDouble();
		
		if (lado1 == lado2 
			&& lado1 == lado3)
			System.out.println("Triângulo Equilátero");
		else if (lado1 != lado2 
				&& lado1 == lado3)
			System.out.println("Triângulo Isósceles");
		else
			System.out.println("Triângulo Escaleno");
		
		
		
	}

}

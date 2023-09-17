package atividade7EstruturaCondicional;

import java.util.Scanner;

public class Atividade7EstruturaCondicional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2, x, xd;
		
		System.out.println("a:");
		a = input.nextDouble();
		
		System.out.println("b:");
		b = input.nextDouble();
		
		System.out.println("c:");
		c = input.nextDouble();
		
		
		
		delta = Math.pow(b, 2) - 4 * (a) * (c);
		
		x = (- c) / b;
		
		xd = (- b) / 2 * a;
		
		x1 = (- b - Math.sqrt(delta)) / 2 * a;
		
		x2 = (- b + Math.sqrt(delta)) / 2 * a;
		
		
		
		if (a == 0 && b == 0 && c == 0)
			System.out.println("Igualdade confirmada: 0 = 0.");
		
		else if (a == 0 && b == 0 && c != 0)
			System.out.println("Coeficientes informados incorretamente”.");
		
		else if (a == 0 && b != 0)
			System.out.println("Esta é uma equação de primeiro grau e sua raiz é :" + x);
		
		else if (a != 0)
			System.out.println("Esta é uma equação de segundo grau.");
		
		if (delta < 0)
			System.out.println("Esta equação não possui raízes reais.");
		
		if (delta == 0)
			System.out.println("Esta equação possui duas raízes reais iguais:" + xd);
		
		if (delta > 0)
			{System.out.println("Esta equação possui duas raízes reais diferentes");
			System.out.println("x1:" + x1);
			System.out.println("x2:" + x2);}
		
		

	}

}

package atividade5EstruturaCondicional;

import java.util.Scanner;

public class Atividade5EstruturaCondicional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, fun1, fun2, fun3;
		
		System.out.println("Insira o número:");
		num = input.nextInt();
		
		if (num < -2)
			System.out.println("f(x) = 2 . (" + num + ") + 2 = " + (2 * num + 2));
		else if (num >= -2 && num < 3)
			System.out.println("f(x) = 3");
		else if (num >= 3)
			System.out.println("f(x) = -" + num);
		
		

	}

}

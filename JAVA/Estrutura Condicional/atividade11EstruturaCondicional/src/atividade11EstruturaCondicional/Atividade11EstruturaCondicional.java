package atividade11EstruturaCondicional;

import java.util.Scanner;

public class Atividade11EstruturaCondicional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int dias, total;
		double diaria;
		
		diaria = 500.00;
		total = 0;
		
		System.out.println("Quantos dias o cliente ficou aqui?");
		dias = input.nextInt();
		
		if (dias < 15)
			total = (dias * 500) + (15 * dias);
		
		else if (dias == 15)
			total = (dias * 500) + (10 * dias);
		
		else if (dias > 15)
			total = (dias * 500) + (5 * dias);
		
		System.out.println("Total : R$" + total);
			
	}

}

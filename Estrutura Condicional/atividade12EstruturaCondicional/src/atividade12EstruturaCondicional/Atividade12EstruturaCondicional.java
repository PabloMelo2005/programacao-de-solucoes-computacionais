package atividade12EstruturaCondicional;

import java.util.Scanner;

public class Atividade12EstruturaCondicional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tipo;
		double mensalidade;
		
		mensalidade = 0.0;
		
		System.out.println("1 - Homem até 15 anos");
		System.out.println("2 - Mulher até 18 anos");
		System.out.println("3 - Homem de 16 á 18 anos");
		System.out.println("4 - Mulher de 19 á 25 anos");
		System.out.println("5 - Homem de 19 à 30 anos");
		System.out.println("6 - Mulher de 26 à 40 anos");
		System.out.println("7 - Homem de 31 à 40 anos");
		System.out.println("8 - Mulher com mais de 40 anos");
		System.out.println("9 - Homem com mais de 40 anos");
		
		
		System.out.println("Digite a opção em que se enquadra(número):");
		tipo = input.nextInt();
		
		switch (tipo) {
		
		case 1: 
			System.out.println("Homem até 15 anos");
			mensalidade += 60.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
			
		case 2:
			System.out.println("Mulher até 18 anos");
			mensalidade += 60.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
			
		case 3:
			System.out.println("Homem de 16 à 18 anos");
			mensalidade += 75.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
		
		case 4:
			System.out.println("Mulher de 19 à 25 anos");
			mensalidade += 90.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
		
		case 5:
			System.out.println("Homem de 19 à 30 anos");
			mensalidade += 90.00;	
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
			
		case 6:
			System.out.println("Mulher de 26 à 40 anos");
			mensalidade += 85.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
			
		case 7:
			System.out.println("Homem de 31 à 40 anos");
			mensalidade += 85.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
			
		case 8:
			System.out.println("Mulher de mais de 40 anos");
			mensalidade += 80.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
			
		case 9:
			System.out.println("Homem de mais de 40 anos");
			mensalidade += 80.00;
			System.out.println("Mensalidade : R$" + mensalidade);
			break;
		
		
		
		
		}

	}

}

package atividade8EstruturaCondicional;

import java.util.Scanner;

public class Atividade8EstruturaCondicional {
	Scanner input = new Scanner(System.in);
	
	double preco;
	int codigo;
	String produto;
	
	System.out.println("Informe o código do produto:");
	codigo = input.nextInt();
	
	if (codigo == 1)
	{
		produto = "Sapato";
		preco = 99.99;
	}
	
	else if (codigo == 2)
	{
		produto = "Bolsa";
		preco = 103.89;
	}
	
	else if (codigo == 3)
	{
		produto = "Camisa";
		preco = 49.98;
	}
	
	else if (codigo == 4)
	{
		produto = "Calça";
		preco = 89.72;
	}
	
	else if (codigo == 5)
	{
		produto = "Blusa";
		preco = 97.35;
	}
	
	else
		System.out.println("Esse produto não se encontra cadastrado no nosso sistema.");
	
	System.out.println(produto + "- R$ " + preco);
	
}}

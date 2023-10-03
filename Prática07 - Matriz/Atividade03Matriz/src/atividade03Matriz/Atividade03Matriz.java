package atividade03Matriz;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade03Matriz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		
		try {
		System.out.println("Informe um número inteiro(Primeira Matriz)");
		LerMatrizes(sc, matriz1);
		
		System.out.println("Informe um número inteiro(Segunda Matriz)");
		LerMatrizes(sc, matriz2);
		}
		catch (InputMismatchException e) {
			System.out.println("Essa é uma matriz somente de números inteiros!");
		}
        
		int[][] produto_matrizes = multiplicacaoMatrizes(matriz1, matriz2);
		
		impressaoMatriz(produto_matrizes);
		
		sc.close();
        
		
	}
	
	
	public static void LerMatrizes(Scanner sc, int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
	}
	
	public static int [][] multiplicacaoMatrizes(int[][] matriz1, int[][] matriz2) {
		int[][] produto = new int[2][2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				produto[i][j] = 0;
				for (int b = 0; b < 2; b++){
					produto[i][j] = matriz1[i][b] * matriz2[b][j];
				}
				}
				
			}
		return produto;
		}
	
	public static void impressaoMatriz(int[][]matriz) {
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("[" + " ");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf(matriz[i][j] + " ");
			}
			System.out.println("]");
		}
	
		}
	
	}
	





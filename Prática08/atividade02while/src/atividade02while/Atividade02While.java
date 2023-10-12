package atividade02while;

import java.util.Scanner;

public class Atividade02While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Informe as notas(Caso queira encerrar o programa digite uma matrícula negativa):");
            
            System.out.println("Digite o número de matrícula do aluno: ");
            int matricula = scanner.nextInt();
            
            if (matricula < 0) {
            	System.out.println("Você inseriu uma matrícula negativa, logo, programa encerrado.");
                break;
            }
            
            System.out.println("Digite a primeira nota:");
            double nota1 = scanner.nextDouble();
            
            System.out.println("Digite a segunda nota:");
            double nota2 = scanner.nextDouble();
            
            System.out.println("Digite a terceira nota:");
            double nota3 = scanner.nextDouble();
            
            double media = (nota1 + nota2 + nota3) / 3;
            
            if (media >= 70) {
                System.out.println("Aprovado!");
            } else if (media >= 60 && media < 70) {
                System.out.println("Recuperação!");
            } else if (media < 60) {
                System.out.println("Reprovado!");
            }
        }
        scanner.close();
    }
}
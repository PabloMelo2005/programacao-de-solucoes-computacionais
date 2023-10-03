import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade01While {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        int contador_90 = 0, contador_reprovados = 0, contador_alunos = 0;
	        double maior_nota = Double.MIN_VALUE, menor_nota = Double.MAX_VALUE, total_notas = 0;
	        

	        System.out.println("(Digite uma nota negativa para encerrar):");

	        while (true) {
	            
	        	System.out.print("Nota final: ");
	            double nota = scanner.nextDouble();

	            System.out.print("Total de faltas: ");
	            int faltas = scanner.nextInt();

	            contador_alunos++;
	            total_notas += nota;
	            
	            
	            
	            if (nota < 0) {
	                break; 
	            }

	            
	            if (nota >= 90) {
	                contador_90++;
	            }

	            
	            if (nota < 70 || faltas >= 20) {
	               contador_reprovados++;
	            }

	           
	            if (nota > menor_nota) {
	                maior_nota = nota;
	            }

	           
	            if (nota < menor_nota) {
	            	menor_nota = nota;
	            }
	        }

	        
	        if (contador_alunos > 0) {
	            double media_notas = total_notas / contador_alunos;
	            
	           
	            DecimalFormat formatacao = new DecimalFormat("0.0");
		        String media_formatada = formatacao.format(media_notas);

		        
	            System.out.println("a. Notas que ultrapassaram 90: " + contador_90);
	            System.out.println("b. Reprovados(por nota ou falta): " + contador_reprovados);
	            System.out.println("c. Maior nota: " + maior_nota);
	            System.out.println("   Menor nota: " + menor_nota);
	            System.out.format("d. Média de notas(turma): " + media_formatada);
	        
	        } 
	        
	        else {
	            
	        	System.out.println("Não possuo informações o suficiente para analisar.");
	        }

	        
	        scanner.close();
	    }
	}
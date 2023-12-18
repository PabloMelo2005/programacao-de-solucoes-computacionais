package segundafase;

	import java.util.Arrays;
	import java.util.Scanner;

	public class PesquisaBinaria {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        int[] vetor = new int[10];
	        System.out.println("Digite 10 números para preencher o vetor (ordenados):");
	        for (int i = 0; i < 10; i++) {
	            vetor[i] = scanner.nextInt();
	        }

	        if (!isOrdenado(vetor)) {
	            System.out.println("O vetor deve estar ordenado para realizar a pesquisa binária.");
	            return;
	        }

	        while (true) {
	            
	            System.out.print("Digite o número a ser pesquisado (ou -1 para sair): ");
	            int alvo = scanner.nextInt();

	            if (alvo == -1) {
	                break;
	            }

	            int[] resultado = pesquisaBinaria(vetor, alvo);

	            if (resultado[0] != -1) {
	                System.out.println("O número " + alvo + " foi encontrado na posição " + resultado[0] + ".");
	            } else {
	                System.out.println("O número " + alvo + " não foi encontrado no vetor.");
	            }

	            System.out.println("Foram realizadas " + resultado[1] + " comparações.");
	        }

	        scanner.close();
	    }

	   	    private static boolean isOrdenado(int[] vetor) {
	        int[] copia = Arrays.copyOf(vetor, vetor.length);
	        Arrays.sort(copia);
	        return Arrays.equals(vetor, copia);
	    }

	    
	    private static int[] pesquisaBinaria(int[] vetor, int alvo) {
	        int[] resultado = new int[2];
	        resultado[0] = -1; 
	        resultado[1] = 0;  
	        
	        int inicio = 0;
	        int fim = vetor.length - 1;

	        while (inicio <= fim) {
	            int meio = (inicio + fim) / 2;
	            resultado[1]++; 
	            
	            if (vetor[meio] == alvo) {
	                resultado[0] = meio;
	                break;
	            } else if (vetor[meio] < alvo) {
	                inicio = meio + 1;
	            } else {
	                fim = meio - 1;
	            }
	        }

	        return resultado;
	    }
	}


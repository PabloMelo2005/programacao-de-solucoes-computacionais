package Main;

import java.util.Scanner;

//Métodos de ordenação
public class Ordenacao {
 //Bolha
 public static void bolha(int[] array) {
     int n = array.length;
     for (int i = 0; i < n-1; i++)
         for (int j = 0; j < n-i-1; j++)
             if (array[j] > array[j+1]) {
                 // Troca array[j+1] e array[i] ( tres copos dois com suco e um apenas para a transferencia do suco :D )
                 int temp = array[j];
                 array[j] = array[j+1];
                 array[j+1] = temp;
             }
 }

 //Seleção
 public static void selecao(int[] array) {
     int n = array.length;
     for (int i = 0; i < n-1; i++) {
         // Encontra o mínimo em array[i..n-1]
         int min_idx = i;
         for (int j = i+1; j < n; j++)
             if (array[j] < array[min_idx])
                 min_idx = j;

     
         int temp = array[min_idx];
         array[min_idx] = array[i];
         array[i] = temp;
     }
 }

 //Inserção
 public static void insercao(int[] array) {
     int n = array.length;
     for (int i = 1; i < n; ++i) {
         int key = array[i];
         int j = i - 1;

         
         while (j >= 0 && array[j] > key) {
             array[j + 1] = array[j];
             j = j - 1;
         }
         array[j + 1] = key;
     }
 }

 //Quicksort
 public static void quicksort(int[] array, int low, int high) {
     if (low < high) {
         int pivo = partition(array, low, high);// pivo é o fator q deve ou n ser trocado de lugar

         quicksort(array, low, pivo-1);
         quicksort(array, pivo+1, high);
     }
 }

//Método auxiliar para o Quicksort
private static int partition(int[] array, int low, int high) {
   int pivot = array[high];
   int i = (low-1); // Índice do elemento menor
   for (int j=low; j<high; j++) {
       // Se o elemento atual é menor que o pivô
       if (array[j] < pivot) {
           i++;

           // Troca array[i] e array[j]  
           int temp = array[i];
           array[i] = array[j];
           array[j] = temp;
       }
   }

   // Troca array[i+1] e array[high] (ou pivô)
   int temp = array[i+1];
   array[i+1] = array[high];
   array[high] = temp;

   return i+1;
}
}

//Classe principal
class Principal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     boolean continuar = true;
     while (continuar) {
         System.out.println("Digite 10 números para ordenar:");
         int[] array = new int[10];
         for (int i = 0; i < 10; i++) {
             array[i] = scanner.nextInt();
         }

         System.out.println("Selecione o método de ordenação (1: Bolha, 2: Seleção, 3: Inserção, 4: Quicksort):");
         int metodo = scanner.nextInt();

         switch (metodo) {
             case 1:
                 Ordenacao.bolha(array);
                 break;
             case 2:
                 Ordenacao.selecao(array);
                 break;
             case 3:
                 Ordenacao.insercao(array);
                 break;
             case 4:
                 Ordenacao.quicksort(array, 0, array.length - 1);
                 break;
             default:
                 System.out.println("Método de ordenação inválido.");
                 continue;
         }

         System.out.println("Array ordenado:");
         for (int i = 0; i < 10; i++) {
             System.out.print(array[i] + " ");
         }
         System.out.println();

         System.out.println("Deseja continuar? (1: Sim, 2: Não)");
         int opcao = scanner.nextInt();
         continuar = opcao == 1;
     }
     scanner.close();
 	}
}




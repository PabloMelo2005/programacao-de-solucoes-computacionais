package buscas;

import java.util.Scanner;

public class Buscas {

    private int[] vet = new int[10];
    private Scanner sc;
    private int value, i, r = vet.length, l = 0;

    public Buscas() {
        sc = new Scanner(System.in);
    }

    public void addnum() {
        for (i = 0; i < 10; i++) {
            System.out.println("Informe um número: ");
            vet[i] = sc.nextInt();
        }
    }

    public int informeValor() {
        while (true) {
            try {
                System.out.println("Informe o valor que procura: ");
                value = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Isso não é um número válido!");
                System.out.println("Informe o valor que procura: ");
                sc.nextInt();
            }
        }
        return value;
    }

    public int search() {
        i = l;

        for (i = l; i < r; i++) {
            if (value == vet[i])
                return i;
        }
        return -1;
    }

    public int search_sentinel() {
        i = l;
        int n = r;

        vet[n - 1] = value;

        for (i = l; value != vet[i]; i++)
            ;

        if (i < n - 1)
            return i; /* Chave encontrada! */
        else
            return -1; /* Sentinela encontrada. */

    }

    public int getI() {
        return i;
    }

}

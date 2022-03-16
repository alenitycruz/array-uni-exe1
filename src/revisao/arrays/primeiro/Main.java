package revisao.arrays.primeiro;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numero = new int[5];
        System.out.println("Digite 5 números ");
        int i = 0;
        do {
            int n = scan.nextInt();
            i++;
        }while (i < numero.length);

        System.out.println(numero.length);

        System.out.print("\nVetor: ");
        for(int a = (numero.length - 1); a >= 0; a --) {
            System.out.print(numero[a] + " ");
        }


    }

}

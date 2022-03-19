package revisao.arrays.primeiro;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero[] = new int[5];
        System.out.println("Digite 5 números ");
       numero[0] = scan.nextInt();
       numero[1] = scan.nextInt();
       numero[2] = scan.nextInt();
       numero[3] = scan.nextInt();
       numero[4] = scan.nextInt();

       for (int c = 0 ; c < 5 ; c++){
           System.out.print(numero[c] + " ");
       }

        System.out.println(numero.length);


    }

}

/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */
package exerciciosVetores;
import entities.NumerosPares;

import java.util.Scanner;

public class exercicio4_NumeroPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numero você vai digitar?");
        n = sc.nextInt();
        NumerosPares [] vect = new NumerosPares[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            vect[i] = new NumerosPares(numero);
        }

        System.out.print("Numeros pares:");
        for (int i = 0; i < n; i++) {
            if (vect[i].getNumeroPar() % 2 == 0) {
                System.out.print(" " + vect[i].getNumeroPar());
            }
        }

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i].getNumeroPar() % 2 == 0) {
                cont++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares: " + cont);


        sc.close();

    }
}

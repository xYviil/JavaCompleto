/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.  */

package exerciciosVetores;

import entities.Negativos;
import java.util.Scanner;

public class exercicio1_Negativos {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos número você vai digitar?");
        n = sc.nextInt();
        if (n > 10) {
            System.out.println("O numero digitado não pode ser maior que 10!");
            return;
        }
        Negativos [] vect = new Negativos[n];

        for (int i = 0; i < vect.length; i ++) {
            System.out.println("Digite um valor:");
            int numeros = sc.nextInt();
            vect[i] = new Negativos(numeros);
        }

        System.out.println("Números negativos:");
        for (int i=0; i<n; i++) {
            if (vect [i].getNumbers() < 0) {
                System.out.printf("%d\n", vect[i].getNumbers());
            }
            sc.close();
        }
    }
}

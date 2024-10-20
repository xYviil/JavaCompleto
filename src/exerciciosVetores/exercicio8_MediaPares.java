/* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NÚMERO PAR" */

package exerciciosVetores;
import entities.MediaPares;

import java.util.Scanner;

public class exercicio8_MediaPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        MediaPares [] vect = new MediaPares[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            vect[i] = new MediaPares(numero);
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i].getNumeros() % 2 == 0) {
                soma = soma + vect[i].getNumeros();
            }
        }

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i].getNumeros() % 2 == 0) {
                cont++;
            }
        }

        double media;
        if (cont == 0) {
            System.out.println("Sem nenhum número par!");
        } else {
            media = soma / cont;
            System.out.println("Media dos pares: " + media);
        }
        sc.close();
    }
}

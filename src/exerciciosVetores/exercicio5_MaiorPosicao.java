/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 1 (um). */

package exerciciosVetores;
import entities.MaiorPosicao;

import java.util.Scanner;

public class exercicio5_MaiorPosicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int posmaior = 0;
        int n;
        double maior = 0;

        System.out.println("Quantos numero você vai digitar?");
        n = sc.nextInt();
        MaiorPosicao [] vect = new MaiorPosicao[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número:");
            double numero = sc.nextDouble();
            vect[i] = new MaiorPosicao(numero);
        }

        for (int i = 0; i < n; i++) {
            if (vect[i].getNumero() > maior) {
                maior = vect[i].getNumero();
                posmaior = i+1;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        sc.close();
    }
}

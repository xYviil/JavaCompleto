/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */
package exerciciosVetores;

import entities.SomaVetor;
import java.util.Scanner;

public class exercicio2_SomaVetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.println("Quantos numeros você vai digitar?");
        n = sc.nextInt();

        SomaVetor [] vect = new SomaVetor[n];

        for (int i = 0; i < vect.length; i ++) {
            System.out.println("Digite um número:");
            float numeroDigitado = sc.nextFloat();
            vect[i] = new SomaVetor(numeroDigitado);
        }

        soma = 0;
        for (int i = 0; i < n; i ++) {
            soma = soma + vect[i].getSoma_vetor();
        }

        media = soma / n;

        System.out.print("Valores: ");
        for (int i = 0; i < n; i ++) {
            System.out.printf("%.2f ", vect[i].getSoma_vetor());
        }
        System.out.println();
        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Média: %.2f", media);

        sc.close();
    }

}

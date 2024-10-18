/* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

package exerciciosVetores;

import entities.SomaVetores;

import java.util.Scanner;

public class exercicio6_SomaVetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();
        SomaVetores [] vectA = new SomaVetores[n];
        SomaVetores [] vectB = new SomaVetores[n];
        SomaVetores [] vectC = new SomaVetores[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++) {
            int valoresA = sc.nextInt();
            vectA[i] = new SomaVetores(valoresA);
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            int valoresB = sc.nextInt();
            vectB[i] = new SomaVetores(valoresB);
        }

        for (int i = 0; i < n; i++) {
            vectC[i] = new SomaVetores(vectA[i].getValoresA() + vectB[i].getValoresA()) ;
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < n; i ++) {
            System.out.println(vectC[i].getValoresA());
        }

        sc.close();
    }
}

/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos os elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.  */

package exerciciosVetores;
import entities.AbaixoDaMedia;

import java.util.Scanner;

public class exercicio7_AbaixoDaMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos elementos vai ter o vetor?");
        n = sc.nextInt();
        AbaixoDaMedia [] vect = new AbaixoDaMedia[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número:");
            double numero = sc.nextDouble();
            vect[i] = new AbaixoDaMedia(numero);
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vect[i].getNumero();
        }

        double media = soma / n;
        System.out.println("Média do vetor = " + media);

        System.out.print("Elementos abaixo da média: ");
        for (int i = 0; i < n; i++) {
            if (vect[i].getNumero() < media) {
                System.out.println(vect[i].getNumero());
            }
        }

        sc.close();

    }

}

/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

package exerciciosVetores;
import entities.MaisVelho;

import java.util.Scanner;

public class exercicio9_MaisVelho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, maiorIdade = 0;
        String pessoaVelha = "";

        System.out.println("Quantas pessoas você vai digitar?");
        n = sc.nextInt();
        MaisVelho [] vect = new MaisVelho[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            vect[i] = new MaisVelho(nome, idade);
        }

        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() > maiorIdade) {
                maiorIdade = vect[i].getIdade();
                pessoaVelha = vect[i].getNome();
            }
        }

        System.out.println("Pessoa mais velha: " + pessoaVelha);

        sc.close();

    }
}

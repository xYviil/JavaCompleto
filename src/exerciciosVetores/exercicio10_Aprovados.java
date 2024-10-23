/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando os aprovados aqueles cuja média das notas seja maior ou
igual a 6 (seis). */

package exerciciosVetores;

import entities.Aprovados;

import java.util.Scanner;

public class exercicio10_Aprovados {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        String nome;
        double nota1, nota2;

        System.out.println("Quantos alunos serão digitados?");
        n = sc.nextInt();
        Aprovados [] vect = new Aprovados[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite nome do " + (i+1) + "o aluno:");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.println("Digite a primeira nota do " + (i+1) + "o aluno:");
            nota1 = sc.nextDouble();
            System.out.println("Digite a segunda nota do " + (i+1) + "o aluno:");
            nota2 = sc.nextDouble();
            vect[i] = new Aprovados(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            if (vect[i].aprovado()) {
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();


    }
}

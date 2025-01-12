/* Em um portal de cursos online, cada usuário possui um código único,
representado por um número inteiro.

Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno
pode se matricular em quantos cursos quiser. Assim, o número total de alunos
de um instrutor não é simplesmente a soma dos alunos de todos os cursos que
ele possui, pois pode haver alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total
de alunos.

Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois
mostrar a quantidade total de alunos dele, conforme exemplo.*/

package Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio16_Set {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("Quantos estudantes estão fazendo o curso A?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Estudante " + (i+1) + ": ");
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.println();

        System.out.println("Quantos estudantes estão fazendo o curso B?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Estudante " + (i+1) + ": ");
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.println();

        System.out.println("Quantos estudantes estão fazendo o curso C?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Estudante " + (i+1) + ": ");
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de estudantes: " + total.size());

        sc.close();

    }
}

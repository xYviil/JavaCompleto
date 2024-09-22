/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 (primeiro trimestre vale 30 e o segundo e o terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno
 no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso de negativo, quantos pontos
 faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student
 para resolver esse problema!*/
package Exercicios;

import entities.Notas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Notas student = new Notas();
        System.out.println("Digite o nome do estudante:");
        student.nome = sc.next();
        System.out.println("Digite a nota do primeiro trimestre");
        student.nota1 = sc.nextDouble();
        System.out.println("Digite a nota do segundo trimestre");
        student.nota2 = sc.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre");
        student.nota3 = sc.nextDouble();

        if (student.nota1 > 30 || student.nota2 > 35 || student.nota3 > 35) {
            System.out.println("As notas digitadas superam o peso aceitável!");
            return;
        }

        if (student.somaNotas() >= 60) {
            System.out.println(student);
            System.out.println("PASS!");
        } else {
            double missing = 60 - student.somaNotas();
            System.out.println(student);
            System.out.println("FAILED!");
            System.out.printf("Faltaram %.2f PONTOS!%n", missing);

            sc.close();
        }



    }

}

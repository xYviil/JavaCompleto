/*Programa para ler dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário
(nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
(somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. */
package Exercicios;

import entities.Employee;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee dados = new Employee();
        System.out.println("Digite o nome do funcionário:");
        dados.nome = sc.next();
        System.out.println("Digite o salário bruto do " + dados.nome);
        dados.salarioBruto = sc.nextDouble();
        System.out.println("Digite o valor da taxa a ser descontado");
        dados.taxa= sc.nextDouble();
        System.out.println(dados);
        System.out.println("Digite a porcentagem de aumento desejada");
        double aumento = sc.nextDouble();
        dados.increaseSalary(aumento);
        System.out.println(dados);

//        System.out.println();
//        System.out.println("Nome: " + dados.nome + "\nSalário: " + dados.salarioBruto);
//        System.out.println("");

//        System.out.println("Digite a porcentagem desejada à adicionar ao salário do " + dados.nome);
//        double novoSalario = sc.nextFloat();
//        System.out.println(novoSalario);


        sc.close();

    }

}

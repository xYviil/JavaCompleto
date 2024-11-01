/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salário) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada. */

package Exercicios;

import entities.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6_Lista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Listas> list = new ArrayList<>();

        System.out.println("Quantas funcionários serão registrados?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i+1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.println("Esse id já existe! Tente novamente: ");
                System.out.print("Id: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();

            Listas func = new Listas(id, name, salary);

            list.add(func);
        }

        System.out.println();
        System.out.print("Digite o Id do funcionário que irá receber um aumento no salário: ");
        int idSalary = sc.nextInt();


        //Listas func = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        Integer pos = posicao(list,idSalary);
        if (pos == null) {
            System.out.println("Esse funcionário não existe!");
        } else {
            System.out.print("Digite a porcentagem:");
            double porcentagem = sc.nextDouble();
            list.get(pos).increasySalary(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Listas func : list)
            System.out.println(func);

        sc.close();
    }

    static Integer posicao(List<Listas> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    static boolean hasId (List<Listas> list, int id) {
        Listas func = list.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
        return func != null;
    }

}

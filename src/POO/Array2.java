package POO;

import entities.ArrayEntities;

import java.util.Scanner;

public class Array2 {
    public static void main (String[]args ) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Digite um valor para 'n': ");
        n = sc.nextInt();
        ArrayEntities [] vect = new ArrayEntities[n];

        for (int i = 0; i < vect.length; i ++) {
            System.out.println("Digite um nome:");
            String name = sc.next();
            System.out.println("Digite o preço:");
            double price = sc.nextDouble();
            vect[i] = new ArrayEntities(name, price);
        }

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double media = soma / vect.length;

        System.out.printf("Média de preços = R$%.2f%n", media);

        sc.close();

    }
}

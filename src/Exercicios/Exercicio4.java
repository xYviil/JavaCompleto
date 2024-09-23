/*Fazer um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
Informar quantos reais a pessoa vai pagar pelos dolares, cosiderando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dolar.*/

package Exercicios;

import util.CurrencyConverter;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConverter dolar = new CurrencyConverter();

        System.out.println("Digite a cotação atual do dolar:");
        dolar.valorDolar = sc.nextDouble();
        System.out.println("Digite a quantidade de dolares você deseja adquirir:");
        dolar.compraDolar = sc.nextDouble();
        System.out.printf("O valor a ser pago é de: R$ %.2f%n", dolar.valorPago());

        sc.close();
    }

}

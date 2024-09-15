/* Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor
de sua área, perímetro e diagonal. */

package Exercicios;

import entities.Rectangle;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();
        System.out.println("Digite o valor da altura do retângulo:");
        retangulo.altura = sc.nextDouble();
        System.out.println("Digite o valor da largura do retângulo:");
        retangulo.largura = sc.nextDouble();

        System.out.printf("area=%.2f%n perímetro=%.2f%n diagonal=%.3f ",retangulo.area(),retangulo.perimetro(), retangulo.diagonal());

        sc.close();

    }
}

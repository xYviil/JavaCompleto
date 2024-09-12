package POO;

import entities.Triangle;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Entre com as medidas do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p- x.c));

         p = (y.a +y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p- y.c));

        System.out.printf("Área do triangulo X: %.4f%n", areaX);
        System.out.printf("Área do triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }

        sc.close();
    }

}

package POO;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {

        double xA, xB, xC, yA, yB, yC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as medidas do triângulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p- xC));

         p = (yA +yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p- yC));

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

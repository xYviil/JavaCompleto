package Exercicios;

import java.util.Scanner;

public class MembroEstatico1 {

    public static final double PI = 3.14159;

    public static void  main (String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius;

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

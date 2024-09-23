package POO;

import util.Calculator;
import java.util.Scanner;

public class MembroEstatico1 {

    public static void  main (String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius;

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f", Calculator.PI);

        sc.close();
    }

}

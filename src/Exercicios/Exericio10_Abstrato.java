package Exercicios;

import entities.Circle;
import entities.Rectangle2;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exericio10_Abstrato {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i+1) + " data: " );
            System.out.print("Rectantle or Circle? (R/C)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/RED/BLUE): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle2(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape areas:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f",shape.area()));
        }

        sc.close();

    }
}

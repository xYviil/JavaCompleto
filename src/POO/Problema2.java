package POO;

import entities.Stock;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock product = new Stock();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);
        System.out.println("Updated data: " + product);

        //System.out.printf("Name= %s%nPrice = %.2f%nQuantity = %d%n",product.name, product.price, product.quantity);

        sc.close();

    }
}

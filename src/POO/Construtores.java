package POO;

import entities.Product;

import java.util.Scanner;

public class Construtores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
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

        sc.close();
    }
}

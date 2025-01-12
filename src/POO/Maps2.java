package POO;

import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.);
        Product p2 = new Product("Notebook", 1200);
        Product p3 = new Product("Tablet", 400);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("TV", 900);

        System.out.println("Contém a chave 'ps': " + stock.containsKey(ps));

        sc.close();

    }

}

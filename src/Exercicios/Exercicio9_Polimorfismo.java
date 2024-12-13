package Exercicios;

import entities.ImportedProduct;
import entities.Product2;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9_Polimorfismo {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Product2> list = new ArrayList<>();

        System.out.println("Digite o numero de produtos:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do produto #" + (i+1) + ":" );
            System.out.println("Comum, usado ou importado? (c/u/i)?");
            char type = sc.next().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Preço: ");
            double price = sc.nextDouble();
            if (type == 'c') {
                list.add(new Product2(name, price));
            } else if (type == 'u') {
                System.out.println("Data de fabricação (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.println("Taxa de importação: ");
                double customsFee = sc.nextDouble();
                list.add (new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");
        for (Product2 prod : list) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}

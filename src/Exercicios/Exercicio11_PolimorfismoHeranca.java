package Exercicios;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11_PolimorfismoHeranca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List <TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.println("Enter the number of taxpayers:");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("Taxpayer #" + (i+1) + " data:");
            System.out.println("Inidiviual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (type == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Individual x = new Individual(name, anualIncome, healthExpenditures);
                list.add(x);
            } else {
                System.out.println("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                Company y = new Company(name, anualIncome, numberOfEmployees);
                list.add(y);
            }
        }

        System.out.println();
        System.out.println("Taxes paid:");
        for (TaxPayer tp: list) {
            System.out.println(tp.getName() + ": & " + String.format("%.2f", tp.tax()));
        }

        double sum = 0;
        for (TaxPayer tp: list) {
            sum+= tp.tax();
        }

        System.out.println("Total taxes: $ " + String.format("%.2f", sum));
        sc.close();

    }
}

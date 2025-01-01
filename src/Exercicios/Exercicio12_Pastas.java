package Exercicios;

import entities.ProductPastas;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12_Pastas {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<ProductPastas> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);

        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Invalid file path. Please check the input.");
            sc.close();
            return;
        }

        String sourceFolderStr = sourceFile.getParent();
        String outFolderStr = sourceFolderStr + File.separator + "out";

        boolean success = new File(outFolderStr).mkdir();
        if (success) {
            System.out.println("Output folder created at: " + outFolderStr);
        } else {
            System.out.println("Output folder already exists or could not be created.");
        }

        String targetFileStr = outFolderStr + File.separator + "summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {

                String[] fields = itemCsv.split(";");
                if (fields.length != 3) {
                    System.out.println("Invalid line format: " + itemCsv);
                    itemCsv = br.readLine();
                    continue;
                }

                String name = fields[0];
                double price;
                int quantity;
                try {
                    price = Double.parseDouble(fields[1]);
                    quantity = Integer.parseInt(fields[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid numeric value in line: " + itemCsv);
                    itemCsv = br.readLine();
                    continue;
                }

                list.add(new ProductPastas(name, price, quantity));
                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (ProductPastas item : list) {
                    bw.write(item.getName() + ";" + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println("File created successfully: " + targetFileStr);

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
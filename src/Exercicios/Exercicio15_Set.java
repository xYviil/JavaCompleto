package Exercicios;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio15_Set {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" "); // separa e pega os valores por espaço
                String username = fields[0]; // recebe a primeira coluna de valores da tabela
                Date moment = Date.from(Instant.parse(fields[1])); // segunda coluna de valores

                set.add(new LogEntry(moment, username));

                line = br.readLine();
            }
            System.out.println("Total user: " + set.size());

        } catch(IOException e ) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }

}

/* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos
identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N
representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10).
Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar
o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9).
Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório
de todas as ocupações do pensionato, por ordem de quarto, conforme exemplo. */

package exerciciosVetores;

import entities.Pensionato;

import java.util.Scanner;

public class exercicio12_Pensionato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pensionato[] vect = new Pensionato[10];

        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        // Verifica se o número de quartos é válido
        if (n < 1 || n > 10) {
            System.out.println("Número de quartos deve ser entre 1 e 10.");
            sc.close();
            return;
        }

        for (int i = 0; i < n; i++) { // Usa n para controlar o loop
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine(); // Limpa o buffer
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto (0-9): ");
            int quarto = sc.nextInt();

            // Verifica se o quarto está vago
            if (quarto < 0 || quarto >= 10 || vect[quarto] != null) {
                System.out.println("Quarto inválido ou já ocupado. Tente novamente.");
                i--; // Decrementa para repetir a entrada
            } else {
                vect[quarto] = new Pensionato(nome, email);
            }
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }
        sc.close();
    }
}
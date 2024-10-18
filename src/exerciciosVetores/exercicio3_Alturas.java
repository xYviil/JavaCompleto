/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.  */

package exerciciosVetores;

import entities.Alturas;
import java.util.Scanner;

public class exercicio3_Alturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.println("Quantas pessoas serão digitadas?");
        n = sc.nextInt();
        Alturas [] vect = new Alturas[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite os dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Alturas(nome, idade, altura);
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vect[i].getAltura();
        }

        media = soma / n;

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16 ) {
                cont++;
            }
        }

        double porcentagem = cont * 100.0 / n;

        System.out.printf("Altura média:%.2f%n", media);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%% \n", porcentagem);

        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16 ) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}

package exerciciosVetores;

import entities.DadosPessoa;

import java.util.Scanner;

public class exercicio11_DadosPessoa {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoa serão digitadas?");
        int n = sc.nextInt();
        DadosPessoa [] vect = new DadosPessoa[n];

        double altura;
        char sexo;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Altura da " + (i + 1) + "ª pessoa:");
            altura = sc.nextDouble();
            System.out.println("Gênero da " + (i + 1) + "ª pessoa (M/F): ");
            sexo = sc.next().charAt(0);
            vect[i] = new DadosPessoa(altura, sexo);
        }

        double menorAltura = vect[0].getAltura();
        double maiorAltura = vect[0].getAltura();
        double somaAlturaMulheres = 0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        for (int i = 0; i < vect.length; i++) {
            double alturaAtual = vect[i].getAltura();
            char sexoAtual = vect[i].getSexoPessoa();

            if (alturaAtual > maiorAltura) {
                maiorAltura = alturaAtual;
            }
            if (alturaAtual < menorAltura) {
                menorAltura = alturaAtual;
            }

            if (sexoAtual == 'F' || sexoAtual == 'f') {
                somaAlturaMulheres += alturaAtual;
                quantidadeMulheres++;
            } else if (sexoAtual == 'M' || sexoAtual == 'm') {
                quantidadeHomens++;
            }
        }

        double mediaAlturaMulheres = (quantidadeMulheres > 0) ? somaAlturaMulheres / quantidadeMulheres : 0;

        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        if (quantidadeMulheres > 0) {
            System.out.printf("Média de altura das mulheres: %.2f\n", mediaAlturaMulheres);
        } else {
            System.out.println("Não há mulheres no grupo.");
        }
        System.out.println("Número de homens: " + quantidadeHomens);

        sc.close();
    }

}

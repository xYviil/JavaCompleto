/*Programa para cadastrar uma conta bancária informando o número da conta, o titular e o valor de depósito inicial.
Esse dinheiro do depósito não é obrigatório, caso nao aconteca, o valor deve ser 0.

Uma vez que uma conta for aberta, o número da conta não poderá ser alterado. Já o nome do titular da conta sim.

 Por fim, o saldo da conta não poderá ser alterado livremente. Precisa de um mecanismo para proteger que isso aconteça.
 O saldo só poderá aumentar por depósitos e diminuir por saques! Para cada saque realizado, o banco irá cobrar uma taxa de $5,00.
 A conta poderá ficar com saldo negativo.

 Deve ser feito um programa que realize o cadastro da conta, dando a opçao de querer ou não realizar um depósito inicial.
 Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação!!*/

package Exercicios;

import entities.BankAccount;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
        int numberAccount = sc.nextInt();
        System.out.println("Digite o seu nome:");
        String nameAccount = sc.next();
        System.out.println("Deseja realizar um primeiro depósito? s/n");
        String yesOrNot = sc.next();
        double initialValue;
        switch (yesOrNot) {
            case "s":
                System.out.println("Digite o valor à ser depositado!");
                initialValue = sc.nextDouble();
                break;
            case "n":
                initialValue = 0;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        BankAccount bankAccount = new BankAccount(numberAccount, nameAccount, initialValue);

        System.out.println(bankAccount);
        System.out.println();
        System.out.println("Digite o valor do depósito:");
        double deposit = sc.nextDouble();
        bankAccount.deposit(deposit);
        System.out.println(bankAccount);
        System.out.println("Digite o valor do saque:");
        double withdraw = sc.nextDouble();
        bankAccount.withdraw(withdraw);
        System.out.println(bankAccount);;

        sc.close();

    }
}

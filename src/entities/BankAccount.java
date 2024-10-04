package entities;

public class BankAccount {

    private int numberAccount;
    private String nameAccount;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int numberAccount, String nameAccount, double balance) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.balance = balance;
    }

    public void deposit (double depositValue) {
        balance += depositValue;
    }

    public void withdraw (double withdrawValue) {
        balance -= withdrawValue + 5;
    }


    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Dados da conta:%nConta: %d%nTitular: %s%nValor em conta: R$%.2f%n",getNumberAccount(), getNameAccount(), getBalance());
    }
}

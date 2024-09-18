package entities;

public class Employee {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public double netSalary(double salarioBruto) {
        return salarioBruto - taxa;
    }

    public String toString() {
        return String.format("%s $ %.2f ", nome, (netSalary((salarioBruto))));
    }

    public void increaseSalary(double percentage) {
        double aumento = salarioBruto * (percentage / 100);
        salarioBruto += aumento;
    }
}



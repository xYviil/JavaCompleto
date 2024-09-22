package entities;

public class Notas {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double somaNotas() {
        return nota1 + nota2 + nota3;
    }

    public String toString() {
        return nome + "\nNota final = " + String.format("%.2f",somaNotas());
    }


}



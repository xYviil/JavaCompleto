package entities;

public class DadosPessoa {

    private final double altura;
    private final char sexoPessoa;

    public DadosPessoa(double altura, char sexoPessoa) {
        this.altura = altura;
        this.sexoPessoa = sexoPessoa;
    }

    public double getAltura() {
        return altura;
    }

    public char getSexoPessoa() {
        return sexoPessoa;
    }
}

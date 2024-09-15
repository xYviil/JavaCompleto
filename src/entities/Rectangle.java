package entities;

public class Rectangle {

    public double altura;
    public double largura;


    public float area() {
        return (float) (altura * largura);
    }

    public float perimetro() {
        return (float) ((altura * 2) + (largura * 2));
    }

    public float diagonal() {
        float diag = (float) (Math.pow(altura, 2) + Math.pow(largura, 2));
        return (float) Math.sqrt(diag);
    }
    }




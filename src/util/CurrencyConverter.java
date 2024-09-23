package util;

public class CurrencyConverter {

    public double valorDolar;
    public double compraDolar;
    public static double IOF = 6;


    public double valorPago(){
        double reais = valorDolar * compraDolar;
        return reais * (IOF / 100) + reais;
    }



}

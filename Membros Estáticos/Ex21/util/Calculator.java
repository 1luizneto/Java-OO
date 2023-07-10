package util;

public class Calculator {
    public static double CurrencyConverter(double valor, double dolar) {
        return ((valor * 0.06) + valor) * dolar;
    }
}

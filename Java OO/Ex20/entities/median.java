package entities;

public class median {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public String verifica(double media) {
        String resultado;

        if (media >= 60) resultado = "\nPASS";
        else {
            double faltando = 60 - media;
            resultado = "\nFAILED"
                    + "\nMISSING "
                    + String.format("%.2f", faltando)
                    + " POINTS";
        }

        return resultado;
    }

    public double total() {
        return nota1 + nota2 + nota3;
    }

    public String toString() {
        return "FINAL GRADE = "
                + String.format("%.2f", total())
                + verifica(total());
    }
}

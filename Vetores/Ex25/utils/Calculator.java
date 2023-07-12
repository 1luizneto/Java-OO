package utils;

public class Calculator {

    private String name;
    private int idade;
    private double altura;

    public Calculator(String name, int idade, double altura) {
        setName(this.name = name);
        setIdade(this.idade = idade);
        setAltura(this.altura = altura);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

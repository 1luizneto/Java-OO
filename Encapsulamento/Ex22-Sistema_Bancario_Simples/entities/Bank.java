package entities;

import java.util.Objects;

public class Bank {
    private int numConta;
    private String name;
    private double saldo;

    public Bank() {
    }

    public Bank(int numConta, String name) {
        setNumConta(numConta);
        setName(name);
    }

    public Bank(int numConta, String name, double saldo) {
        setNumConta(numConta);
        setName(name);
        setSaldo(saldo);
    }

    public Bank(int numConta, String name, double saldo, String option) {
        setNumConta(numConta);
        setName(name);
        if (Objects.equals(option, "y")){
            setSaldo(saldo);
        } else {
            setSaldo(0);
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public void deposit(double valor) {
        double saldo = getSaldo();
        saldo += (valor >= 0) ? valor : 0;
        setSaldo(saldo);
    }

    public void withdraw(double valor) {
        double saldo = getSaldo();

        saldo -= (valor >= 0) ? valor + 5 : 0;
        setSaldo(saldo);
    }

    @Override
    public String toString() {
        return "\nAccount data:\n" +
                "Account " + getNumConta() +
                ", Holder: " + getName() +
                ", Balance $ " + String.format("%.2f", saldo);
    }
}

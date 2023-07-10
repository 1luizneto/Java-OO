package application;


import entities.Bank;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        String escolha = sc.nextLine();

        double saldo = 0;

        if (Objects.equals(escolha, "y")) {
            System.out.print("Enter initial deposit value: ");
            saldo = sc.nextDouble();
        }

        Bank conta = new Bank(numConta, name, saldo, escolha);
        System.out.println(conta);

        System.out.print("\nEnter deposit value: ");
        saldo = sc.nextDouble();
        conta.deposit(saldo);
        System.out.println(conta);

        System.out.print("\nEnter withdraw value: ");
        saldo = sc.nextDouble();
        conta.withdraw(saldo);
        System.out.println(conta);


        sc.close();


    }
}

package application;

import entiteis.Company;
import entiteis.Individual;
import entiteis.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char esc = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            switch (esc){
                case 'i' -> {
                    System.out.print("Health expenditures: ");
                    double healtExpenditures = sc.nextDouble();
                    list.add(new Individual(name, anualIncome, healtExpenditures));
                }
                case 'c' -> {
                    System.out.print("Number of employees: ");
                    int numberOfEmployees = sc.nextInt();
                    list.add(new Company(name, anualIncome, numberOfEmployees));
                }
            }
        }

        System.out.println("\nTAXES PAID:");
        double sum = 0.0;
        for (TaxPayer x : list) {
            System.out.printf("%s: $ %.2f%n", x.getName() ,x.tax());
            sum += x.tax();
        }

        System.out.printf("\n TOTAL TAXES: $ %.2f", sum);

        sc.close();
    }
}

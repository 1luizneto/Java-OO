package application;


import entities.employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee func;
        func = new employee();

        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();

        System.out.println("\nEmployee: " + func);

        System.out.print("\nWhich percentage to increase salary? ");
        double taxa = sc.nextDouble();
        func.grossSalary += func.increaseSalary(taxa);

        System.out.println("\nUpdate data: " + func);

        sc.close();
    }
}

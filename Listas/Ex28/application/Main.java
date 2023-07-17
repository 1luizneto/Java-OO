package application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quant = sc.nextInt();
        sc.nextLine();

        List<Employees> list = new ArrayList<>();

        for (int i = 0; i < quant; i++) {
            System.out.println("\nEmplyoee #" + (i +1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employees func = new Employees(id, name, salary);

            list.add(func);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idVerific = sc.nextInt();

        Employees result = list.stream().filter( x -> x.getId() == idVerific).findFirst().orElse(null);

        if ( result == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            result.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        sc.close();
    }

}

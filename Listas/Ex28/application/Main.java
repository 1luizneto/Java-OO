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

        List<Employees> list = new ArrayList<>();

        System.out.print("How many employess will be registeres? ");
        int rep = sc.nextInt();

        for (int i = 0; i < rep; i++) {

            System.out.println();
            System.out.println("Emplyoee #" + (i+1) + ":");
            System.out.print("Id: ");
			int id = sc.nextInt();
            while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
            System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);

            list.add(emp);
        }

        System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();

        Employees emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
		System.out.println("List of employees:");
		for (Employees e : list) {
			System.out.println(e);
		}

        sc.close();
    }

    public static boolean hasId(List<Employees> list, int id){
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

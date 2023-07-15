package application;

import entities.Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int quant = sc.nextInt();
        sc.nextLine();

        Hotel[] hotel = new Hotel[10];

        for (int i = 0; i < quant; i++) {
            System.out.printf("\nRent #%d%n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            hotel[room] = new Hotel(name, email, room);
        }

        System.out.println("\nBusy rooms:");

        for (Hotel i : hotel){
            if (i != null) System.out.println(i.getQuarto() + ": " + i.getName() + ", " + i.getEmail());
        }
    }
}

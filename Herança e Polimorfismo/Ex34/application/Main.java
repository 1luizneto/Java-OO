package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char esc = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (esc) {
                case 'i' -> {
                    System.out.print("Customs fee: ");
                    double costomsFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, costomsFee));
                }
                case 'u' -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date date = sdf.parse(sc.next());
                    list.add(new UsedProduct(name, price, date));
                }
                default -> list.add(new Product(name, price));
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product x : list) {
            System.out.println(x.priceTag());
        }
        sc.close();
    }
}

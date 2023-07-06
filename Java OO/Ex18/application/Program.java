package application;

import entities.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rectangle retangulo;
        retangulo = new rectangle();

        System.out.println("Enter rectangle width and height:");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        double area, perimeter, diagonal;

        area = retangulo.area();
        perimeter = retangulo.perimeter();
        diagonal = retangulo.diagonal();

        System.out.println(retangulo);

        sc.close();
    }
}

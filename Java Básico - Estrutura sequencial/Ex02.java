import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, area, pi;
        pi = 3.14159;

        raio = sc.nextDouble();
        sc.nextLine();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);
        sc.close();

    }
}

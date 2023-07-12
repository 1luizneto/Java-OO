import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        System.out.print("VALORES = ");
        for (double j : vect){
            sum += j;
            System.out.printf("  %.1f", j);
        }

        System.out.println("\nSOMA = " + sum);
        System.out.println("MEDIA = " + sum / vect.length);

        sc.close();

    }
}

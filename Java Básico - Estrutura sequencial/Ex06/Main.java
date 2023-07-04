import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3, tri, cir, tra, qua, retan;


        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        tri = (num1 * num3) / 2;
        cir = 3.14159 * Math.pow(num3, 2);
        tra = ((num1 + num2) * num3) / 2;
        qua = num2 * num2;
        retan = num1 * num2;

        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", cir);
        System.out.printf("TRAPEZIO: %.3f\n", tra);
        System.out.printf("QUADRADO: %.3f\n", qua);
        System.out.printf("RETANGULO: %.3f\n", retan);
    }
}

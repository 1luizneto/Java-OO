import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4, resultado;

        num1 = sc.nextInt();
        sc.nextLine();
        num2 = sc.nextInt();
        sc.nextLine();
        num3 = sc.nextInt();
        sc.nextLine();
        num4 = sc.nextInt();
        sc.nextLine();

        resultado = (num1 * num2 - num3 * num4);

        System.out.printf("DIFERENCA = %d", resultado);

    }
}

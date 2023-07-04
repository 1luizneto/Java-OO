import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        num1 = sc.nextInt();
        sc.nextLine();
        num2 = sc.nextInt();
        sc.nextLine();

        soma = num1 + num2;

        System.out.println("Soma = " + soma);

        sc.close();
    }
}

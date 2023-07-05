import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, multiplo;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) System.out.printf("Sao Multiplos");
        else System.out.printf("Nao sao Multiplos");


    }
}

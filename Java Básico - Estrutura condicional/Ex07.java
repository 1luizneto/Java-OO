import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        if ( num >= 0) System.out.printf("NAO NEGATIVO");
        else System.out.printf("NEGATIVO");
    }
}

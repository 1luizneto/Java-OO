import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        senha = sc.nextInt();
        sc.nextLine();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Acesso Permitido");
        sc.close();
    }
}

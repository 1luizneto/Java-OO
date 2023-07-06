import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        int x;

        x = sc.nextInt();
        sc.nextLine(); // ajeitar o problema de quebra de linha 
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /*
        String x;
        int y;
        double z;
        char a;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        a = sc.next().charAt(0);
        System.out.println("Vc digitou: " + a);
         */
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0 ; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("NUMEROS PARES");
        for (int j=0 ; j<vect.length; j++){
            if (vect[j] % 2 == 0) {
                count += 1;
                System.out.printf("  %d", vect[j]);
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d", count);

        sc.close();

    }
}

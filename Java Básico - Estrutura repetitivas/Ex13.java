import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, escolha;

        escolha = sc.nextInt();
        sc.nextLine();

        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }
            escolha = sc.nextInt();
            sc.nextLine();
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}

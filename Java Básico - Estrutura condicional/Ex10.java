import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora1 = 24, hora2 = 24, total;

        hora1 -= sc.nextInt();
        hora2 -= sc.nextInt();

        if (hora1 > hora2) {
            total = hora1 - hora2;
            System.out.printf("O JOGO DUROU %d HORA(S)", total);
        }
        else if (hora1 < hora2) {
            total = (24 - hora2) + hora1;
            System.out.printf("O JOGO DUROU %d HORA(S)", total);
        } else if (hora1 == hora2){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }









    }
}

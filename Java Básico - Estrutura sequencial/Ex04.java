import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int matricula, horasTrabalhadas;
        double valorHora, salario;

        matricula = sc.nextInt();
        sc.nextLine();
        horasTrabalhadas = sc.nextInt();
        sc.nextLine();
        valorHora = sc.nextDouble();
        sc.nextLine();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", matricula, salario);

        sc.close();
    }
}

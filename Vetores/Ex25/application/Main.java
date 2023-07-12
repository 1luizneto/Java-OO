package application;

import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitados? ");
        int n = sc.nextInt();

        Calculator[] vect = new Calculator[n];

        for (int i=0; i< vect.length; i++){
            System.out.printf("Dados da %da pessoa: ", i+1);
            System.out.print("\nNome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Calculator(name, idade, altura);
        }

        double avg = 0.0;
        int menor = 0;
        for (Calculator i : vect){
            avg += i.getAltura();
            if (i.getIdade() < 16) {
                menor++;
            }
        }


        System.out.printf("\nAltura média: %.2f%n",avg / vect.length);
        System.out.println("Pessoas com menos de 16 anos: " + 100 * (menor / vect.length) + "%");
        for (Calculator j : vect){
            if (j.getIdade() < 16) System.out.println(j.getName());
        }

        sc.close();

    }
}

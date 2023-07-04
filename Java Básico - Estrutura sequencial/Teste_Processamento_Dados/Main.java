public class Main {
    public static void main(String[] args) {

        /* Sem conversão
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = a / b;
        System.out.println(resultado);
         */

        /* Conversão dos tipos
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a/b;
        System.out.println(resultado);
         */

        /* Da erro
        double a;
        int b;

        a = 5.0;
        b = a;

        System.out.println(b);
         */

        // jeito certo!
        double a;
        int b;

        a = 5.0;
        b = (int) a;

        System.out.println(b);

    }
}

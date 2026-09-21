import java.util.Scanner;

public class EjeciciosDelCiclo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        // 1R
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }


        // 2R
        for (int n = 1; n <= 20; n++) {
            if (n != 11) {
                System.out.println(n);
            }
        }


        // 3R
        System.out.println("Ingrese un numero");
        int n = entrada.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        System.out.println(suma);


        // 4R
        System.out.println("Ingrese dos numeros");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        suma = 0;

        for (int i = numero1; i <= numero2; i++) {
            suma = suma + i;
        }

        System.out.println(suma);


        // 5R
        suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println(suma);


        // 6R
        suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el numero: " + i);
            int numero = entrada.nextInt();

            suma = suma + numero;
        }

        double promedio = (double) suma / 5;

        System.out.println(promedio);


        // 7R
        for (int i = 0; i <= 50; i++) {
            int resultado = 3 * i;
            System.out.println("3 x " + i + " = " + resultado);
        }


        // 8R
        suma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la nota: " + i);
            int numero = entrada.nextInt();

            suma = suma + numero;
        }

        double notas = (double) suma / 3;

        System.out.println(notas);


        // 9R
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println(n + " = " + factorial);


        // 10R
        suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero: " + i);
            int numero = entrada.nextInt();

            suma = suma + numero;
        }

        promedio = (double) suma / 10;

        System.out.println(promedio);


    }
}












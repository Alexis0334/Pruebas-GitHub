import java.util.Scanner;

public class EjeciciosDelWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        // Ejercicio 1
        System.out.println("Ingrese un numero");
        int n = entrada.nextInt();
        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }


        // Ejercicio 2
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();

        i = 1;
        int suma = 0;

        while (i <= n) {
            suma = suma + i;
            System.out.println(i + " = " + suma);
            i++;
        }


        // Ejercicio 3
        i = 1;
        int limite = 50;
        int multiplicacion = 10;

        while (i <= limite) {
            int fin = multiplicacion * i;
            System.out.println(i + " = " + fin);
            i++;
        }


        // Ejercicio 4
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();

        i = 1;

        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }


        // Ejercicio 5
        entrada.nextLine();

        String opcion = "";

        while (!opcion.equals("S")) {
            System.out.println("Desea salir, ¿S/N?");
            opcion = entrada.nextLine();
        }


        // Ejercicio 6
        suma = 0;
        i = 1;

        while (i <= 10) {
            System.out.println("Ingrese su promedio:");
            int numero = entrada.nextInt();

            suma = suma + numero;
            i++;
        }

        double promedio = (double) suma / 10;

        System.out.println(promedio);


        // Ejercicio 7
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();

        suma = 0;
        i = 0;

        while (n != 0) {
            suma = suma + n;
            i++;

            System.out.println("Ingrese otro numero");
            n = entrada.nextInt();
        }


        // Ejercicio 8
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();

        i = 1;

        while (i <= n) {
            int resultado = i * n;
            System.out.println(resultado);
            i++;
        }












    }
}

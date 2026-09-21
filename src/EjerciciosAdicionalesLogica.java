import java.util.Scanner;

public class EjerciciosAdicionalesLogica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // PARTE 1 - CONDICIONALES


        System.out.println("----- EJERCICIOS DE CONDICIONALES -----");


        // Ejercicio 1
        System.out.println("\nEjercicio 1");
        System.out.println("Ingrese su genero favorito de pelicula:");
        String genero = leer.nextLine();

        if (genero.equalsIgnoreCase("terror")) {
            System.out.println("Te gustan las peliculas de miedo");
        } else {
            System.out.println("No te gustan las peliculas de miedo");
        }


        // Ejercicio 2
        System.out.println("\nEjercicio 2");
        System.out.println("Ingrese una palabra:");
        String palabra = leer.nextLine();

        char letra = palabra.charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La primera letra es mayuscula");
        } else {
            System.out.println("La primera letra es minuscula");
        }


        // Ejercicio 3
        System.out.println("\nEjercicio 3");
        System.out.println("Ingrese su correo electronico:");
        String correo = leer.nextLine();

        if (correo.contains("@")) {
            System.out.println("El correo parece valido");
        } else {
            System.out.println("El correo no parece valido");
        }


        // Ejercicio 4
        System.out.println("\nEjercicio 4");
        System.out.println("Ingrese la primera palabra:");
        String palabra1 = leer.nextLine();

        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = leer.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son diferentes");
        }


        // Ejercicio 5
        System.out.println("\nEjercicio 5");
        System.out.println("Ingrese una talla S, M o L:");
        String talla = leer.nextLine();

        if (talla.equals("S") || talla.equals("M") || talla.equals("L")) {
            System.out.println("La talla es valida");
        } else {
            System.out.println("La talla es invalida");
        }



        // PARTE 2 - CICLOS FOR

        System.out.println("\nEJERCICIOS DE CICLO FOR");


        // Ejercicio for 1
        System.out.println("\nEjercicio for 1");

        for (int i = 1; i <= 50; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }


        // Ejercicio for 2
        System.out.println("\nEjercicio for 2");

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }


        // Ejercicio for 3
        System.out.println("\nEjercicio for 3");

        int sumaPares = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                sumaPares = sumaPares + i;
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);


        // Ejercicio for 4
        System.out.println("\nEjercicio for 4");

        int negativos = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Ingrese el numero " + i + ":");
            int numero = leer.nextInt();

            if (numero < 0) {
                negativos = negativos + 1;
            }
        }

        System.out.println("Cantidad de numeros negativos: " + negativos);


        // Ejercicio for 5
        System.out.println("\nEjercicio for 5");

        for (int i = 1; i <= 20; i++) {

            if (i % 4 == 0) {
                System.out.println(i);
            }
        }


        // Ejercicio for 6
        System.out.println("\nEjercicio for 6");

        System.out.println("Cuantos numeros desea ingresar:");
        int n = leer.nextInt();

        int mayor = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("Ingrese un numero:");
            int numero = leer.nextInt();

            if (i == 1) {
                mayor = numero;
            }

            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);


        // Ejercicio for 7
        System.out.println("\nEjercicio for 7");

        int suma = 0;

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                suma = suma + i;
            }
        }

        System.out.println("La suma es: " + suma);


        // Ejercicio for 8
        System.out.println("\nEjercicio for 8");

        int aprobadas = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Ingrese una calificacion:");
            double nota = leer.nextDouble();

            if (nota >= 60) {
                aprobadas = aprobadas + 1;
            }
        }

        System.out.println("Cantidad de calificaciones aprobadas: " + aprobadas);


        // Ejercicio for 9
        System.out.println("\nEjercicio for 9");

        System.out.println("Ingrese el valor de n:");
        int numeroN = leer.nextInt();

        if (numeroN >= 1) {

            for (int i = 1; i <= numeroN; i++) {
                System.out.println(i + " positivo");
            }

        } else {

            for (int i = 1; i >= numeroN; i--) {

                if (i > 0) {
                    System.out.println(i + " positivo");
                } else if (i == 0) {
                    System.out.println(i + " es cero");
                } else {
                    System.out.println(i + " negativo");
                }
            }
        }


        // Ejercicio for 10
        System.out.println("\nEjercicio for 10");

        System.out.println("Ingrese otro valor de n:");
        int valorN = leer.nextInt();

        double promedio = (1 + valorN) / 2.0;

        System.out.println("El promedio es: " + promedio);

        for (int i = 1; i <= valorN; i++) {

            if (i > promedio) {
                System.out.println(i + " es mayor al promedio");
            }
        }


        // Ejercicio for 11
        System.out.println("\nEjercicio for 11");

        int diasCalurosos = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Ingrese la temperatura del dia " + i + ":");
            double temperatura = leer.nextDouble();

            if (temperatura > 30) {
                diasCalurosos = diasCalurosos + 1;
            }
        }

        System.out.println("Cantidad de dias calurosos: " + diasCalurosos);

        leer.close();
    }
}

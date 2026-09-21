import java.util.Scanner;


public class EjerciciosDelCondiciones {
    public static void main(String[] args) {

            Scanner leer = new Scanner(System.in);


            // Ejercicio 1
            System.out.print("Ingrese el primer angulo: ");
            int angulo1 = leer.nextInt();

            System.out.print("Ingrese el segundo angulo: ");
            int angulo2 = leer.nextInt();

            System.out.print("Ingrese el tercer angulo: ");
            int angulo3 = leer.nextInt();

            if (angulo1 + angulo2 + angulo3 == 180) {
                System.out.println("Si corresponde a un triangulo");
            } else {
                System.out.println("No corresponde a un triangulo");
            }


            // Ejercicio 2
            System.out.print("\nIngrese un numero: ");
            int numero = leer.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }


            // Ejercicio 3
            System.out.print("\nIngrese otro numero: ");
            int numero2 = leer.nextInt();

            if (numero2 % 5 == 0) {
                System.out.println("Es divisible entre 5");
            } else {
                System.out.println("No es divisible entre 5");
            }


            // Ejercicio 4
            System.out.print("\nIngrese un numero entre 1 y 15: ");
            int primo = leer.nextInt();

            if (primo == 2 || primo == 3 || primo == 5 || primo == 7 ||
                    primo == 11 || primo == 13) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }


            // Ejercicio 5
            System.out.print("\nIngrese el primer numero: ");
            int num1 = leer.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            int num2 = leer.nextInt();

            if (num1 > num2) {
                System.out.println("El mayor es: " + num1);
            } else if (num2 > num1) {
                System.out.println("El mayor es: " + num2);
            } else {
                System.out.println("Los numeros son iguales");
            }


            // Ejercicio 6
            leer.nextLine();

            System.out.print("\nIngrese un producto: ");
            String producto = leer.nextLine();

            if (producto.equalsIgnoreCase("lentejas") ||
                    producto.equalsIgnoreCase("arroz")) {

                System.out.println("El producto no paga IVA");

            } else if (producto.equalsIgnoreCase("vino") ||
                    producto.equalsIgnoreCase("crema")) {

                System.out.println("El producto si paga IVA");

            } else {
                System.out.println("Producto no encontrado");
            }

    }
}

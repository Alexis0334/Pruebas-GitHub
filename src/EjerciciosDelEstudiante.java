public class EjerciciosDelEstudiante {

    public static void main(String[] args) {

        // Ejercicio 1
        int capacidadAlmacen = 45000;
        long capacidadLong = capacidadAlmacen;
        double capacidadDecimal = capacidadLong;

        System.out.println("Ejercicio 1: " + capacidadDecimal);


        // Ejercicio 2
        double costoProducto = 1299.99;
        int parteEntera = (int) costoProducto;

        System.out.println("Ejercicio 2: " + parteEntera);


        // Ejercicio 3
        int sensorValor = 300;
        byte sensorByte = (byte) sensorValor;

        System.out.println("Ejercicio 3: " + sensorByte);


        // Ejercicio 4
        short piezas = 500;
        float pesoUnitario = 2.5f;
        float pesoTotal = piezas * pesoUnitario;

        System.out.println("Ejercicio 4: " + pesoTotal);


        // Ejercicio 5
        String serial = "L8";
        char digitoChar = serial.charAt(1);
        int digitoEntero = Character.getNumericValue(digitoChar);

        System.out.println("Ejercicio 5: " + digitoEntero);


        // Ejercicio 6
        String entradaServidor = "true";
        boolean estadoConexion = Boolean.parseBoolean(entradaServidor);

        System.out.println("Ejercicio 6: " + estadoConexion);


        // Ejercicio 7
        long entradaGrande = 2147483648L;

        boolean esValidoParaInt =
                entradaGrande <= Integer.MAX_VALUE &&
                        entradaGrande >= Integer.MIN_VALUE;

        System.out.println("Ejercicio 7: " + esValidoParaInt);


        // Ejercicio 8
        int numeroBase = 255;

        String enHexa = Integer.toHexString(numeroBase);
        String enBinario = Integer.toBinaryString(numeroBase);

        System.out.println("Ejercicio 8 Hexadecimal: " + enHexa);
        System.out.println("Ejercicio 8 Binario: " + enBinario);


        // Ejercicio 9
        double valorMedido = 47.85;
        int valorRedondeado = (int) (valorMedido + 0.5);

        System.out.println("Ejercicio 9: " + valorRedondeado);


        // Ejercicio 10
        Integer[] notas = {90, 85, 88};

        int sumaNotas = notas[0] + notas[1] + notas[2];
        double promedioFinal = (double) sumaNotas / notas.length;

        System.out.println("Ejercicio 10 Suma: " + sumaNotas);
        System.out.println("Ejercicio 10 Promedio: " + promedioFinal);


        // Ejercicio 11
        double resultadoDivision = 5.0 / 0.0;
        boolean esInfinito = Double.isInfinite(resultadoDivision);

        System.out.println("Ejercicio 11: " + esInfinito);


        // Ejercicio 12
        String saldoTexto = "$1,250.75";

        String textoLimpio = saldoTexto.replace("$", "").replace(",", "");
        double saldoNumerico = Double.parseDouble(textoLimpio);

        System.out.println("Ejercicio 12: " + saldoNumerico);


        // Ejercicio 13
        short nivelStock = 120;
        byte nivelByte = (byte) nivelStock;

        System.out.println("Ejercicio 13: " + nivelByte);


        // Ejercicio 14
        double temperaturaPrimitiva = 36.6;

        Double temperaturaWrapper = temperaturaPrimitiva;
        double retornoPrimitivo = temperaturaWrapper;

        System.out.println("Ejercicio 14 Wrapper: " + temperaturaWrapper);
        System.out.println("Ejercicio 14 Primitivo: " + retornoPrimitivo);


        // Ejercicio 15
        int idUsuario = 1045;
        boolean activo = true;

        String idTexto = String.valueOf(idUsuario);

        String registroCompleto =
                "ID: " + idTexto + " Activo: " + String.valueOf(activo);

        System.out.println("Ejercicio 15: " + registroCompleto);
    }
}
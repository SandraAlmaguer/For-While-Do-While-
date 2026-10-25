import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 8. Media de números positivos ---");
        double suma = 0;
        int contador = 0;
        double numero = 0;

        System.out.println("Ingrese números positivos (ingrese un número negativo para terminar):");
        while (true) {
            numero = scanner.nextDouble();
            if (numero < 0) {
                break;
            }
            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los " + contador + " números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
        scanner.close();
    }
}
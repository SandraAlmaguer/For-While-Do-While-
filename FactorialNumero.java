import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 1. Factorial de un número ---");
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);
        scanner.close();
    }
}
import java.util.Scanner;

public class SecuenciaCuadradosDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 11. Secuencia de cuadrados ---");
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        int i = 1;

        if (n >= 1) {
            System.out.println("Cuadrados desde 1 hasta " + n + ":");
            do {
                System.out.println(i + " al cuadrado = " + (i * i));
                i++;
            } while (i <= n);
        } else {
            System.out.println("Ingrese un número positivo válido.");
        }
        scanner.close();
    }
}
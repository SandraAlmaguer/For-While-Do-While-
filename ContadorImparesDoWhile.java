import java.util.Scanner;

public class ContadorImparesDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 10. Contador de números impares ---");
        System.out.print("Ingrese un número entero positivo: ");
        int limite = scanner.nextInt();
        int i = 1;

        if (limite >= 1) {
            System.out.println("Números impares hasta " + limite + ":");
            do {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= limite);
            System.out.println();
        } else {
            System.out.println("Por favor, ingrese un número entero positivo mayor o igual a 1.");
        }
        scanner.close();
    }
}
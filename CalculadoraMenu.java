import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';

        do {
            System.out.println("\n--- 9. Calculadora Básica ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Seleccione una opción (1-4): ");
            int opcion = scanner.nextInt();

            System.out.print("Ingrese el primer número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double n2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("Resultado: " + (n1 / n2));
                    } else {
                        System.out.println("Error: División entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        System.out.println("Calculadora finalizada.");
        scanner.close();
    }
}
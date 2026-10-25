import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 7. Vocales o consonantes (Termina con espacio) ---");
        char letra;

        while (true) {
            System.out.print("Ingrese una letra (o espacio para salir): ");
            String entrada = scanner.nextLine();
            if (entrada.isEmpty()) continue;
            letra = entrada.charAt(0);

            if (letra == ' ') {
                System.out.println("Programa finalizado.");
                break;
            }

            char lower = Character.toLowerCase(letra);
            if (!Character.isLetter(lower)) {
                System.out.println("No es una letra válida.");
                continue;
            }

            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println("Es una VOCAL.");
            } else {
                System.out.println("Es una CONSONANTE.");
            }
        }
        scanner.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento = 0;

        System.out.println("--- 6. Adivinar el número (1 al 100) ---");
        
        while (intento != numeroSecreto) {
            System.out.print("Ingrese su suposición: ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intente de nuevo.");
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intente de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinó el número correcto.");
            }
        }
        scanner.close();
    }
}
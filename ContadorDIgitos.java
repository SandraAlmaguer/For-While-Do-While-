
import java.util.Scanner;
public class ContadorDIgitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- 5. Contador de dígitos ---");
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int aux = Math.abs(numero);
        int digitos = 0;

        if (aux == 0) {
            digitos = 1;
        } else {
            while (aux > 0) {
                aux /= 10;
                digitos++;
            }
        }

        System.out.println("El número " + numero + " tiene " + digitos + " dígito(s).");
        scanner.close();
    }
}
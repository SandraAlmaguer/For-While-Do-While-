import java.util.Scanner;

public class SecuenciaAritmeticaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 12. Secuencia aritmética ---");
        System.out.print("Ingrese el primer número: ");
        int actual = scanner.nextInt();
        System.out.print("Ingrese la diferencia: ");
        int diferencia = scanner.nextInt();
        System.out.print("Ingrese el número máximo: ");
        int maximo = scanner.nextInt();

        System.out.println("Secuencia aritmética generada:");
        do {
            System.out.print(actual + " ");
            actual += diferencia;
        } while (actual <= maximo);
        
        System.out.println();
        scanner.close();
    }
}
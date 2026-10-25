import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 2. Conteo de números ---");
        System.out.print("¿Cuántos números desea ingresar?: ");
        int cantidad = scanner.nextInt();
        
        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = scanner.nextInt();
            if (num > 0) {
                mayoresCero++;
            } else if (num < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Mayores que 0: " + mayoresCero);
        System.out.println("Menores que 0: " + menoresCero);
        System.out.println("Iguales a 0: " + igualesCero);
        scanner.close();
    }
}
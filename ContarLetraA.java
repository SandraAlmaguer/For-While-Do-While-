import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 3. Contar letras 'a' en una palabra ---");
        System.out.print("Ingrese una palabra o texto: ");
        String texto = scanner.nextLine();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");
        scanner.close();
    }
}
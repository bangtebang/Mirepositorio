package src.main.java.tareas;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);
        String cadena = entradaEscaner.nextLine();

        try {
            if (cadena.trim().isEmpty()) {
                throw new IllegalArgumentException("La cadena no puede estar vacía");
            }
            if (!cadena.matches("[a-zA-Z ]+")) {
                throw new IllegalArgumentException("La cadena solo puede contener letras");
            }

            esPalindromo(cadena);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void esPalindromo(String cadena) {
        String resultado = "";
        cadena = cadena.replaceAll("\\s+", "");
        resultado = new StringBuilder(cadena).reverse().toString();
        if (cadena.equalsIgnoreCase(resultado)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
}
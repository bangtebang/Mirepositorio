package src.main.java.tareas;
import java.util.Scanner;
import java.util.ArrayList;
public class textoIngresado {
    public static void main(String[] args) {
        String texto=ingreseTexto();
        buscarCoincidencia(texto);

        }
    public static void buscarCoincidencia(String texto) {
        System.out.print("¿Qué letra quieres buscar?: ");
        Scanner entradaEscaner = new Scanner(System.in);
        char letraBuscar = entradaEscaner.nextLine().charAt(0);
        int contador = 0;
        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letraBuscar) {
                contador++;
                posiciones.add(i);
            }
        }
        if (contador == 0) {
            System.out.println("No se encontraron coincidencias de la letra '" + letraBuscar + "'.");
        }
        else {
            System.out.println("Se encontraron " + contador + " coincidencias de la letra '" + letraBuscar + "'.");
            System.out.println("Las posiciones donde se encontró la letra '" + letraBuscar + "' son: " + posiciones);
        }

    }

    public static String ingreseTexto() {
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = entradaEscaner.nextLine();
        if(texto.length()==0){
            System.out.println("no hay texto");
        }

        System.out.println("El texto ingresado tiene " + texto.length() + " letras.");
        return texto;
    }
}




package src.main.java.ayudantias;
import java.util.Scanner;
public class ayudantia6 {
    public static void main(String[] args) {
        String [][] coleccionDeLibros = new String[100][3];
        agregarLibro(coleccionDeLibros, "El Hobbit","J.R.R. Tolkien","Ed. Planeta");
        agregarLibro(coleccionDeLibros,"Cujo","Stephen King","Ed. Que susto");
        agregarLibro(coleccionDeLibros, "Un mundo feliz","Aldous Huxley","Ed.Zig-Zag");

        menu(coleccionDeLibros);
    }

    public static void menu(String [][] coleccionDeLibros) {
        imprimirMenu();
        int opcion = pedirOpcionMenu();
        switch (opcion) {
            case 1 -> menuAgregarLibro(coleccionDeLibros);
            case 2 -> menuBuscarLibro(coleccionDeLibros);
            case 3 -> System.out.println(100 - espaciosDisponibles(coleccionDeLibros));
            case 4 -> System.out.println(espaciosDisponibles(coleccionDeLibros));
            case 5 -> mostrarColeccion(coleccionDeLibros);
            case 6 -> System.out.println("Programa finalizado");
            default -> {
            System.out.println("Por favor ingrese un número válido");
            menu(coleccionDeLibros);
        }
    }}


    public static void imprimirMenu() {
        System.out.println("COLECCIÓN\n" +
                "1) Agregar libro \n" +
                "2) Buscar libro \n" +
                "3) Mostrar espacios usados \n" +
                "4) Mostrar espacios disponibles \n" +
                "5) Mostrar toda la colección \n" +
                "6) Salir");
    }

    private static void menuAgregarLibro(String [][] coleccionDeLibros) {
        if(espaciosDisponibles(coleccionDeLibros)>0) {
            System.out.println("Por favor ingrese el titulo");
            String titulo = pedirInput();

            System.out.println("Por favor ingrese el autor");
            String autor = pedirInput();

            System.out.println("Por favor ingrese la editorial");
            String editorial = pedirInput();

            agregarLibro(coleccionDeLibros, titulo, autor, editorial);
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public static void agregarLibro(String[][] coleccionDeLibros, String titulo,
                                    String autor, String editorial) {
        int indiceEspacioDisponible = 100 - espaciosDisponibles(coleccionDeLibros);
        coleccionDeLibros[indiceEspacioDisponible][0] = titulo;
        coleccionDeLibros[indiceEspacioDisponible][1] = autor;
        coleccionDeLibros[indiceEspacioDisponible][2] = editorial;
    }

    public static void menuBuscarLibro(String[][] coleccionDeLibros) {
        System.out.println("Por favor ingrese el titulo del libro que desea buscar.");
        String titulo = pedirInput();
        buscarLibro(coleccionDeLibros, titulo);
    }

    public static void buscarLibro(String [][] coleccionDeLibros, String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < 100; i++) {
            if (coleccionDeLibros[i][0] != null && coleccionDeLibros[i][0].equalsIgnoreCase(titulo)) {
                System.out.println("Título: " + coleccionDeLibros[i][0]);
                System.out.println("Autor: " + coleccionDeLibros[i][1]);
                System.out.println("Editorial: " + coleccionDeLibros[i][2]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro no se encuentra en la colección.");
        }
    }

    public static void mostrarColeccion(String [][] coleccionDeLibros) {
        System.out.println("Colección:");
        for(int i = 0;i<100;i++){
            if (coleccionDeLibros[i][0] != null) {
                System.out.println("Título: " + coleccionDeLibros[i][0]);
                System.out.println("Autor: " + coleccionDeLibros[i][1]);
                System.out.println("Editorial: " + coleccionDeLibros[i][2]);
                System.out.println();
            }
        }}
    public static int espaciosDisponibles(String[][] coleccionDeLibros) {
        int espaciosDisponibles = 0;
        for (int i = 0; i < coleccionDeLibros.length; i++) {
            if (coleccionDeLibros[i][0] == null) {
                espaciosDisponibles++;
            }
        }
        return espaciosDisponibles;
    }
    public static String pedirInput() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }
    public static int pedirOpcionMenu() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una opción del menú: ");
        int opcion = leer.nextInt();
        if (opcion < 1 || opcion > 6) {
            System.out.println("La opción ingresada no es válida. Intente nuevamente.");
            opcion = pedirOpcionMenu();
        }
        return opcion;
    }
}


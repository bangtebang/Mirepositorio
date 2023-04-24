package src.main.java.ayudantias;
import java.util.Scanner;
import java.util.Random;
public class ayudantia4 {
    public static void main(String[] args) {
        Random random = new Random();
        double[][] sismos = generarSismos(random);
        mostrarMenu(sismos);
        mostrarSismos(sismos);

    }

    private static double[][] generarSismos( Random random) {
        double[][] sismos = new double[31][24];
        for (int dia = 0; dia < 31; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                sismos[dia][hora] = 0.5 + (9.5 - 0.5) * random.nextDouble();
            }
        }
        return sismos;

    }

    private static void mostrarMenu( double[][] sismos) {
        System.out.println("\nBienvenido al registro de sismos\n");
        System.out.println("1. Intensidad, día y hora del sismo más intenso");
        System.out.println("2. Total de días en que se registraron sismos mayores o iguales a 5.5 grados");
        System.out.println("3. Alerta de escalada sísmica");
        System.out.println("4. Alerta de enjambre sísmico");
        System.out.println("5. Salir\n");
        int opcion = pedirOpcion();
        procesarOpcion(opcion,sismos);
    }

    private static int pedirOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una opción del menú: ");
        int opcion = scanner.nextInt();
        if (opcion < 1 || opcion > 5) {
            System.out.println("La opción ingresada no es válida. Intente nuevamente.");
            opcion = pedirOpcion();
        }
        return opcion;
    }

    private static void procesarOpcion(int opcion,double[][] sismos) {
        switch (opcion) {
            case 1:
                mostrarSismoIntenso(sismos);
                break;
            case 2:
                int contador2= sismosMayores(sismos);
                System.out.println("Los dias que se registraron sismos mayores o iguales a 5.5 fueron en total " + contador2 + " dias ");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("¡Gracias por utilizar sismos!");
                break;

        }
    }

    private static void mostrarSismoIntenso( double[][] sismos) {
        double maxsismo = 0;
        int diamaxsismo = 0;
        int horamaxsismo = 0;
        for (int dia = 0; dia < 31; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                if (sismos[dia][hora] > maxsismo) {
                    maxsismo = sismos[dia][hora];
                    diamaxsismo = dia + 1;
                    horamaxsismo = hora + 1;
                }
            }
        }
        System.out.println("El sismo más intenso fue de " + maxsismo + " grados, registrado el día " + diamaxsismo + " a las " + horamaxsismo + ":00 horas.");
    }

    private static int sismosMayores( double[][] sismos) {
        int contador=0;
        int contador2=0;
        for (int dia = 0; dia < 31; dia++) {
            if (contador>=1){
                contador2++;
                contador=0;
            }
            for (int hora = 0; hora < 24; hora++) {
                if (sismos[dia][hora] >= 5.5) {
                    contador++;
                }
            }
        }
        return contador2;
    }


    public static void mostrarSismos(double[][]sismos) {
        for (int x = 0; x < sismos.length; x++) {
            System.out.print("|");
            for (int y = 0; y < sismos[x].length; y++) {
                System.out.print(sismos[x][y]);
                if (y != sismos[x].length - 1) System.out.print("\t");
            }
            System.out.println("|");

        }
    }



}

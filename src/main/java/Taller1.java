package src.main.java;
import java.util.Scanner;
import java.util.Random;
public class Taller1 {
    public static void main(String[] args) {
        double [][]alumnos=matrizAlumnos();
        mostrarMenu(alumnos);

    }
    public static double[][] matrizAlumnos(){
        double[][] alumnos = new double[50][5];
        for (int i = 0; i<50; i++) {
            for (int j = 0; j<5; j++) {
                alumnos[i][j] =0;
            }
        }
        return alumnos;
    }
    public static void generarNota(double[][] alumnos){
        for (int i = 0; i<50; i++) {
            for (int j = 0; j<5; j++) {
                if (alumnos[i][j] ==0) {
                    alumnos[i][j+1] = (Math.random() * 6) + 1;
                    alumnos[i][j+2] = (Math.random() * 6) + 1;
                    alumnos[i][j+3] = (Math.random() * 6) + 1;
                    alumnos[i][j+4] = (Math.random() * 6) + 1;
                    alumnos[i][j+5] = (Math.random() * 6) + 1;
                    i=49;
                }
            }
        }
    }
    public static void alumnosAprueban(double[][] alumnos){
        int contadorAprueba=0;
        for (int i=0;i<50;i++) {
            double promedio = ((alumnos[i][0]) * 0.25 + (alumnos[i][1]) * 0.25 + (alumnos[i][2]) * 0.25 + (alumnos[i][3]) * 0.15 + (alumnos[i][4]) * 0.15);
            if (promedio >= 4.0) {
                contadorAprueba++;
            }
        }
        System.out.print(contadorAprueba+" alumnos aprueban ");
    }
    public static void alumnosExamen(double[][] alumnos){
        int contadorDaExamen=0;
        for (int i=0;i<50;i++) {
            double promedio = ((alumnos[i][0]) * 0.25 + (alumnos[i][1]) * 0.25 + (alumnos[i][2]) * 0.25 + (alumnos[i][3]) * 0.15 + (alumnos[i][4]) * 0.15);
            if (promedio >= 3.6 && promedio < 4.0) {
                contadorDaExamen++;
            }
        }
        System.out.print(contadorDaExamen+" alumnos dan examen");
    }
    public static void alumnosReprueban(double[][] alumnos){
        int contadorReprueba=0;
        for (int i=0;i<50;i++) {
            double promedio = ((alumnos[i][0]) * 0.25 + (alumnos[i][1]) * 0.25 + (alumnos[i][2]) * 0.25 + (alumnos[i][3]) * 0.15 + (alumnos[i][4]) * 0.15);
            if (promedio < 3.6 && promedio>=1) {
                contadorReprueba++;
            }
        }
        System.out.print(contadorReprueba+" alumnos reprueban");
    }
    public static void mostrarMatriz(double[][] alumnos) {
        for (int x = 0; x < alumnos.length; x++) {
                double promedio = ((alumnos[x][0]) * 0.25 + (alumnos[x][1]) * 0.25 + (alumnos[x][2]) * 0.25 + (alumnos[x][3]) * 0.15 + (alumnos[x][4]) * 0.15);
            System.out.print("|");
            for (int y = 0; y < alumnos[x].length; y++) {
                System.out.print(alumnos[x][y]);
                if (y != alumnos[x].length - 1) System.out.print("\t");
                if (alumnos[x][y]==0){
                    x=50;
                }
            }             System.out.println("|"+promedio);
            }
        }
    private static void mostrarMenu(double[][]alumnos) {
        System.out.println("\nBienvenido al registro de notas\n");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Estudiantes Aprobados");
        System.out.println("3. Estudiantes Reprobados");
        System.out.println("4. Estudiantes con Examen");
        System.out.println("5. Mostrar nota de estudiantes");
        System.out.println("6. Salir\n");
        int opcion = pedirOpcion();
        procesarOpcion(opcion,alumnos);
    }
    private static int pedirOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una opción del menú: ");
        int opcion = scanner.nextInt();
        if (opcion < 1 || opcion > 6) {
            System.out.println("La opción ingresada no es válida. Intente nuevamente.");
            opcion = pedirOpcion();
        }
        return opcion;
    }

    private static void procesarOpcion(int opcion,double[][] alumnos) {
        switch (opcion) {
            case 1: generarNota(alumnos);
                System.out.println("se agrego un alumno");
                break;
            case 2:alumnosAprueban(alumnos);
                break;
            case 3:alumnosReprueban(alumnos);
                break;
            case 4:alumnosExamen(alumnos);
                break;
            case 5:mostrarMatriz(alumnos);
                break;
            case 6:System.out.println("¡Gracias por utilizar registo de notas!");
                break;
        }
    }









}

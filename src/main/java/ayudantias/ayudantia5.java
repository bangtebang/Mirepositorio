package src.main.java.ayudantias;
import java.util.Scanner;
public class ayudantia5 {
        public static void main(String[] args) {
            String nombre= ingreseNombre();
            String rut= ingreseRut();
            int edad=ingreseEdad();
            double estatura=ingreseEstatura();
            double peso=ingresePeso();
            System.out.print("Sus datos son los siguientes \n Nombre: "+nombre+"\n Rut: "+rut+"\n Edad: "+edad+"\n Estatura: "+estatura+"\n Peso: "+peso);

        }


    public static String ingreseNombre(){
        Scanner escaneador = new Scanner(System.in);
        String nombre= "";
        boolean esPalabra = false;
        while (!esPalabra) {
            try {
                System.out.print("Ingrese su nombre: ");
                nombre = escaneador.nextLine().trim();
                if (!nombre.matches("[a-zA-Z ]+")) {
                    throw new Exception("El nombre debe contener solo letras y espacios.");
                }
                esPalabra = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return nombre;
        }
    public static String ingreseRut(){
        Scanner escaneador = new Scanner(System.in);
        String rut = "";
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.print("Ingrese su rut con puntos y guion: ");
                rut = escaneador.nextLine().trim();
                if (rut.length() > 14) {
                    throw new Exception("El rut debe tener menos de 15 caracteres.");
                }
                if (!rut.matches("[0-9.-]+")) {
                    throw new Exception("El rut debe contener solo números, puntos y guion alto.");
                }
                esValido = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return rut;
    }
    public static int ingreseEdad(){
        Scanner escaneador = new Scanner(System.in);
        int edad = 0;
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.print("Ingrese su edad en años: ");
                edad = Integer.parseInt(escaneador.nextLine().trim());
                if (edad < 0 || edad >= 150) {
                    throw new Exception("La edad debe ser un número mayor o igual a 0 y menor que 150 años.");
                }
                esValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar solo números enteros.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return edad;
    }
    public static double ingreseEstatura(){
        Scanner escaneador = new Scanner(System.in);
        double estatura = 0.0;
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.print("Ingrese su estatura en mts: ");
                estatura = Double.parseDouble(escaneador.nextLine().trim());
                if (estatura <= 0.0 || estatura > 4.0) {
                    throw new Exception("La estatura debe ser mayor a 0 mts y menor o igual que 4 mts.");
                }
                esValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar solo números decimales separados por un punto no una coma.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return estatura;
    }
    public static double ingresePeso(){
        Scanner escaneador = new Scanner(System.in);
        double peso= 0.0;
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.print("Ingrese su peso: ");
                peso= Double.parseDouble(escaneador.nextLine().trim());
                if (peso <= 0.0 || peso > 600.0) {
                    throw new Exception("El peso debe ser un número decimal mayor que 0 y menor que 600 kilos.");
                }
                esValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar solo números decimales separados por un punto no una coma.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return peso;

    }
    }



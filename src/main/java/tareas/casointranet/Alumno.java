package src.main.java.tareas.casointranet;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private String rut;
    private int numMatricula;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String rut, int numMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numMatricula = numMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        if (ValidadorRut.validarRut(ValidadorRut.eliminarCaracteresRut(rut))==false){
            System.out.println("El rut sin el codigo verificador debe contener solo números,puntos y guion ");
            System.exit(0);
        }
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public static Alumno buscarAlumno(ArrayList<Alumno> listaAlumnos, String rutBuscado) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getRut().equals(rutBuscado)) {
                return alumno;
            }
        }
        return null;
    }

    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", numMatricula=" + numMatricula + "]";
    }
}

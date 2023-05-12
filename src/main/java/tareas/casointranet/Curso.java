package src.main.java.tareas.casointranet;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {
        if (alumno != null) {
            listaAlumnos.add(alumno);
        }
    }
    public void eliminarAlumno(Alumno alumno) {
        listaAlumnos.remove(alumno);
    }
    public ArrayList<Alumno> listaAlumnos() {
        return listaAlumnos;
    }
    public String toString() {
        String resultado = "Curso:\n";
        for (Alumno alumno : listaAlumnos) {
            resultado += alumno.toString() + "\n";
        }
        return resultado;
    }
}

package src.main.java.tareas.casointranet;
import java.util.ArrayList;

public class Principal {
        public static void main(String[] args) {
            Alumno alumno1 = new Alumno("Juan", "Pérez", "12.345.678-9", 123456);
            Alumno alumno2 = new Alumno("María", "Gómez", "11.111.111-1", 654321);
            Alumno alumno3 = new Alumno("Pedro", "Martínez", "22.222.222-2", 987654);
            Curso curso1 = new Curso();
            curso1.agregarAlumno(alumno1);
            curso1.agregarAlumno(alumno2);
            curso1.agregarAlumno(alumno3);

            curso1.eliminarAlumno(alumno3);

            String rutBuscado = "12.345.678-9";
            Alumno alumnoBuscado = Alumno.buscarAlumno(curso1.listaAlumnos(), rutBuscado);
            if (alumnoBuscado != null) {
                System.out.println("El alumno con rut " + rutBuscado + " existe en el curso");
            } else {
                System.out.println("El alumno con rut " + rutBuscado + " no existe en el curso");
            }

            //Mostrar el curso
            System.out.println(curso1.toString());
        }
    }


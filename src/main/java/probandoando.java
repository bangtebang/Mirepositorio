package src.main.java;

import javax.imageio.ImageTranscoder;
import java.util.Random;
public class probandoando {
    public static void main(String[] args) {
     int x=5;
     int z=0;
     for(int y=4;y>0;y--){
         z+= ++x + y;
     }
        System.out.println("z="+z);
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
                }
            }
        }
    }
    public static void mostrarMatriz(double[][] alumnos) {
        for (int x = 0; x < alumnos.length; x++) {
            System.out.print("|");
            for (int y = 0; y < alumnos[x].length; y++) {
                System.out.print(alumnos[x][y]);
                if (y != alumnos[x].length - 1) System.out.print("\t");
            }
            System.out.println("|");

        }


    }
}


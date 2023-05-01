package src.main.java.tareas;

public class tarea2 {
    public static void main(String[] args) {
        int[][]matriz=generarMatriz();
        mostrarMatriz(matriz);
        verificarCuadradoMagico(matriz);
        }


    public static void mostrarMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) System.out.print("\t");
            }
            System.out.println("|");

        }


    }

    public static int[][] generarMatriz() {
        int matriz[][] = new int[3][3];
        int arregloNumero[] = new int[9];
        arregloNumero[0] = 1;
        arregloNumero[1] = 2;
        arregloNumero[2] = 3;
        arregloNumero[3] = 4;
        arregloNumero[4] = 5;
        arregloNumero[5] = 6;
        arregloNumero[6] = 7;
        arregloNumero[7] = 8;
        arregloNumero[8] = 9;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                int posicionArreglo = (int) (Math.random() * 9);
                while (arregloNumero[posicionArreglo] == 0) {
                    posicionArreglo = (int) (Math.random() * 9);
                }
                matriz[x][y] = arregloNumero[posicionArreglo];
                arregloNumero[posicionArreglo] = 0;
            }
        }
        return matriz;

    }
    public static void verificarCuadradoMagico(int[][]matriz) {
        if ((matriz[0][0]+matriz[0][1]+matriz[0][2])==15&&(matriz[1][0]+matriz[1][1]+matriz[1][2])==15&&(matriz[2][0]+matriz[2][1]+matriz[2][2])==15&&(matriz[0][0]+matriz[1][1]+matriz[2][2])==15&&(matriz[0][2]+matriz[1][1]+matriz[2][0])==15&&(matriz[0][0]+matriz[1][0]+matriz[2][0])==15&&(matriz[0][1]+matriz[1][1]+matriz[2][1])==15&&(matriz[0][2]+matriz[1][2]+matriz[2][2])==15){
        System.out.println("Cuadrado mágico");}
        else{
        System.out.println("cuadrado no mágico");}

    }


}



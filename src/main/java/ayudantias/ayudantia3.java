package src.main.java.ayudantias;
import java.util.ArrayList;

public class ayudantia3 {
    public static void main(String[] args) {
        int[][]matriz=generarMatriz();
        mostrarMatriz(matriz);
        compararFilaColumna(generarFila(matriz),generarColumna(matriz));
        buscarPrimos(matriz);
    }
    public static int[][] generarMatriz() {
        int matriz[][] = new int[5][5];
        int arregloNumero[] = new int[25];
        arregloNumero[0] = 1;
        arregloNumero[1] = 2;
        arregloNumero[2] = 3;
        arregloNumero[3] = 4;
        arregloNumero[4] = 5;
        arregloNumero[5] = 6;
        arregloNumero[6] = 7;
        arregloNumero[7] = 8;
        arregloNumero[8] = 9;
        arregloNumero[9] = 10;
        arregloNumero[10] = 11;
        arregloNumero[11] = 12;
        arregloNumero[12] = 13;
        arregloNumero[13] = 14;
        arregloNumero[14] = 15;
        arregloNumero[15] = 16;
        arregloNumero[16] = 17;
        arregloNumero[17] = 18;
        arregloNumero[18] = 19;
        arregloNumero[19] = 20;
        arregloNumero[20] = 21;
        arregloNumero[21] = 22;
        arregloNumero[22] = 23;
        arregloNumero[23] = 24;
        arregloNumero[24] = 25;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                int posicionArreglo = (int) (Math.random() * 25);
                while (arregloNumero[posicionArreglo] == 0) {
                    posicionArreglo = (int) (Math.random() * 25);
                }
                matriz[x][y] = arregloNumero[posicionArreglo];
                arregloNumero[posicionArreglo] = 0;
            }
        }
        return matriz;
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
    public static int[] generarFila(int[][] matriz) {
        int fila[] = new int[5];
        fila[0]=(matriz[0][0]+matriz[0][1]+matriz[0][2]+matriz[0][3]+matriz[0][4]);
        fila[1]=(matriz[1][0]+matriz[1][1]+matriz[1][2]+matriz[1][3]+matriz[1][4]);
        fila[2]=(matriz[2][0]+matriz[2][1]+matriz[2][2]+matriz[2][3]+matriz[2][4]);
        fila[3]=(matriz[3][0]+matriz[3][1]+matriz[3][2]+matriz[3][3]+matriz[3][4]);
        fila[4]=(matriz[4][0]+matriz[4][1]+matriz[4][2]+matriz[4][3]+matriz[4][4]);
        return fila;

    }
    public static int[] generarColumna(int[][] matriz) {
        int columna[] = new int[5];
        columna[0] = (matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0] + matriz[4][0]);
        columna[1] = (matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1] + matriz[4][1]);
        columna[2] = (matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2] + matriz[4][2]);
        columna[3] = (matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3] + matriz[4][3]);
        columna[4] = (matriz[0][4] + matriz[1][4] + matriz[2][4] + matriz[3][4] + matriz[4][4]);
        return columna;
    }
    public static void compararFilaColumna(int[] fila,int[] columna){
        if (fila[0]>columna[0]){
            System.out.println("la fila 0 es mayor");
        }
        if (fila[0]<columna[0]){
            System.out.println("la columna 0 es mayor");
        }
        if (fila[1]>columna[1]){
            System.out.println("la fila 1 es mayor");
        }
        if (fila[1]<columna[1]){
            System.out.println("la columna 1 es mayor");
        }
        if (fila[2]>columna[2]){
            System.out.println("la fila 2 es mayor");
        }
        if (fila[2]<columna[2]){
            System.out.println("la columna 2 es mayor");
        }
        if (fila[3]>columna[3]){
            System.out.println("la fila 3 es mayor");
        }
        if (fila[3]<columna[3]){
            System.out.println("la columna 3 es mayor");
        }
        if (fila[4]>columna[4]){
            System.out.println("la fila 4 es mayor");
        }
        if (fila[4]<columna[4]){
            System.out.println("la columna 4 es mayor");
        }
        }
    public static void buscarPrimos(int[][] matriz) {
        int cantidadPrimos=0;
        ArrayList<Integer> numerosPrimos = new ArrayList<>();
        for(int x=0; x<matriz.length; x++) {
            for(int y=0; y<matriz[x].length; y++) {
                boolean esPrimo = true;
                if(matriz[x][y]< 2) {
                    esPrimo = false;
                }
                else {
                    for(int k=2; k<=Math.sqrt(matriz[x][y]); k++) {
                        if(matriz[x][y]% k == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                if(esPrimo) {
                    cantidadPrimos++;
                    numerosPrimos.add(matriz[x][y]);
                }
            }
        }
        System.out.print("Se encontraron "+cantidadPrimos+" numeros primos y son los siguientes "+numerosPrimos);
    }

    }







package src.main.java.tareas;
import java.util.Scanner;
public class tareasucecion {
    public static void main(String[] args) {
        System.out.print("¿Qué número de Fibonacci desea averiguar? ");
        Scanner entradaEscaner = new Scanner(System.in);
        int n = entradaEscaner.nextInt();
        int fibonacci=calcularFibonacci(n);
            System.out.println("El " + n + " número de Fibonacci es: " + fibonacci);
    }

        public static int calcularFibonacci(int n){
            if (n == 0 || n == 1) {
                return n;
            } else {
                int fibonacci=calcularFibonacci(n-1) + calcularFibonacci(n-2);
                return fibonacci;
            }
        }
    }

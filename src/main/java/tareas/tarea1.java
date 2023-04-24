package src.main.java.tareas;
import java.util.Scanner;
public class tarea1 {
    public static void main(String[] args) {
        int credito=entradaMensajeCredito();
        int cuotas=entradaMensajeCuotas();
        int total=calculoTotal(credito,cuotas);
        int valorcuota=calculoValorCuota(total,cuotas);
        System.out.println("monto total a pagar: "+total+",cuota mesual: "+valorcuota);


    }
    public static int entradaMensajeCredito(){
        System.out.println( "Crédito a pedir ") ;
        int credito = 0;
        Scanner entradaEscaner = new Scanner (System.in);
        credito = entradaEscaner.nextInt();
        return credito;

    }
    public static int entradaMensajeCuotas(){
        System.out.println( "y cuotas ") ;
        int cuotas =0;
        Scanner entradaEscaner = new Scanner (System.in);
        cuotas = entradaEscaner.nextInt ();
        return cuotas;
    }
    public static int calculoTotal(int credito,int cuotas) {
        int total =0;
        if (credito<=1000000&&cuotas>=1&&cuotas<=12){
            total= (int) (credito + credito*0.25);
        }
        if (credito<=1000000&&cuotas>=13&&cuotas<=23){
            total= (int) (credito + credito*0.30);
        }
        if (credito<=1000000&&cuotas>=24){
            total= (int) (credito + credito*0.35);
        }
        if (credito>=1000000&&cuotas>=1&&cuotas<=12){
            total= (int) (credito + credito*0.15);
        }
        if (credito>=1000000&&cuotas>=13&&cuotas<=23){
            total= (int) (credito + credito*0.20);
        }
        if (credito>=1000000&&cuotas>=24){
            total= (int) (credito + credito*0.25);
    }
        return total;}
        public static int calculoValorCuota(int total,int cuotas){
        int valorcuota=total/cuotas;
        return valorcuota;
        }






}







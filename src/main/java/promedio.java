public class promedio {
    public static void main(String[] args) {
        double promedio=calcularPromedio();
        System.out.println(promedio);
        mostrarEstado(promedio);
    }

    public static double generarNota(){
        return (Math.random() * 6) + 1;
    }
    public static void mostrarEstado(double promedio){
        if (promedio<3.6){
            System.out.println("reprueba");
        }
        if (promedio>=3.6&&promedio<4.0){
            System.out.println("da examen");
        }
        if (promedio>=4.0){
            System.out.println("aprueba");
        }
    }
    public static double calcularPromedio(){
        double promedio = 0;
        for (int i = 0; i < 3; i++){
            promedio += generarNota()/3;
        }
        return promedio;

    }



}
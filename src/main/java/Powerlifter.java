package src.main.java;

public class Powerlifter {
    private String nombre;
    private int edad;
    private double peso;
    private double press;
    private  double sentadilla;
    private  double pesoMuerto;

    public Powerlifter(String nombre,int edad, double peso,double press, double sentadilla, double pesoMuerto){
        this.nombre = nombre;
        this.edad= edad;
        this.peso= peso;
        this.press= press;
        this.sentadilla= sentadilla;
        this.pesoMuerto= pesoMuerto;
    }


    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPress() {
        return this.press;
    }
    public void setPress(double press) {
        this.press = press;
    }
    public double getSentadilla() {
        return this.sentadilla;
    }
    public void setSentadilla(double sentadilla) {
        this.sentadilla = sentadilla;
    }
    public double getPesoMuerto() {
        return this.pesoMuerto;
    }
    public void setPesoMuerto(double pesoMuerto) {
        this.pesoMuerto= pesoMuerto;
    }



}

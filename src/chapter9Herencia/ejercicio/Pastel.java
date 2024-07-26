package chapter9Herencia.ejercicio;

public class Pastel {

    private String sabor;
    private double precio;

    //constructor que acepta el sabor
    public Pastel(String sabor) {
        this.sabor = sabor;
    }

    //getter and setters
    public String getSabor() {
        return sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void print(){
        System.out.println("Soy un pastel");
    }
}

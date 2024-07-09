package chapter6Objetos;

public class Rectangle {

    //atributos
    private double largo;
    private double ancho;

    //metodos
    double calularPerimetro(){
        return (largo * 2) +  (ancho * 2);
    }

    double calcularArea(){
        return largo * ancho;
    }

    //getters
    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    //setters
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public Rectangle(){
        largo = 0;
        ancho = 0;
    }

    public Rectangle(double largo, double ancho) {
        setLargo(largo);
        setAncho(ancho);
    }
}

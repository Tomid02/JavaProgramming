package chapter9Herencia.ejercicio;

public class PastelDeBoda extends Pastel{

    private int niveles;

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    public PastelDeBoda(String sabor) {
        super(sabor);
    }

    @Override
    public void print(){
        System.out.println("Pastel de Boda: Sabor " + this.getSabor() + " | Precio: " + this.getPrecio());
    }

}

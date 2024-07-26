package chapter9Herencia.ejercicio;

public class PastelDeCumpleaneos extends Pastel{

    private int velas;

    public PastelDeCumpleaneos(String sabor, int velas) {
        super(sabor);
    }

    public int getVelas() {
        return velas;
    }

    public void setVelas(int velas) {
        this.velas = velas;
    }

    public PastelDeCumpleaneos(String sabor) {
        super(sabor);
    }

    @Override
    public void print(){
        System.out.println("Pastel de Cumpleaños: Sabor " + this.getSabor() + " | Precio: " + this.getPrecio());
    }

}

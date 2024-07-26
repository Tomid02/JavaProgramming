package chapter10Polimorfismo.ejercicio;

public class Manzana extends Fruta{
    public Manzana() {
        setCalorias(45);
    }

    @Override
    public void hacerJugo() {
        System.out.println("Se hace jugo de manzana");
    }

    public void quitarSemillas(){
        System.out.println("Se quitan las semillas");
    }
}

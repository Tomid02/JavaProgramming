package chapter10Polimorfismo.ejercicio;

public class Banana extends Fruta{
    public Banana() {
        setCalorias(75);
    }

    @Override
    public void hacerJugo() {
        System.out.println("Se hace licuado de banana");
    }

    public void pelarBanana(){
        System.out.println("Se pela la bana");
    }
}

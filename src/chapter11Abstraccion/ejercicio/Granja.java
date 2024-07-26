package chapter11Abstraccion.ejercicio;

public class Granja {
    public static void main(String[] args) {

        Cerdo cerdo = new Cerdo();
        cerdo.comer();
        cerdo.hacerSonido();

        Pato pato = new Pato();
        pato.comer();
        pato.hacerSonido();
    }
}

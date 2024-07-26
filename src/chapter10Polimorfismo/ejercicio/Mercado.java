package chapter10Polimorfismo.ejercicio;

public class Mercado {
    public static void main(String[] args) {

        Banana banana = new Banana();
        Manzana manzana = new Manzana();
        banana.pelarBanana();
        manzana.quitarSemillas();

        Fruta banana2 = new Banana();
        Fruta manzana2 = new Manzana();
        ((Banana) banana2).pelarBanana();
        ((Manzana) manzana2).quitarSemillas();

        banana.hacerJugo();
        manzana.hacerJugo();
        banana2.hacerJugo();
        manzana2.hacerJugo();
    }
}

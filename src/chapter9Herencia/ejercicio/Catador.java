package chapter9Herencia.ejercicio;

import java.util.Scanner;

public class Catador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sabor del pastel de boda");
        String saborBoda = scanner.next();
        System.out.println("Ingrese el precio del pastel de boda");
        double precioBoda = scanner.nextDouble();

        System.out.println("Ingrese el sabor del pastel de cumpleaños");
        String saborCumple = scanner.next();
        System.out.println("Ingrese el precio del pastel de cumpleaños");
        double precioCumple = scanner.nextDouble();

        scanner.close();

        PastelDeBoda pastelDeBoda = new PastelDeBoda(saborBoda);
        PastelDeCumpleaneos pastelDeComple = new PastelDeCumpleaneos(saborCumple);

        pastelDeBoda.setPrecio(precioBoda);
        pastelDeComple.setPrecio(precioCumple);

        pastelDeBoda.print();
        pastelDeComple.print();


    }
}

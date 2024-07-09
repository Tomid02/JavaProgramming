package chapter6Objetos;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle cocina = calculator.getRoom();
        Rectangle banio = calculator.getRoom();

        double area = calculator.calcularAreaTotal(cocina, banio);

        System.out.println("El area total es: " + area);

        calculator.scanner.close();

    }

    public Rectangle getRoom(){

        System.out.println("Ingrese el largo de la habitacion");
        double largo = scanner.nextDouble();

        System.out.println("Ingrese el ancho de la habitacion");
        double ancho = scanner.nextDouble();

        return new Rectangle(largo, ancho);
    }

    public double calcularAreaTotal(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calcularArea() + rectangle2.calcularArea();
    }
}

package chapter6Objetos;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        /*
        Rectangle 1
         */

        Rectangle room1 = new Rectangle();
        room1.setAncho(25);
        room1.setLargo(50);
        double areaOfRoom1 = room1.calcularArea();

        /*
        Rectangle 2
         */
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calcularArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area de ambas habitaciones: " + totalArea);

    }
}

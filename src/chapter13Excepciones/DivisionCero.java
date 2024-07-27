package chapter13Excepciones;

//ejercicio
public class DivisionCero {
    public static void main(String[] args) {
        int dividendo = 30;
        int divisor = 0;
        try {
            int cociente = dividendo /divisor;
            System.out.println("El resultado de la division es: " + cociente);
        }
        catch (ArithmeticException e){
            System.out.println("ERROR! esta intentando dividir por cero");
        }
        finally {
            System.out.println("La division es divertida");
        }

    }
}

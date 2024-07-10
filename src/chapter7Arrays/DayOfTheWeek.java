package chapter7Arrays;


import java.util.Scanner;

//ejercicio independiente
public class DayOfTheWeek {

    private static final Scanner scanner = new Scanner(System.in);
    public static String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    public static void main(String[] args) {

        System.out.println(getDiaDeLaSemana());
        scanner.close();
    }

    public static String getDiaDeLaSemana(){
        System.out.println("Ingrese el numero del dia:");
        int numbDia = scanner.nextInt();
        return semana[numbDia-1];
    }
}

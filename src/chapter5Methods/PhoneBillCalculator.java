package chapter5Methods;

import java.util.Scanner;

//Ejercicio Independiente
public class PhoneBillCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la tarifa del plan:");
        double tarifa = scanner.nextDouble();

        System.out.println("Ingrese los minutos exedidos:");
        int minutos_excedidos= scanner.nextInt();

        scanner.close();

        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: $" + tarifa);
        double exceso = calcularExceso(minutos_excedidos);
        System.out.println("Overage: $" + exceso);
        double tax = calcularTax(tarifa, exceso);
        System.out.println("Tax: $" + tax);
        double total = calcularTotal(tarifa, exceso, tax);
        System.out.println("Total: $" + total);
    }

    public static double calcularExceso(int min_exced){
        return 0.25 * min_exced;
    }

    public static double calcularTax(double tarifa, double exceso){
        return (tarifa + exceso) * 0.15;
    }

    public static double calcularTotal(double tarifa, double exceso, double tax){
        return tarifa + exceso + tax;
    }
}

package chapter4Ciclos;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        boolean again;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? True or False");
            again = scanner.nextBoolean();

        }while(again);
    }
}

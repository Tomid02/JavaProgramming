package chapter3Condicionales;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;//evita el uso de numeros magicos

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota){ //if(sales > 10) 10 es un numero magico, es mejor tenerlo definido en una variable
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);
    }
}

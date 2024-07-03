//carpeta a la que pertenece la clase
package chapter2;

import java.util.Scanner;

//clase en JAVA
public class GrossPayCalculator {

    //metodo dentro de la clase, punto de entrada para ejecutar un programa en Java
    public static void main(String[] args){

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);//se debe importar la clase Scanner (import java.util.Scanner;)
        int hours = scanner.nextInt();//el numero ingresado por teclado lo guardo en la variable hours

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();//el numero ingresado por teclado lo guardo en la variable rate
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;//calculo el GrossPay

        //4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);//muestro por pantalla el GrossPay

    }
}

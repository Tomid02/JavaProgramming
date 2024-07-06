package chapter3Condicionales;

import java.util.Scanner;

public class ChageForADollarGame {

    public static void main(String[] args){
        String message;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos centavos quiere ingresar?");
        int centavos = scanner.nextInt();//1 centavo
        System.out.println("Cuantos niqueles quiere ingresar?");
        int niqueles = scanner.nextInt();//5 centavos
        System.out.println("Cuantas monedas de 10 centavos quiere ingresar?");
        int centavos10 = scanner.nextInt();//10 centavos
        System.out.println("Cuantas monedas de 25 centavos quiere ingresar?");
        int centavos25 = scanner.nextInt();//25 centavos

        scanner.close();

        int centavos_total = centavos + niqueles * 5 + centavos10 * 10 + centavos25 * 25;
        if (centavos_total == 100){
            message = "Ganaste el juego!";
        }
        else{
            message = "Perdiste el juego! :(";
        }

        System.out.println(message);

    }
}

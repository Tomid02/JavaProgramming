package chapter2;

import java.text.MessageFormat;
import java.util.Scanner;

//ejercicio independiente
public class MadLibs {

    public static void  main(String[] args){

        System.out.println("Enter the season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season_of_the_years = scanner.next();

        System.out.println("Enter a whole number:");
        int whole_numbre = scanner.nextInt();

        System.out.println("Enter a adjective:");
        String adjective = scanner.next();

        //System.out.println("On a " + adjective + " " +   season_of_the_years + " day, I drink a minimun of " + whole_numbre + " cups of coffee");
        System.out.println(MessageFormat.format("On a {0} {1} day, I drink a minimun of {2} cups of coffee", adjective, season_of_the_years, whole_numbre));

    }
}

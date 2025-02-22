package chapter7Arrays;

import java.util.Scanner;

public class Grades {

    public static int[] grades;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuantos grados le gustaria ingresar?");
        grades = new int[scanner.nextInt()];

        getGrades();
        scanner.close();

        System.out.println("Average: " + calculateAverage());
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    public static void getGrades(){
        for(int i=0; i<grades.length; i++){
            System.out.println("Ingrese el grado #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }

        return sum;
    }

    public static double calculateAverage(){
        return (double) calculateSum()/grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}

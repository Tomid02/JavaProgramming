package chapter4Ciclos;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTest = 4;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< numberOfStudents; i++){

            double total = 0;
            for(int j=0; j<numberOfTest; j++){
                System.out.println("Enter the score for Test #" + (j+1));

                double score = scanner.nextDouble();

                total = total + score;
            }

            double average = total/numberOfTest;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }
    }
}

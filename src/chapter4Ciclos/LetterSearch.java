package chapter4Ciclos;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        //Search text for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if (letterFound){
            System.out.println("This text contains the letters 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
        //Search text for letter A -> agrego la condicion !letterFound para reemplazar la instruccion break
//        for(int i=0; !letterFound && i<text.length(); i++){
//            char currentLetter = text.charAt(i);
//            if(currentLetter == 'A' || currentLetter == 'a'){
//                letterFound = true;
//            }
//        }
    }
}

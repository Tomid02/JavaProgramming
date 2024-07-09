package chapter4Ciclos;

import java.util.Random;

//Ejercicio Independiente
public class RollTheDieGame {
    public static void main(String[] args) {

        Random random = new Random();

        int numOfSpaces = 20;
        int numOfRolls = 5;
        int roll = 0;
        int space = 0;

        while(roll < numOfRolls){

            int die = random.nextInt(6) +1;

            space += die;

            if(space <= numOfSpaces){//si quedan espacios por avanzar para llegar el numero de espacios del tablero 0  llego al espacio final
                if (space == numOfSpaces){//si es el espacio final gana el juego y termina
                    System.out.println("Roll #"+ (roll + 1)+": You've rolled a " + die + ". You're on space " + space + ". Congrats, you win!");
                    break;
                }
                else if ((roll + 1 == numOfRolls)){//si quedan espacios por avanzar y es la ultima tirada pierde el jeugo
                    System.out.println("Roll #" + (roll + 1) + ": You've rolled a " + die + ". You're on space " + space + ". Sorry, you lose!");
                    break;
                }
                System.out.println("Roll #"+ (roll + 1)+": You've rolled a " + die + ". You are now on space " + space + " and have " + (numOfSpaces - space)+" more to go");

            }
            else{//si se pasa del numero de espacios del tablero
                System.out.println("Roll #"+ (roll + 1)+": You've rolled a " + die + ". Sorry, you lose!");

                break;
            }
            roll += 1;
        }
    }
}

package chapter7Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicketV2 {

    private static final int LONGITUD = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LONGITUD];
        Random random = new Random();

        for(int i=0; i<LONGITUD; i++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int number){
        for(int value : array){
            if(value == number){
                return true;
            }
        }

        return false;
    }

    public static void printTicket(int[] ticket){
        for(int i=0; i<LONGITUD; i++){
            System.out.print(ticket[i] + " | ");//no hay salto de linea con print sin ln
        }
    }
}

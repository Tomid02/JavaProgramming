package chapter7Arrays;

import java.util.Random;

public class LotteryTicket {

    //constantes: por convencion se nombran en MAYUSCULAS
    private static final int LONGITUD = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);

    }
    public static int[] generateNumbers(){

        int[] ticket = new int[LONGITUD];
        Random random = new Random();

        for(int i = 0; i < LONGITUD; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER)+1;
        }
        return ticket;
    }

    public static void printTicket(int[] ticket){
        for(int i=0; i<LONGITUD; i++){
            System.out.print(ticket[i] + " | ");//no hay salto de linea con print sin ln
        }

    }
}

/**
 * A program for the rock paper and scissors game.
 * Get input from player 1 and player 2 and the program will print the winner according to the inputs.
 *
 * */
import java.util.Scanner;
public class Game{
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter first player's object:");
        String player1 = scan.nextLine();

        System.out.println("Enter second player's object:");
        String player2 = scan.nextLine();

        //In case the two players are choice the same obj
        if(player2.equals(player1)) System.out.println("Game ends with a tie");
        // All the cases that the player1 get win
        else if (player2.equals("R") && player1.equals("S") ||
                 player2.equals("S") && player1.equals("P") ||
                 player2.equals("P") && player1.equals("R")) {
            System.out.println("Player 2 wins.");
        }
        // any other combinations are let player2 to win
        else System.out.println("Player 1 wins.");
    }
}
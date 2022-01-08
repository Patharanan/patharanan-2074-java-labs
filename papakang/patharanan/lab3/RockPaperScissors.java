// /This program is 
//This program is a user-to-computer rock-paper-scissors program where the user selects rock paper scissors 
//and the computer generates one random rock paper or scissors. Compared, 
//provided that paper wins rock rock wins scissors and scissors wins paper.
//if the user’s choice and the computer’s choice are the same, the result is a tie. 
//  * Author: Patharanan Papakang
//  * ID: 643040207-4
//  * Sec: 2
//  * Date:jan 7, 2022
//  *
//  /
package papakang.patharanan.lab3;
import java.util.Locale;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {

        try (
                Scanner input = new Scanner(System.in)) {
            // Use a while(true) loop and only break the loop if the user wants to quit
            while (true) {
                String myMove = input.nextLine();
                String userChoice = myMove.toLowerCase(Locale.ENGLISH);
                // Check if the user's move is valid (rock, paper, or scissors)
                if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                    System.out.println("Incorrect input. Rock, Paper or Scissors only");

                } else {

                    // Get a random number in between 0 and 3 and convert it to an integer so that
                    // the possibilities are 0, 1, or 2
                    int rand = (int) (Math.random() * 3); // min+(int)(Math.random())*((max-min)+1)
                    // Convert the random number to a string using conditionals and print the
                    // opponent's move
                    String opponentMove = "";
                    if (rand == 0) {
                        opponentMove = "rock";
                    } else if (rand == 1) {
                        opponentMove = "paper";
                    } else {
                        opponentMove = "scissors";
                    }
                    System.out.println("Computer's choice: " + opponentMove);

                    // Print the results of the game: tie, lose, win
                    if (userChoice.equals(opponentMove)) {
                        System.out.println("It's a tie");
                    } else if ((userChoice.equals("rock") && opponentMove.equals("scissors"))
                            || (userChoice.equals("scissors") && opponentMove.equals("paper"))
                            || (userChoice.equals("paper") && opponentMove.equals("rock"))) {
                        System.out.println(userChoice + " beats " + opponentMove + " You  wins.");
                    } else {
                        System.out.println(opponentMove + " beats " + userChoice + " Computer  wins.");
                    }
                }
            }
        }
    }
}
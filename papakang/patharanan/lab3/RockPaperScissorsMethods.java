// /This program is overloading methods 
// acceptinput =  get value from user rock,paper,scissors.
// compChoice = computer random choice paper rock scissors.
// displayWiner = Compares the values ​​between the user input and the random computer and always shows the win-lose results.
//  * Author: Patharanan Papakang
//  * ID: 643040207-4
//  * Sec: 2
//  * Date:jan 7, 2022
//  *
//  /

package papakang.patharanan.lab3;

import java.util.Locale;
import java.util.Scanner;

public class RockPaperScissorsMethods {
    static String human;
    static String opponentMove;

    // get value from user(rock,paper,scissors)
    static void acceptlnput() {
        try (Scanner input = new Scanner(System.in)) {
            String userChoice = input.nextLine();
            human = userChoice.toLowerCase(Locale.ENGLISH);

        }
        // Check if the user's move is valid (rock, paper, or scissors)
        catch (Exception e) {
            if (!human.equals("rock") && !human.equals("paper") && !human.equals("scissors")) {
                System.out.println("Incorrect input. Rock, Paper or Scissors only");
            }
        }
    }

    static String compChoice() {

        // Get a random number in between 0 and 3 and convert it to an integer so that
        // the possibilities are 0, 1, or 2
        int rand = (int) (Math.random() * 3); // min+(int)(Math.random())*((max-min)+1)
        // Convert the random number to a string using conditionals and print the
        String opponentMove = "";
        if (rand == 0) {
            opponentMove = "rock";
        } else if (rand == 1) {
            opponentMove = "paper";
        } else {
            opponentMove = "scissors";
        }
        System.out.println("Computer's choice: " + opponentMove);

        String result = (opponentMove);
        return result;
    }

    // Compare values ​​between user and computer.
    static void displayWiner(String computer) {
        if (human.equals(computer)) {
            System.out.println("It's a tie");
        } else if ((human.equals("rock") && computer.equals("scissors"))
                || (human.equals("scissors") && computer.equals("paper"))
                || (human.equals("paper") && computer.equals("rock"))) {
            System.out.println(human + " beats " + computer + " You  wins.");
        } else {
            System.out.println(computer + " beats " + human + " Computer  wins.");
        }
    }
   //overloading methods
    public static void main(String[] args) {
        acceptlnput();
        String computer = compChoice();
        displayWiner(computer);
    }
}

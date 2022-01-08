// /This program is The 8-color RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLETprinting timer program randomly 
//shows whether the user is typing slower or faster than the normal person is 12 seconds. 
//When the user makes a typo, start typing again by starting a new timer too. 
//and don't care about lowercase or uppercase.
//  * Author: Patharanan Papakang
//  * ID: 643040207-4
//  * Sec: 2
//  * Date:jan 7, 2022
//  *
//  /

package papakang.patharanan.lab3;

import java.util.Scanner;
//import java.util.Locale;
import java.util.Random;

//import javax.lang.model.element.Element;

public class TypingTest {
    static String answer;

    public static void main(String[] args) {

        int Size = 8;
        String rndColor[] = new String[Size];
        String[] color = { "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "INDIGO", "VIOLET" };
        int length = 8;
        //random color
        for (int i = 0; i < length; i++) {
            int rnd = new Random().nextInt(color.length);
            rndColor[i] = color[rnd];
        }
        //add space between words
        String succedColor = String.join(" ", rndColor);
        System.out.println(succedColor);

        try (Scanner input = new Scanner(System.in)) {
            long start, end;
            while (true) {

                System.out.print("Type your answer: ");
                // get time
                start = System.currentTimeMillis(); 
                String answer = input.nextLine();
                
                if (answer.equalsIgnoreCase(succedColor)) {
                    // get ending time
                    end = System.currentTimeMillis(); 
                    //time used for typing in will be calculated and
                    double time = (end - start) / 1000;
                    System.out.println("Your time is " + time);
                    //  if the user types in faster than or equal to 12 seconds, the user types faster 
                    if (time <= 12) {
                        System.out.println("Your type faster than average person");
                        break;
                    } else {
                        System.out.println("Your type slower than average person");
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
    }

}

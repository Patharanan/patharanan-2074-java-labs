/**program VowelsCounter to count the vowels in the input string.
*Enter a text argument.The program will count the vowels a e i o u in that sentence or word
* Author: Patharanan Papakang
* ID: 643040207-4
* Sec: 2
* Date: December 24, 2021
*
**/
public class VowelsCounter {
    public static void main(String[] args) {
            int count = 0;
            for (int i = 0; i < args[0].length(); i++) {
                //Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.
                if (args[0].charAt(i) == 'a' || args[0].charAt(i) == 'e' || args[0].charAt(i) == 'i'|| args[0].charAt(i) == 'o' || args[0].charAt(i) == 'u') {
                    count++;
                }
            }
        System.out.println("Total number of vowels is " + count);
        }
    }
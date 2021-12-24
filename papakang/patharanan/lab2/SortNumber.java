/**This program is an ascending number sorting program.
*When a user enters a argument but must enter more than one argument. Up to 5 argument will be sorted.
* Author: Patharanan Papakang
* ID: 643040207-4
* Sec: 2
* Date: December 24, 2021
*
**/
import java.util.Arrays;
public class SortNumber {
    public static void main(String[] args) {
        double[] sortArgs = new double[args.length];
        //user enters a argument but must enter more than one argument. Up to 5 argument will be sorted.
        if (args.length > 5 || args.length < 1) {
            System.out.println("Please provoide at least 1 argument and at most 5 arguments");
            System.exit(0);
        }
        //keep argument in array
        for (int i = 0; i < args.length; i++) {
            double firstArgs = Double.parseDouble(args[i]);
            sortArgs[i] = firstArgs;
        }
        Arrays.sort(sortArgs); //sorted number
        System.out.println("for the input numbers:");
        //argument in array for sort
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println("\nSorted number:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(sortArgs[i] + " ");
        }
    }
}
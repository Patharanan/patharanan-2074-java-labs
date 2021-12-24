/**This program is a calculation program based on the user input of values and operators.
 *This program get three argument is operator and two numbers
 * if argument is q or Q exit program
 * Author: Patharanan Papakang
 * ID: 643040207-4
 * Sec: 2
 * Date: December 24, 2021
 *
 **/
import static java.lang.String.format;
class Calculator {
    public static void main(String[] args) {
        //If the user enters  three argument
        if (args.length == 3) {
            String operator = args[0];
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);
            //if argument is q or Q exit program
            if(args[0] == "q" || args[0] == "Q") {
                System.out.println("End program");
                System.exit(0);
            }
            switch (operator) {
                // performs addition
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + format("%.2f", num1 + num2));
                    break;
                // performs subtraction between numbers
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + format("%.2f", num1 - num2));
                    break;
                // performs multiplication between numbers
                case "x":
                    System.out.println(num1 + " * " + num2 + " = " + format("%.2f", num1 * num2));
                    break;
                // performs division between numbers
                case "/":
                    //by zero is not mathematically defined.
                    if (num2 == 0) {
                        System.out.println("The second operand cannot be zero");
                    } else {
                        System.out.println(num1 + " / " + num2 + " = " + format("%.2f", num1 / num2));
                        break;
                    }
            }
        }
    }
}

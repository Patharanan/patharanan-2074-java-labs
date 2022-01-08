// In this java program  are calculating the compound interest, 
//Find out how many years before the principal plus interest is doubled 
//and check if the principal or interest is not negative.
//  * Author: Patharanan Papakang
//  * ID: 643040207-4
//  * Sec: 2
//  * Date:jan 7, 2022
//  *
//  
package papakang.patharanan.lab3;

import java.util.Scanner;

public class Compoundlnterest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter initial investment: ");
            double initiallnvest = input.nextInt();
            System.out.print("Enter compund interest: ");
            double interest = input.nextInt();
            double initiallnvest_total = initiallnvest * 2;
            // if the value initiallnvest or interest is negative
            if (initiallnvest <= 0 || interest <= 0) {
                System.out.println("Initial invertment and interest should be positive.");
            } else {
                // year total investment each year can be computed as follows
                for (int i = 1; true; i++) {
                    double equation = initiallnvest + ((interest / 100) * initiallnvest);
                    initiallnvest = equation;
                    System.out.println("Year " + i + " : " + equation);
                    
                    // When the principal plus interest is double the principal end program.
                    if (equation >= initiallnvest_total) {
                        break;
                    }
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

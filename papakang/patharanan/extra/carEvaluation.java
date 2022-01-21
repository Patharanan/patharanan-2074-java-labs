/** user evaluations from the standard input, and then calculates and displays an average score for each category being evaluated to the standard output.
 * A car is evaluated in five categories: Appearance, Braking, Comfort, Handling, and Reliability.
 * For each category, a score of 1, 2, 3, 4, or 5 will be used, where 1 represents the lowest possible score, and 5 represents the highest possible score.
 * @Aunter Patharanan Papakang
 * @since 20 Jan 2022
 */

package papakang.patharanan.extra;

import java.util.Scanner;

public class carEvaluation {

  static int NUM_SUB = 0;
  static int NUM_CATEGORIES = 5;
  static int[][] scores;
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    getEvaluations();
    displayStats();
  }

  /**
   * This method  get inputs from the user. The program first asks the user how many submissions he/she wants to enter.
   * Then, for each submission,the program asks the user to enter a score for each category
   * in the same line in the order of Appearance, Braking, Comfort, Handling, and Reliability respectively.
   */
  public static void getEvaluations() {
    System.out.print("Please enter the number of submissions:");
    NUM_SUB = input.nextInt();
    scores = new int[NUM_SUB][NUM_CATEGORIES];

    for (int i = 0; i < NUM_SUB; i++) {
      System.out.println(
        "Submission " +
        "#" +
        (i + 1) +
        ", please enter a score for each of the 5 categories"
      );
      for (int j = 0; j < NUM_CATEGORIES; j++) {
        scores[i][j] = input.nextInt();
      }
    }
  }

  /**
   * calculates and displays an average score for each category being evaluated to the standard output.
   */
  public static void displayStats() {
    int size = NUM_CATEGORIES;
    double avg[] = new double[size];
    for (int i = 0; i < NUM_CATEGORIES; i++) {
      double sum = 0;
      for (int j = 0; j < NUM_SUB; j++) {
        sum = sum + scores[j][i];
      }
      avg[i] = sum / NUM_SUB;
    }
    System.out.print("The average value of each category:");
    for (int i = 0; i < avg.length; i++) {
      System.out.printf("%.2f ", avg[i]);
    }
  }
}

/**This program computeFactorialNum accepts two program argument num1 and num2
 *calculate factorial
 * @Author Patharanan Papakang
 * @version 1.0,16/1/2020
 * ID: 643040207-4
 * Sec: 2
 */
package papakang.patharanan.lab4;

public class ComputeFactorialNum {

  static int smallNum;
  static int largeNum;

  /**
   * This method is takes the values and stores them in an argument and sorts
   * them in ascending order.
   * if values in args = 0  display Usage: ComputeFactorialNum n1 n2 and end program.
   * @param args get two integers
   */
  public static void readInputNums(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: ComputeFactorialNum <n1> <n2>");
      System.exit(0);
    } else {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      if (num1 < num2) {
        smallNum = num1;
        largeNum = num2;
      } else {
        smallNum = num2;
        largeNum = num1;
      }
    }
  }

  /**
   * This method is calculate factorial using an inner loop from values the small
   * number to the larger number.
   */
  public static void computeFactUsingNestedLoops() {
    System.out.println("=== Computing factorial number using nested loops ===");
    for (int i = smallNum; i <= largeNum; ++i) {
      int factorial = 1;
      for (int j = 1; j <= i; ++j) {
        factorial *= j;
      }
      System.out.println("Fact" + "(" + i + ")" + " is " + factorial);
    }
  }

  /**
   * Method computeFactUsingRecursive() calls the method compuFact(int n) which is a recursive method
   * and has only one loop tp compute the factorial values from the smaller number to the larger number.
   */
  public static void computeFactUsingRecursive() {
    System.out.println(
      "=== Computing factorial number using the recursive method ==="
    );
    while (smallNum <= largeNum) {
      System.out.println(
        "Fact" + "(" + smallNum + ")" + " is " + compuFact(smallNum)
      );
      smallNum++;
    }
  }

  /**
   * calculate factorial from values the small number to the larger number.
   *
   * @param n is a positive integer to find the factorial value
   * @return 1 when n = 0 and if not return n = the factorial value of the given parameter
   */

  static Integer compuFact(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * compuFact(n - 1);
    }
  }

  /**
   * use method readInputNums
   * use method computeFactUsingNestedLoops
   * use method computeFactUsingRecursive
   *
   * @param args get two values to use in the method redInputNums.
   */
  public static void main(String[] args) {
    readInputNums(args);
    computeFactUsingNestedLoops();
    computeFactUsingRecursive();
  }
}

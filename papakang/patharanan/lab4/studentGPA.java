/**This program receives information about courses and grades and calculates the average GPA.
 * @Auther Patharanan Papakang
 * @vesion 1.0,21/01/2022
 * ID: 643040207-4
 * Sec: 2
 */

package papakang.patharanan.lab4;

import java.util.Scanner;

public class studentGPA {

  public static void main(String[] args) {
    readGrades();
    printGrades();
    showGPAs();
  }

  static int MAX_NUMCOURSES = 100; //int variable for the maximum number of courses
  static int[] semesters = new int[MAX_NUMCOURSES]; //array of int. It stores the terms of the courses. Terms be 1 for the first term, 2 for the second term
  static String[] coures = new String[MAX_NUMCOURSES]; // array of String. It stores the names of the courses. The names of the course stored will be the course codes.
  static String[] grades = new String[MAX_NUMCOURSES]; //array of String that will store grades of the courses.
  static int[] units = new int[MAX_NUMCOURSES]; // array of int that will store the numbers of units of the corresponding courses.
  static int numCourses = 0; //number of courses that the student has registered and recorded. This can be used to run a loop to get values from all the arrays.
  static Scanner input = new Scanner(System.in);

  /**
   * The method readGrades() accepts the information of each course which
   * includes semester,  course,  grade, and the number of units.
   * The program loops to read in the data until 0 is entered .
   */
  public static void readGrades() {
    System.out.println(
      "Enter grades of student (semester course grade unit) :"
    );
    System.out.println("Type 0 for the semester to quit");

    for (int i = 0; i < MAX_NUMCOURSES; i++) {
      String[] arr = input.nextLine().split(" ");
      if (arr[0].equals("0")) {
        break;
      } else {
        semesters[numCourses] = Integer.parseInt(arr[0].toString());
        coures[numCourses] = arr[1];
        grades[numCourses] = arr[2];
        units[numCourses] = Integer.parseInt(arr[3].toString());
        numCourses++;
      }
    }
  }

  /**
   * The printGrades() method displays grades.
   */
  public static void printGrades() {
    System.out.println("You have entered these following grades:");
    for (int i = 0; numCourses > i; i++) {
      System.out.println(
        semesters[i] + " " + coures[i] + " " + grades[i] + " " + units[i]
      );
    }
  }

  /**
   * The method showGPAs() when user input a will display accumulated GPA,
   *when user enter s will call method calculatorSemester()
   *and when user in put q or Q end program
   */

  public static void showGPAs() {
    double totalUnit = 0; //The total unit entered by the user.
    double avgGrade = 0; //Grade average
    double totalGrade = 0; //The total grade entered by the user.
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println(
        "Type 'a' for accumulated GPA, 's' for specific semester, and 'q' to quit"
      );
      String userInput = input.nextLine();

      if (userInput.equals("a")) {
        for (int i = 0; i < numCourses; i++) {
          totalUnit += units[i];
          totalGrade += calculatorGrades(i) * units[i];
          avgGrade = totalGrade / totalUnit;
        }

        System.out.printf("Accumulated GPA is %.2f \n", avgGrade);
      } else if (userInput.equals("s")) {
        calculatorSemester();
      } else if (userInput.equals("q")) {
        input.close();
        System.exit(0);
      }
    }
  }

  /**
   * The method converts text grades to numeric values for calculations.
   *  grades can be A, B+, B, C+, C, D+, D and F.
   * @param i is grades that are valued in string
   * @return Value grade of double
   */
  public static double calculatorGrades(int i) {
    double valueGrades = 0;
    if (grades[i].equals("A")) {
      valueGrades = 4;
    } else if (grades[i].equals("B+")) {
      valueGrades = 3.5;
    } else if (grades[i].equals("B")) {
      valueGrades = 3;
    } else if (grades[i].equals("C+")) {
      valueGrades = 2.5;
    } else if (grades[i].equals("C")) {
      valueGrades = 2;
    } else if (grades[i].equals("D+")) {
      valueGrades = 1.5;
    } else if (grades[i].equals("D")) {
      valueGrades = 1;
    } else if (grades[i].equals("F")) {
      valueGrades = 0;
    } else {}
    return valueGrades;
  }

  /**
   *The method calculates the average of the grades for each term
   *when user input 1 calculates the average of the first term
   *and on input 2 calculates the average of term 2 and displays the result.
   */
  public static void calculatorSemester() {
    double semestersFrist = 0;
    double semestersSecond = 0;
    double semestersUnitFrist = 0; //first semester credit total
    double semestersUnitSecond = 0; //Total credit semester second
    double avgFrist = 0; // first semester grade average
    double avgSecond = 0; //second semester grade average
    for (int i = 0; i < numCourses; i++) {
      if (semesters[i] == 1) {
        semestersUnitFrist += units[i];
        semestersFrist += calculatorGrades(i) * units[i];
        avgFrist = semestersFrist / semestersUnitFrist;
      } else if (semesters[i] == 2) {
        semestersUnitSecond += units[i];
        semestersSecond += calculatorGrades(i) * units[i];
        avgSecond = semestersSecond / semestersUnitSecond;
      }
    }
    System.out.print("Enter the semster that you want to see:");
    int choiceSemester = input.nextInt();
    if (choiceSemester == 1) {
      System.out.printf("The GPA of the semester 1 is %.2f \n", avgFrist);
    } else {
      System.out.printf("The GPA of the semester 2 is %.2f \n", avgSecond);
    }
  }
}

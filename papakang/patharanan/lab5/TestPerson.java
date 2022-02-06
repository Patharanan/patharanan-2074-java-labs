/**TestPerson is a main program for creating and running objects from class Person
 * @Auther Patharanan Papakang
 * @version 1 28,Jan 2022
 * ID : 643040207-4
 * Sec : 2
 */
package papakang.patharanan.lab5;

public class TestPerson {

  public static void main(String[] args) {
    Person unknow = new Person();
    System.out.println(unknow);
    System.out.println(
      Person.getNumberOfPerson() + " person has been created."
    );
    Person ronaldo = new Person("Ronaldo");
    Person messi = new Person("Messi", 167, 63);
    System.out.println(ronaldo);
    System.out.println(messi);
    Person pele = new Person("Pele", 185, 85);
    System.out.println(pele);
    System.out.println(messi.getName() + "'s BMI is " + messi.getBMI());
    System.out.println(pele.getName() + "'s BMI is " + pele.getBMI());
    pele.setWeight(72);
    System.out.println(pele.getName() + "'s BMI is " + pele.getBMI());
    System.out.println(
      Person.getNumberOfPerson() + " persons have been created."
    );
  }
}

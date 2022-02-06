/**
 * Creating a new Person object and assigning it to the variable person.
 * and running objects from class Footballer and Programmer.
 * @Auther Patharanan Papakang
 * @version 1 05,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */
package papakang.patharanan.lab5;

public class TestPersonV3 {

  public static void main(String[] args) {
    Programmer mark = new Programmer(
      "Mark Zuckerberg",
      185,
      80,
      "1998-07-07",
      "Python",
      20
    );
    Footballer pele = new Footballer(
      "Pele",
      185,
      85,
      "1984-05-14",
      "Brazil",
      "Forward"
    );
    System.out.println(mark);
    System.out.println(pele);
    mark.howOld();
    pele.howOld();
    System.out.println(
      Person.getNumberOfPerson() + " person have been created."
    );
    PersonV2 mickey = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01");
    System.out.println(mickey);
    mickey =
      new Footballer(
        "Mickey Mouse",
        60,
        25,
        "1982-01-01",
        "Disney",
        "Midfield"
      );
    System.out.println(mickey);
    System.out.println(
      Person.getNumberOfPerson() + " person have been created."
    );
    mickey.compareAge(pele);
  }
}

/** TestPersonV2 is a main program for creating and running objects from class Personv2
 * Person class is a super class of this program.
 * @Auther Patharanan Papakang
 * @version 1 05,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */
package papakang.patharanan.lab5;

public class TestPersonV2 {

  public static void main(String[] args) {
    PersonV2 mark = new PersonV2("Mark Zuckerberg", 171, 80, "1984-05-14");
    PersonV2 bill = new PersonV2("Bill Gate", 177, 85, "1955-10-28");
    System.out.println(mark);
    System.out.println(bill);
    mark.howOld();
    bill.howOld();
    mark.compareAge(bill);
    bill.compareAge(mark);
    mark.isBirthday();
    bill.isBirthday();
    System.out.println(
      Person.getNumberOfPerson() + " person have been created."
    );
  }
}

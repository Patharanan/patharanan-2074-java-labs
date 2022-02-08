/**
 * Extending the Person class and adding a new field called.
 * @Auther Patharanan Papakang
 * @version 1 05,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */

package papakang.patharanan.lab5;

import java.time.LocalDate;
import java.time.Period;

public class PersonV2 extends Person {

  LocalDate dob;

  // The PersonV2 class is a subclass of Person. It has a constructor that takes a name, height, weight,
  // and date of birth.

  public PersonV2(String name, double height, double weight, String dob) {
    super(name, height, weight);
    this.dob = LocalDate.parse(dob);
  }

  /**
   * Get the date of birth of the person
   *
   * @return date of birth
   */
  public LocalDate getDOB() {
    return dob;
  }

  /**
   * The setDOB function sets the dob field of the Person class
   *
   * @param dob The date of birth of the person.
   */
  public void setDOB(LocalDate dob) {
    this.dob = dob;
  }

  /**
   * * Calculate the age of a person based on their date of birth
   */
  public void howOld() {
    LocalDate startDate = dob;
    LocalDate endtDate = LocalDate.now();
    Period period = Period.between(startDate, endtDate);
    System.out.println(
      name +
      " is " +
      period.getYears() +
      " years " +
      period.getMonths() +
      " months and " +
      period.getDays() +
      " days old."
    );
  }

  /**
   * Compare the age of two people
   *
   * @param bill The person to compare age to.
   */
  public void compareAge(PersonV2 bill) {
    // If the date of birth of the person is older than the date of birth of the bill, then print out the
    // number of years, months, and days between the two dates.
    if (dob.compareTo(bill.dob) < 0) {
      LocalDate startDate = dob;
      LocalDate endtDate = bill.dob;
      Period period = Period.between(startDate, endtDate);
      System.out.println(name + period.getYears() + " years " + period.getMonths() + " months and " + period.getDays() + " days older than " + bill.name );
    } else {
      LocalDate startDate = bill.dob;
      LocalDate endtDate = dob;
      Period period = Period.between(startDate, endtDate);
      System.out.println("Bull Gate is " + period.getYears() + " years " + period.getMonths() + " months and " + period.getDays() + " days older than Mark Zuckerberg");
    }
  }

  /**
   * If today is the person's birthday, print "Today is [name]'s Birthday." Otherwise, print "Today is
   * NOT [name]'s Birthday."
   */
  public void isBirthday() {
    LocalDate today = LocalDate.now();
    if (dob.getMonth() == today.getMonth() && dob.getDayOfMonth() == today.getDayOfMonth()) {
      System.out.println("Today is " + name + "'s Birthday.");
    } else {
      System.out.println("Today is NOT " + name + "'s Birthday.");
    }
  }

  @Override
  // The toString() method is a special method that is automatically called when you call the
  // toString() method on an object. The toString() method is used to return a string representation of
  // the object.
  public String toString() {
    String string = super.toString() + String.format(", Birthday = %s", dob);
    return string;
  }
}

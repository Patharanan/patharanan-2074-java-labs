/**
 *Extending the PersonV2 class and adding a new method.
 * The Programmer class is a subclass of the Person class.
 * The Programmer class has a constructor that calls the superclass constructor.
 * @Auther Patharanan Papakang
 * @version 1 05,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */

package papakang.patharanan.lab5;

public class Programmer extends PersonV2 {

  private String bestProgLang;
  private int yearofExperience;

  /**
   *  The Programmer class has a constructor that sets the name, height, weight, dob, and bestProgLang
   * fields
   * @param name name of person
   * @param height height  of person
   * @param weight  weight  of person
   * @param dob date of birth  of person
   * @param bestProgLang  best programming language
   * @param yearofExperience  year of experience
   */

  public Programmer(
    String name,
    int height,
    int weight,
    String dob,
    String bestProgLang,
    int yearofExperience
  ) {
    super(name, height, weight, dob);
    this.bestProgLang = bestProgLang;
    this.yearofExperience = yearofExperience;
  }

  /**
   * The getBestProgLang function returns the best programming language for the candidate
   *
   * @return The best programming language.
   */

  public String getBestProgLang() {
    return bestProgLang;
  }

  /**
   * The setter method for the bestProgLang field
   *
   * @param bestProgLang The best programming language for this person.
   */
  public void setBestProgLang(String bestProgLang) {
    this.bestProgLang = bestProgLang;
  }

  /**
   * Get the year of experience of the employee
   *
   * @return The number of year of experience.
   */
  public int getYearOfExpericence() {
    return yearofExperience;
  }

  /**
   * The setYearOfExpericence method sets the year of experience of the employee
   *
   * @param yearofExperience The number of years of experience.
   */
  public void setYearOfExpericence(int yearofExperience) {
    this.yearofExperience = yearofExperience;
  }

  /**
   * The toString() method is  object is converted to a string.
   * The toString() method is overridden to return a string representation of the object.
   * @return string Best Programming Language and   Year of Experience
   */
  @Override
  public String toString() {
    String string =
      super.toString() +
      String.format(
        ", Best Programming Language  = %s, Year of Experience = %s",
        bestProgLang,
        yearofExperience
      );
    return string;
  }
}

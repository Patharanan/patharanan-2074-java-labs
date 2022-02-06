/**Person class is a super class of this program.
 * @Auther Patharanan Papakang
 * @version 1 05,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */
package papakang.patharanan.lab5;

class Person {

  protected String name;
  protected double height;
  protected double weight;
  protected static int numberOfPerson = 0;

  // Create a new Person object with the given name, height, and weight.
  public Person(String name, double height, double weight) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    numberOfPerson++;
  }

  // Creating a new Person object and setting the name to the newName parameter.

  public Person(String newName) {
    this.name = newName;
    numberOfPerson++;
  }

  // Creating a new person with a name of unknown and a count of 1.

  public Person() {
    name = "unknown";
    numberOfPerson++;
  }

  /**
   * The getName function returns the name variable
   *
   * @return The name of the person.
   */
  public String getName() {
    return name;
  }

  /**
   * The function sets the name of the person
   *
   * @param newName The new name of the person.
   */
  public void setName(String newName) {
    this.name = newName;
  }

  /**
   * Return the height of the person.
   *
   * @return The height of the person.
   */
  public double getHeight() {
    return height;
  }

  /**
   * The setHeight function sets the height of the person.
   *
   * @param newHeight The new height of the person.
   */
  public void setHeight(double newHeight) {
    this.height = newHeight;
  }

  /**
   * Get the weight of the animal
   *
   * @return The weight of the person.
   */
  public double getWeight() {
    return weight;
  }

  /**
   * The setWeight function sets the weight of the person to the newWeight
   *
   * @param newWeight The new weight to set.
   */
  public void setWeight(double newWeight) {
    this.weight = newWeight;
  }

  /**
   * Prints a string representation of the object
   *
   * @return The string "name =, height =  cm.  weight =  kg."
   */
  public String toString() {
    String string = String.format(
      "name = %s, height = %.2f, cm.  weight = %.2f kg.",
      name,
      height,
      weight
    );
    return string;
  }

  /**
   * Return the number of person in the database
   *
   * @return The number of person.
   */
  public static int getNumberOfPerson() {
    return numberOfPerson;
  }

  /**
   * Calculate the BMI of a person given their weight and height
   *
   * @return The BMI value as a string.
   */
  public String getBMI() {
    double valueBMI = weight / ((height / 100) * (height / 100));
    return String.format("%.2f", valueBMI);
  }
}

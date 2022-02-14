package papakang.patharanan.lab6;

public class AppleWatch extends MobileDevice {

  private String modelName;

  // The constructor is a special method that is called when an object is created.
  public AppleWatch(String color, double price, String modelName) {
    setColor(color);
    setPrice(price);
    this.modelName = modelName;
  }

  /**
   * `setmodelName is a function that sets the model name
   *
   * @param modelName The name of the model to be created.
   */
  public void setmodelName(String modelName) {
    this.modelName = modelName;
  }

  /**
   * Returns the name of the model
   *
   * @return The model name.
   */
  public String getModelName() {
    return modelName;
  }

  /**
   * It prints out the AppleWatch object in a readable format.
   *
   * @return The toString method is overridden to return a String that contains the color, price, and
   * modelName of the AppleWatch.
   */
  @Override
  public String toString() {
    String string = String.format(
      "AppleWatch(color:%s, price:%.1f,  modelName:%s) ",
      color,
      price,
      modelName
    );
    return string;
  }

  /**
   * Returns true if the user is watching the repository
   *
   * @return The method isWatch() returns a boolean value of true.
   */
  public boolean isWatch() {
    return true;
  }

  /**
   * @return The price of the product.
   */
  public double price() {
    return price;
  }
}

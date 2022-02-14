/**An interface is acompletely "adstract class" that is used to group related methods.
 *@Auther Patharanan Papakang
 * @version 1 11,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */
package papakang.patharanan.lab6;

public abstract class MobileDevice {

  //Declaration variable,color,and price as protected
  protected String color;
  protected Double price;

  /**
   * Get the color of the mobile
   *
   * @return The color.
   */
  public String getColor() {
    return color;
  }

  /**
   * The function sets the color of the mobile
   *
   * @param color The color of the mobile.
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Get the price of the product.
   * @return The price of the product.
   */
  public double getPrice() {
    return price;
  }

  /**
   * The setPrice function sets the price of the product
   *
   * @param price The price of the product.
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * implement the method isWatch() to return type is boolean.
   *
   * @return The return type is boolean. The return value is true if the file is being watched, and
   * false otherwise.
   */
  public abstract boolean isWatch();
}

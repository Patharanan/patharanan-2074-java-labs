package papakang.patharanan.lab6;

public class IPadAir extends MobileDevice {

  static String CHIP_NAME = "A14 Bionic";
  private double storage;

  // A constructor.
  public IPadAir(String color, double price, double storage) {
    setColor(color);
    setPrice(price);
    this.storage = storage;
  }

  /**
   * Method getStorage is return storage of IpadAir
   *
   * @return The storage
   */
  public double getStorage() {
    return storage;
  }

  /**
   * It sets the storage of IPadAir.
   *
   * @param storage The amount of storage.
   */
  public void setStorage(double storage) {
    this.storage = storage;
  }

  /**
   * Create a string representation of an object
   *
   * @return The string "iPadAir(color: (color of Ipadair), price: valueprice, storage: valuestorage )"
   */
  @Override
  public String toString() {
    String string = String.format(
      "iPadAir(color: %s, price: %.1f,  storage: %.1f)",
      color,
      price,
      storage
    );
    return string;
  }

  /**
   * Returns false.
   *
   * @return The return type is boolean.
   */
  public boolean isWatch() {
    return false;
  }

  /**
   * Returns the name of the chip
   *
   * @return The name of the chip.
   */
  public static String getChipName() {
    return CHIP_NAME;
  }

  /**
   * Return the price of the product.
   *
   * @return The price of the product.
   */
  public double price() {
    return price;
  }
}

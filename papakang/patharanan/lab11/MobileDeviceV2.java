/**
 * This program is get and set param of object.
 * @Auther Patharanan Papakang
 * @Version 1 25 Mar,2022
 */

package papakang.patharanan.lab11;

import papakang.patharanan.lab6.MobileDevice;

public class MobileDeviceV2 extends MobileDevice {

  protected String brandName, modelName, mobileOS, type;
  protected double weight;

  // A constructor.
  public MobileDeviceV2(
    String brandName,
    String modelName,
    String color,
    double weight,
    double price,
    String mobileOS,
    String type
  ) {
    setBrandName(brandName);
    setModelName(modelName);
    setColor(color);
    setWeight(weight);
    setPrice(price);
    setMobileOS(mobileOS);
    setType(type);
  }

  /**
   * It prints the details of the mobile phone.
   *
   * @return The string representation of the object.
   */
  @Override
  public String toString() {
    String string = String.format(
      " Brand Name :%s, Model Name : %S, Color : %s, Weight :%.3f, Price :%.1f, Mobile OS : %s, Type : %s ",
      brandName,
      modelName,
      color,
      weight,
      price,
      mobileOS,
      type
    );
    return string;
  }

  @Override
  public boolean isWatch() {
    // TODO Auto-generated method stub
    return false;
  }

  /**
   * Set string brandName is this
   *
   * @param brandName The name of the brand.
   */
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  /**
   *
   *
   * @return The string brand name.
   */
  public String getBrandName() {
    return brandName;
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
   * `setModelName` sets the model name
   *
   * @param modelName The name of the model.
   */
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  /**
   * The setter method for the weight property
   *
   * @param weight   weight.
   */
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * Get the weight of the animal
   *
   * @return double of weight.
   */
  public Double getWeight() {
    return weight;
  }

  /**
   * It sets the mobileOS property of the MobileDevice object.
   *
   * @param mobileOS The mobile operating system.
   */
  public void setMobileOS(String mobileOS) {
    this.mobileOS = mobileOS;
  }

  /**
   * return string of mobileOS
   *
   * @return string variable mobileOS.
   */
  public String getMobileOS() {
    return mobileOS;
  }

  /**
   * set the type of the object
   *
   * @param type The type of the parameter.
   */

  public void setType(String type) {
    this.type = type;
  }

  /**
   * Returns the type of the object
   *
   * @return The type of the object.
   */
  public String getType() {
    return type;
  }
}

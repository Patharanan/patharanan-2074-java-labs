package papakang.patharanan.lab11;

import papakang.patharanan.lab6.MobileDevice;

public class MobileDeviceV2 extends MobileDevice {

  protected String brandName, modelName, mobileOS, type;
  protected double weight;

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

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getModelName() {
    return modelName;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Double getWeight() {
    return weight;
  }

  public void setMobileOS(String mobileOS) {
    this.mobileOS = mobileOS;
  }

  public String getMobileOS() {
    return mobileOS;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}

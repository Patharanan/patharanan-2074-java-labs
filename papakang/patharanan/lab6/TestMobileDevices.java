package papakang.patharanan.lab6;

public class TestMobileDevices {

  public static void main(String[] args) {
    IPadAir ipadAir1 = new IPadAir("Rose Gold", 19900.0, 64.0);
    IPadAir ipadAir2 = new IPadAir("Silver", 24900.0, 256.0);
    AppleWatch appleWatch1 = new AppleWatch(
      "Silver",
      9400.0,
      "Apple Watch Nike SE GPS"
    );
    System.out.println("iPadAir chip name is " + IPadAir.getChipName());
    if (ipadAir2.isWatch()) {
      System.out.println(ipadAir2 + " is a watch");
    } else {
      System.out.println(ipadAir2 + " is not a watch");
    }
    comparePrice(ipadAir1, ipadAir2);
    comparePrice(ipadAir1, appleWatch1);
  }

  private static void comparePrice(MobileDevice obj1, MobileDevice obj2) {
    if (obj1.getPrice() < obj2.getPrice()) {
      System.out.println(obj1 + " is cheaper than iPadAir" + obj2);
    } else if (obj1.getPrice() > obj2.getPrice()) {
      System.out.println(obj2 + " is cheaper than iPadAir" + obj1);
    } else {
      System.out.println(obj1 + " price is qual with" + obj2);
    }
  }
}

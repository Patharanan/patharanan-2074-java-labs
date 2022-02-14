package papakang.patharanan.lab6;

import java.util.*;

public class SortMobileDevicesByPrice implements Comparator<MobileDevice> {

  /**
   * Compare two mobile devices by price
   *
   * @param device1 The first object to compare.
   * @param device2 The object to compare to.
   * @return The method returns an integer difference device1 with device2 .
   */
  public int compare(MobileDevice device1, MobileDevice device2) {
    return (int) (device1.price - device2.price);
  }
}

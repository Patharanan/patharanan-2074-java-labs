/**This class implements the Comparator interface and  compare method
 * @Auther Patharanan Papakang
 * @version 1 13,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */
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

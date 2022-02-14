/** This class implements the Comparator interface and is used to sort a list of MobileDevice objects by
 * multiple attributes
 * @Auther Patharanan Papakang
 * @version 1 13,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */
package papakang.patharanan.lab6;

import java.util.*;

public class SortMobileDevicesByMultipleAttrs
  implements Comparator<MobileDevice> {

  /**
   * Compare two mobile devices by price, then by color, then by storage, then by model name.
   * If both mobile device are iPadAir, comparing storage and then color
   * If both mobile device are AppleWatch, comparing model name and then color
   * If mobile device are in different types types(one is iPadAir and the other is Apple Watch),comparing color
   * @param device1 The first device to compare.
   * @param device2 The second object to compare.
   * @return The method returns the result of the comparison of the two devices.
   */
  public int compare(MobileDevice device1, MobileDevice device2) {
    int priceCompare = new SortMobileDevicesByPrice().compare(device1, device2);
    int colorCompare = new SortByColor().compare(device1, device2);

    if (device1 instanceof IPadAir && device2 instanceof IPadAir) {
      int storageCompare = new SortByStorage().compare(device1, device2);
      if (priceCompare == 0) {
        return ((storageCompare == 0) ? colorCompare : storageCompare);
      } else {
        return priceCompare;
      }
    } else if (device1 instanceof AppleWatch && device2 instanceof AppleWatch) {
      int modelNameCompare = new SortmodelName().compare(device1, device2);
      if (priceCompare == 0) {
        return ((modelNameCompare == 0)) ? colorCompare : modelNameCompare;
      } else {
        return priceCompare;
      }
    } else {
      return ((priceCompare == 0)) ? colorCompare : priceCompare;
    }
  }

  class SortByStorage implements Comparator<MobileDevice> {

    /**
     * *Compare the storage of two devices.*
     *
     * @param device1 The first object to compare.
     * @param device2 The object to compare to device1.
     * @return The result of the comparison of storage. (value is integer)
     */
    public int compare(MobileDevice device1, MobileDevice device2) {
      return (int) (
        ((IPadAir) device1).getStorage() - ((IPadAir) device2).getStorage()
      );
    }
  }

  class SortByColor implements Comparator<MobileDevice> {

    /**
     * Compare the colors of two mobile devices
     *
     * @param device1 The first object to compare.
     * @param device2 The object to compare to.
     * @return The result of the comparison of the colors of the two devices.
     */
    public int compare(MobileDevice device1, MobileDevice device2) {
      return device1.getColor().compareTo(device2.getColor());
    }
  }

  class SortmodelName implements Comparator<MobileDevice> {

    /**
     * Compare the model name of two AppleWatch objects
     *
     * @param device1 The first object to compare.
     * @param device2 The object to compare to device1.
     * @return The result of the comparison of the model names of the two devices.
     */
    public int compare(MobileDevice device1, MobileDevice device2) {
      return ((AppleWatch) device1).getModelName()
        .compareTo(((AppleWatch) device2).getModelName());
    }
  }
}

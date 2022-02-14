/**TestMobileDevices2 class running objects from class IPadAir,class AppleWatch,class sortmobiledevicesbyprice
 * @Auther Patharanan Papakang
 * @version 1 14,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */

package papakang.patharanan.lab6;

import java.util.*;

public class TestMobileDevices2 {

  public static void main(String[] args) {
    ArrayList mobileDevices = new ArrayList<MobileDevice>();
    mobileDevices.add(new IPadAir("Rose Gold", 19900.0, 64.0));
    mobileDevices.add(new IPadAir("Silver", 24900.0, 256.0));
    mobileDevices.add(
      new AppleWatch("Silver", 9400.0, "Apple Watch Nike SE GPS")
    );
    System.out.println("=== Before sorting ===");
    System.out.println(mobileDevices);
    Collections.sort(mobileDevices, new SortMobileDevicesByPrice());
    System.out.println("=== After sorting ===");
    System.out.println(mobileDevices);
  }
}

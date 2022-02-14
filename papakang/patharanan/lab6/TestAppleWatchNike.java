/**TestAppleWatch class running objects from class IPadAir , class AppleWatch and class AppleWatchNike
 *running displayRunningStats,displayHeartRates,displaySleepHours
 * @version 1 15,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */

package papakang.patharanan.lab6;

public class TestAppleWatchNike {

  public static void main(String[] args) {
    AppleWatch appleWatch1 = new AppleWatch(
      "Silver",
      9400.0,
      "Apple Watch Nike SE GPS"
    );
    AppleWatchNike appleWatch2 = new AppleWatchNike(
      "Black",
      10000,
      "Apple Watch Nike SE 7"
    );
    AppleWatchNike appleWatch3 = new AppleWatchNike(
      "Navy",
      12000,
      "Apple Watch Nike SE 8",
      6,
      8,
      48,
      140,
      150,
      8
    );
    System.out.println(appleWatch1);
    System.out.println(appleWatch2);
    appleWatch2.displayRunningStats();
    appleWatch2.displayHeartRates();
    appleWatch2.displaySleepHours();
    System.out.println(appleWatch3);
    appleWatch3.displayRunningStats();
    appleWatch3.displayHeartRates();
    appleWatch3.displaySleepHours();
  }
}

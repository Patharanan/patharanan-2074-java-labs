/**This program extends from MobileDeviceFormV8 and implements ListSelectionListener.
 *Implements method valueChanged()
 * When selected the one or more items in a list are selected,a dialog will be display message.
 * @Auther Patharanan Papakang
 * @Version 2,11 Mar,2022
 *
 */
package papakang.patharanan.lab9;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MobileDeviceFormV9
  extends MobileDeviceFormV8
  implements ListSelectionListener {

  public MobileDeviceFormV9(String titel) {
    super(titel);
  }

  /**
   * This method will be display a dialog message
   * Message is  "Features : " and items in a list are selected.
   */
  @Override
  public void valueChanged(ListSelectionEvent e) {
    String string =
      "Feature : " +
      featuresList
        .getSelectedValuesList()
        .toString()
        .replace("[", "")
        .replace("]", "");
    JOptionPane.showMessageDialog(null, string);
  }

  /**
   * Method addListeners() is
   * Adds a listener to the list, to be notified each time a change to the selection.
   */
  @Override
  public void addListeners() {
    super.addListeners();
    featuresList.addListSelectionListener(this);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV9 mobileDeviceFromV9 = new MobileDeviceFormV9(
      "Mobile Device Form V9"
    );
    mobileDeviceFromV9.addComponents();
    mobileDeviceFromV9.addMenus();
    mobileDeviceFromV9.addListeners();
    mobileDeviceFromV9.setFrameFeatures();
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          createAndShowGUI();
        }
      }
    );
  }
}

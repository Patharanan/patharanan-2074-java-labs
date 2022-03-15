/** MobileDeviceFormV8 extends MobileDeviceFormV7 and implements interface ItemListener
 * When the value of the radio button and combobox changes, a dialog will be displayed showing the message.
 * @Auther Patharanan Papakang
 * @Version 1,11 Mar,2022
 */
package papakang.patharanan.lab9;

import java.awt.event.*;
import javax.swing.*;

public class MobileDeviceFormV8
  extends MobileDeviceFormV7
  implements ItemListener {

  public MobileDeviceFormV8(String titel) {
    super(titel);
  }

  /**
   *  When the value of the radio button change.
   *  a dialog will be displayed showing the message.
   * if should android button will be showing "Mobile OS is updated to Android"
   * if should ios button will be showing "Mobile OS is updated to ios"
   *  a dialog will be display showing the message as show
   *which item in the combo box are selected
   */
  public void itemStateChanged(ItemEvent e) {
    Object src = e.getSource();

    if (e.getStateChange() == ItemEvent.SELECTED) {
      if (src == iOSJRB || src == androidJRB) { //Compares this string to the "ios".
        String string =
          "Mobile OS is updated to " +
          mobileGrp.getSelection().getActionCommand();
        JOptionPane.showMessageDialog(null, string);
      } else if (src == typeComboBox) { //which item in the combo box are selected
        String string = "Type is updated to  " + typeComboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, string); // show message dialog
      }
    }
  }

  @Override
  public void addListeners() {
    super.addListeners();
    typeComboBox.addItemListener(this);
    androidJRB.addItemListener(this);
    iOSJRB.addItemListener(this);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV8 mobileDeviceFromV8 = new MobileDeviceFormV8(
      "Mobile Device Form V8"
    );
    mobileDeviceFromV8.addComponents();
    mobileDeviceFromV8.addMenus();
    mobileDeviceFromV8.addListeners();
    mobileDeviceFromV8.setFrameFeatures();
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

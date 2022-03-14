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
   */
  public void itemStateChanged(ItemEvent e) {
    AbstractButton button = (AbstractButton) e.getItemSelectable();

    String string;
    if (e.getStateChange() == ItemEvent.SELECTED) {
      String radioButton = button.getActionCommand(); //Returns the action command for this button.
      if (radioButton.equals("ios")) { //Compares this string to the "ios".
        string = "Mobile OS is updated to ios";
        JOptionPane.showMessageDialog(null, string);
      } else if (radioButton.equals("Androind")) { //Compares this string to the "Androind".
        string = "Mobile OS is updated to Android"; // message dialog
        JOptionPane.showMessageDialog(null, string); // show message dialog
      }
    }
  }

  /**
   * actionevent the event to be processed
   * a dialog will be display showing the message as show
   *which item in the combo box are selected
   */
  ActionListener typeComboBoxActionListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      String selectTypeComboboxMassageDialog =
        "Type is updated to " + typeComboBox.getSelectedItem().toString();
      JOptionPane.showMessageDialog(null, selectTypeComboboxMassageDialog); // show message dialog
    }
  };

  @Override
  public void addListeners() {
    super.addListeners();
    androidJRB.addItemListener(this);
    iOSJRB.addItemListener(this);
    typeComboBox.addActionListener(typeComboBoxActionListener);
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

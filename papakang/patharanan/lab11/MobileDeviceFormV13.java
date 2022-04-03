/**This  create an instance of class MobileDeviceV2 using information filled in the form.
 * To get data from all text fields.
 * Output the information of all the added devices to the terminal window
 * @Auther Patharanan Papakang
 * @Version 1 25 Mar,2022
 */
package papakang.patharanan.lab11;

import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import papakang.patharanan.lab10.MobileDeviceFormV12;

public class MobileDeviceFormV13 extends MobileDeviceFormV12 {

  // Creating an empty list of mobile devices.
  protected ArrayList<MobileDeviceV2> deviceList;

  public MobileDeviceFormV13(String titel) {
    super(titel);
    // This is creating an empty list of mobile devices.
    deviceList = new ArrayList<MobileDeviceV2>();
  }

  /**
   * It adds a new mobile device to the list.
   *
   * @param e The event that triggered the action.
   */

  @Override
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);
    Object src = e.getSource();
    if (src == okButton) {
      createMobileDeviceV2();
      printMobileDeviceV2();
    }
  }

  /**
   * Prints out the list of mobile devices
   */
  public void printMobileDeviceV2() {
    System.out.print("[");

    for (MobileDeviceV2 i : deviceList) {
      System.out.println(i);
    }
    System.out.println("]");
  }

  /**
   *   Creating a new mobile device object.
   */
  public void createMobileDeviceV2() {
    MobileDeviceV2 mobileDeviceV2 = new MobileDeviceV2(
      txtBrand.getText(),
      txtModel.getText(),
      txtColor.getText(),
      Double.parseDouble(txtWeight.getText()),
      Double.parseDouble(txtPrice.getText()),
      mobileGrp.getSelection().getActionCommand(),
      typeComboBox.getSelectedItem().toString()
    );

    deviceList.add(mobileDeviceV2);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV13 mobileDeviceFromV13 = new MobileDeviceFormV13(
      "Mobile Device Form V13"
    );
    mobileDeviceFromV13.addComponents();
    mobileDeviceFromV13.addMenus();
    mobileDeviceFromV13.addListeners();
    mobileDeviceFromV13.setFrameFeatures();
    mobileDeviceFromV13.colorChooser();
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

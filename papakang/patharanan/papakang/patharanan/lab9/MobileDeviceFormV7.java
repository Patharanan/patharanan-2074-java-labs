/**This program extends MobileDeviceFormV6 and implements  interface ActionListener
 * Implement the method addListeners() which was called in createAndShowGUI()
 *  it adds listeners to OK button and Cancel button.
 * @Auther Patharanan Papakang
 * @Version 1,11 Mar,2022
 */
package papakang.patharanan.lab9;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import papakang.patharanan.lab8.MobileDeviceFormV6;

public class MobileDeviceFormV7
  extends MobileDeviceFormV6
  implements ActionListener {

  public MobileDeviceFormV7(String titel) {
    super(titel);
  }

  /**
   * Override the method actionPerformed()
   * When the OK button is pressed a dialog is displayed showing all the information that is currently input. This includes Brand name, Model name, Color, Weight, Price, Mobile OS, Type, Review, and Features.
   * For components that have multiple selections
   * When the Cancel button is pressed, all the text fields and text area will be empty.
   * The Mobile OS will be reset back to Android. Type resets Phone. And all item in Features will be deselected
   */
  @Override
  public void actionPerformed(ActionEvent e) { //e is event object
    Object srcObj = e.getSource();
    androidJRB.setActionCommand("Androind"); //set action command for android button.
    iOSJRB.setActionCommand("ios"); //set action command for ios button.

    if (srcObj == cancelButton) {
      txtBrand.setText("");
      txtModel.setText("");
      txtColor.setText("");
      txtWeight.setText("");
      txtPrice.setText("");
      androidJRB.setSelected(true); //Mobile OS be reset back to Android
      typeComboBox.setSelectedItem("Phone"); //Type resets Phone
      reviewTxtArea.setText("");
      featuresList.clearSelection();
    } else if (srcObj == okButton) {
      String[] total = {
        "Brand Name : " + txtBrand.getText(),
        "Model Name : " + txtModel.getText(),
        "Color : " + txtColor.getText(),
        "Weight(kg.) : " + txtWeight.getText(),
        "Price(Baht) : " + txtPrice.getText(),
        "Mobile OS : " + mobileGrp.getSelection().getActionCommand(),
        "Type : " + typeComboBox.getSelectedItem(),
        "Review : " + reviewTxtArea.getText(),
        "Features : " +
        featuresList
          .getSelectedValuesList()
          .toString()
          .replace("[", "")
          .replace("]", ""),
      };

      JOptionPane.showMessageDialog(null, total);
      System.exit(0);
    }
  }

  public void addListeners() {
    //specify listener object to listen to source object
    androidJRB.setActionCommand("Androind");
    iOSJRB.setActionCommand("ios");
    cancelButton.addActionListener(this);
    okButton.addActionListener(this);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV7 mobileDeviceFromV7 = new MobileDeviceFormV7(
      "Mobile Device Form V7"
    );
    mobileDeviceFromV7.addComponents();
    mobileDeviceFromV7.addMenus();
    mobileDeviceFromV7.addListeners();
    mobileDeviceFromV7.setFrameFeatures();
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

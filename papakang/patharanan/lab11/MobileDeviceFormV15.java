/**This program check if model name and weight text field is empty.
 * Check if the entered weight is a number.
 * @Auther Patharanan Papakang
 * @Version 1 3 April,2022
 */
package papakang.patharanan.lab11;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class MobileDeviceFormV15 extends MobileDeviceFormV14 {

  protected double weightCompare;
  protected double MIN_WEIGHT = 0.01, MAX_WEIGHT = 1.0;

  public MobileDeviceFormV15(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();
    if (src == okButton) {
      // This is checking if the entered model name is empty. If it is empty, display a dialog message.
      if (txtModel.getText().hashCode() == 0) {
        JOptionPane.showMessageDialog(this, "Please enter model name");
      }

      // This is checking if the entered weight is empty. If it is empty, display a dialog message.
      if (txtWeight.getText().hashCode() == 0) {
        JOptionPane.showMessageDialog(this, "Please enter weight");
      } else if (
        !(
          (
            txtWeight.getText().hashCode() == 0 ||
            txtModel.getText().hashCode() == 0
          )
        )
      ) {
        try {
          weightCompare = Double.parseDouble(txtWeight.getText());
          // This is checking if the entered weight is between 0.01 and 1.0. If it is, then it will
          // execute the code.
          if (weightCompare >= MIN_WEIGHT && weightCompare <= MAX_WEIGHT) {
            actionOKButton();
            createMobileDeviceV2();
            printMobileDeviceV2();
          } else {
            // Checking if the entered weight is less than 0.01. If it is less than 0.01, display a
            // dialog message.
            if (weightCompare < MIN_WEIGHT) {
              JOptionPane.showMessageDialog(
                this,
                "Too light: valid weight is [0.01,1.0]"
              );
            } else {
              JOptionPane.showMessageDialog(
                this,
                "Too heavy: valid weight is [0.01,1.0]"
              );
            }
          }
        } catch (NumberFormatException nfe) { //If the entered weight is not a number, display a dialog message
          JOptionPane.showMessageDialog(
            this,
            "Please enter only number for weight"
          );
        }
      }
    } else {
      super.actionPerformed(e);
    }
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV15 mobileDeviceFromV15 = new MobileDeviceFormV15(
      "Mobile Device Form V15"
    );
    mobileDeviceFromV15.addComponents();
    mobileDeviceFromV15.addMenus();
    mobileDeviceFromV15.addListeners();
    mobileDeviceFromV15.setFrameFeatures();
    mobileDeviceFromV15.colorChooser();
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

/**
 * @Auther Patharanan Papakang
 * @Version 1,11 Mar,2022
 */
package papakang.patharanan.lab9;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import papakang.patharanan.lab8.MobileDeviceFormV6;

public class MobileDeviceFormV7 extends MobileDeviceFormV6 {

  protected ButtonHandler buttonListener; //listener object

  public MobileDeviceFormV7(String titel) {
    super(titel);
    buttonListener = new ButtonHandler();
  }

  class ButtonHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) { //e is event object
      Object srcObj = e.getSource();
      androidJRB.setActionCommand("Androind");
      iOSJRB.setActionCommand("ios");

      if (srcObj == cancelButton) {
        txtBrand.setText("");
        txtModel.setText("");
        txtColor.setText("");
        txtWeight.setText("");
        txtPrice.setText("");
        androidJRB.setSelected(true);
        typeComboBox.setSelectedItem("Phone");
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
  }

  public void addListeners() {
    //specify listener object to listen to source object
    cancelButton.addActionListener(buttonListener);
    okButton.addActionListener(buttonListener);
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

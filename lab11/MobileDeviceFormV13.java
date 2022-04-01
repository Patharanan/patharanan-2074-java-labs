package papakang.patharanan.lab11;

import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import papakang.patharanan.lab10.MobileDeviceFormV12;

public class MobileDeviceFormV13 extends MobileDeviceFormV12 {

  protected ArrayList<MobileDeviceV2> deviceList;

  public MobileDeviceFormV13(String titel) {
    super(titel);
    deviceList = new ArrayList<MobileDeviceV2>();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);
    Object src = e.getSource();
    if (src == okButton) {
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
      for (MobileDeviceV2 i : deviceList) {
        System.out.println(i);
      }
    }
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV13 mobileDeviceFromV13 = new MobileDeviceFormV13(
      "Mobile Device Form V10"
    );
    mobileDeviceFromV13.addComponents();
    mobileDeviceFromV13.addMenus();
    mobileDeviceFromV13.addListeners();
    mobileDeviceFromV13.setFrameFeatures();
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

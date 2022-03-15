package papakang.patharanan.lab10;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import papakang.patharanan.lab9.MobileDeviceFormV9;

public class MobileDeviceFormV10 extends MobileDeviceFormV9 {

  public MobileDeviceFormV10(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  //   @Override
  //   public void actionPerformed(ActionEvent e) {
  //     if (e.getSource() == configMenu) {
  //       if (colorSubMenu.equals("red")) {
  //         txtBrand.setForeground(Color.RED);
  //         txtModel.setForeground(Color.RED);
  //         txtColor.setForeground(Color.RED);
  //         txtPrice.setForeground(Color.RED);
  //         txtWeight.setForeground(Color.RED);
  //         androidJRB.setForeground(Color.RED);
  //         iOSJRB.setForeground(Color.RED);
  //         reviewTxtArea.setForeground(Color.RED);
  //         featuresList.setForeground(Color.RED);
  //       }
  //     }
  //   }

  ActionListener configMenuActionListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == redColorItem) {
        txtBrand.setForeground(Color.RED);
        txtModel.setForeground(Color.RED);
        txtColor.setForeground(Color.RED);
        txtPrice.setForeground(Color.RED);
        txtWeight.setForeground(Color.RED);
        androidJRB.setForeground(Color.RED);
        iOSJRB.setForeground(Color.RED);
        typeComboBox.setForeground(Color.RED);
        reviewTxtArea.setForeground(Color.RED);
        featuresList.setForeground(Color.RED);
      } else if (e.getSource() == blueColorItem) {
        txtBrand.setForeground(Color.BLUE);
        txtModel.setForeground(Color.BLUE);
        txtColor.setForeground(Color.BLUE);
        txtPrice.setForeground(Color.BLUE);
        txtWeight.setForeground(Color.BLUE);
        androidJRB.setForeground(Color.BLUE);
        iOSJRB.setForeground(Color.BLUE);
        typeComboBox.setForeground(Color.BLUE);
        reviewTxtArea.setForeground(Color.BLUE);
        featuresList.setForeground(Color.BLUE);
      } else if (e.getSource() == openItem) {}
    }
  };

  @Override
  public void addListeners() {
    super.addListeners();
    redColorItem.addActionListener(configMenuActionListener);
    blueColorItem.addActionListener(configMenuActionListener);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV10 mobileDeviceFromV10 = new MobileDeviceFormV10(
      "Mobile Device Form V10"
    );
    mobileDeviceFromV10.addComponents();
    mobileDeviceFromV10.addMenus();
    mobileDeviceFromV10.addListeners();
    mobileDeviceFromV10.setFrameFeatures();
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

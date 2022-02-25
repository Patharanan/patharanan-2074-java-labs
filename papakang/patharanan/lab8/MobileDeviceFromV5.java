package papakang.patharanan.lab8;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class MobileDeviceFromV5 extends MobileDeviceFromV4 {

  public MobileDeviceFromV5(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  public void addComponents() {
    super.addComponents();
    this.setFormValues();
    this.setFontsColors();
  }

  protected void setFormValues() {
    txtBrand.setText("Apple");
    txtModel.setText("iPad Air");
    txtColor.setText("Silver");
    txtWeight.setText("0.469");
    txtPrice.setText("24,900.00");

    reviewTxtArea.setText(
      "The iPad Air is Apple's mid-range tablet and the current model features a new design with flat edges, the A14 Bionic chip,a USB-C port, Touch ID, a range of color options, and more."
    );

    iOSJRB.setSelected(true);
    typeComboBox.setSelectedItem("Tablet");
  }

  protected void setFontsColors() {
    txtBrand.setFont(new Font("SansSerif", Font.BOLD, 14));
    txtModel.setFont(new Font("SansSerif", Font.BOLD, 14));
    txtColor.setFont(new Font("SansSerif", Font.BOLD, 14));
    txtWeight.setFont(new Font("SansSerif", Font.BOLD, 14));
    txtPrice.setFont(new Font("SansSerif", Font.BOLD, 14));
    reviewTxtArea.setFont(new Font("SansSerif", Font.BOLD, 14));

    brandNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    modelNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    colorLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    weightLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    priceLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    mobileLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    typeLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    reviewLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

    cancelButton.setForeground(Color.RED);
    okButton.setForeground(Color.BLUE);
  }

  public static void createAndShowGUI() {
    MobileDeviceFromV5 mobileDeviceFromV5 = new MobileDeviceFromV5(
      "Mobile Device From V5"
    );
    mobileDeviceFromV5.addComponents();
    mobileDeviceFromV5.addMenus();
    mobileDeviceFromV5.setFrameFeatures();
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

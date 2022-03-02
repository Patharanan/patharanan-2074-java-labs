/**
 * @Auther Patharanan Papakang
 * @Version 1 25,Feb 2022
 */
package papakang.patharanan.lab8;

import java.awt.*;
import javax.swing.*;

public class MobileDeviceFromV5 extends MobileDeviceFromV4 {

  // Creating two instance variables of the Font class.
  protected Font font14Plain, font14Bold;

  // This is the constructor of the class. It calls the constructor of the superclass.
  public MobileDeviceFromV5(String titel) {
    super(titel);
  }

  /**
   * this method is call method setFormValues and method setFrontsColors.
   */
  protected void addComponents() {
    super.addComponents();
    this.setFormValues();
    this.setFontsColors();
  }

  /**
   * This method set the form values of txtBrand,txtModel,txtColor,txtWeight,txtPrice
   * Set text of reviewTxtArea.
   * Set JRadiobutton to IOSJRB.
   * Set typeComboBox to Tablet
   */
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

  /**
   * Set the fonts  text fields
   * Set color of button.
   */
  protected void setFontsColors() {
    // This is creating a new font object with the name "SansSerif", the font style is bold, and the
    // font size is 14.
    font14Bold = new Font("SansSerif", Font.BOLD, 14);
    txtBrand.setFont(font14Bold);
    txtModel.setFont(font14Bold);
    txtColor.setFont(font14Bold);
    txtWeight.setFont(font14Bold);
    txtPrice.setFont(font14Bold);
    reviewTxtArea.setFont(font14Bold);

    // This is creating a new font object with the name "SansSerif", the font style is plain, and the
    // font size is 14.
    font14Plain = new Font("SansSerif", Font.PLAIN, 14);
    brandNameLabel.setFont(font14Plain);
    modelNameLabel.setFont(font14Plain);
    colorLabel.setFont(font14Plain);
    weightLabel.setFont(font14Plain);
    priceLabel.setFont(font14Plain);
    mobileLabel.setFont(font14Plain);
    typeLabel.setFont(font14Plain);
    reviewLabel.setFont(font14Plain);

    // This is setting the color cancelButton for red and okBUtton for blue.
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

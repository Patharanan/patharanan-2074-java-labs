/** MobileDeviceFormV1 which extends from MySimpleWindow
 * This program use class ButtonGroup to group two radio buttons together
 * and allow a user to choose only one radio button at a time.
 * and use JTextField,JLabel.
 * @Auther Patharanan Papakang
 * @version 1 18,Feb 2022
 *
 */

package papakang.patharanan.lab7;

import java.awt.*;
import javax.swing.*;

public class MobileDeviceFormV1 extends MySimpleWindow {

  protected JPanel Panel, mobilePanel, totalPanel;
  protected JLabel brandNameLabel, modelNameLabel, colorLabel, weightLabel, priceLabel, mobileLabel;
  protected JTextField txtBrand, txtModel, txtColor, txtWeight, txtPrice;
  protected JRadioButton androidJRB, iOSJRB;
  protected ButtonGroup mobileGrp;

  // This is a constructor.
  public MobileDeviceFormV1(String titel) {
    super(titel);
  }

  /**
   * This method creating a JLabel object brandNameLabel,modelNameLabel,colorLabel,priceLabelweightLabel,mobileLabel
   * and set the text of the label to "Brand Name:","Model Name:","Color:", "Weight(kg.):","Price(Bath):","Mobile OS:" respectively.
   * Creating a JTextField object named txtBrand,txtModel,txtColor,txtWeight,txtPrice and set the size of the text field to 15.
   * and adding a JLabel object and adding JTextFild object to the Panel object.
   */
  @Override
  protected void addComponents() {
    super.addComponents();

    brandNameLabel = new JLabel("Brand Name:");
    modelNameLabel = new JLabel("Model Name:");
    colorLabel = new JLabel("Color:");
    weightLabel = new JLabel("Weight(kg.):");
    priceLabel = new JLabel("Price(Bath):");
    mobileLabel = new JLabel("Mobile OS:");

    Panel = new JPanel(); // This is creating a JPanel object name Panel.
    mobilePanel = new JPanel(); // This is creating a JPanel object name mobilePanel.
    totalPanel = new JPanel(); // This is creating a JPanel object name totalPanel for collect Panel and mobilePanel.

    txtBrand = new JTextField(15);
    txtModel = new JTextField(15);
    txtColor = new JTextField(15);
    txtWeight = new JTextField(15);
    txtPrice = new JTextField(15);

    Panel.setLayout(new GridLayout(6, 2)); //set the layout of the panel to GridLayout 6 rows 2 columns.

    Panel.add(brandNameLabel);
    Panel.add(txtBrand);
    Panel.add(modelNameLabel);
    Panel.add(txtModel);
    Panel.add(colorLabel);
    Panel.add(txtColor);
    Panel.add(weightLabel);
    Panel.add(txtWeight);
    Panel.add(priceLabel);
    Panel.add(txtPrice);
    Panel.add(mobileLabel);

    androidJRB = new JRadioButton("Android"); // This is creating a JRadioButton object named androidJRB and set the text of the button to "Android".
    iOSJRB = new JRadioButton("iOS"); // This is creating a JRadioButton object named iOSJRB and set the text of the button to "iOS".
    mobileGrp = new ButtonGroup(); // This is creating a ButtonGroup object named mobileGrp
    mobileGrp.add(androidJRB); // adding androidJRB to the ButtonGroup object.
    mobileGrp.add(iOSJRB); // adding iOSJRB to the ButtonGroup object.

    mobilePanel.setLayout(new GridLayout()); // This is creating a GridLayout object named mobilePanel.

    // This is adding androidJRB and iOSJRB to the ButtonGroup object.
    mobilePanel.add(androidJRB);
    mobilePanel.add(iOSJRB);
    Panel.add(mobilePanel); // This is adding the mobilePanel to the Panel object.

    totalPanel.setLayout(new BorderLayout()); // This is adding a BorderLayout to the totalPanel object.
    totalPanel.add(Panel, BorderLayout.NORTH); // This is adding the Panel to the totalPanel object.

    this.add(totalPanel); // This is adding the totalPanel to the window.
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV1 msw = new MobileDeviceFormV1("Mobile Device Form V1");
    msw.addComponents();
    msw.setFrameFeatures();
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

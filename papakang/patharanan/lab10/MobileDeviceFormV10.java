/**This program  is menu items Red, Green, and Blue are selected, all the text’s’ colors change to the selected color.
 * and When the menu items font sizes 16, 20, and 24 are selected, all the text’s sizes change to the selected size number
 *  An open file chooser dialog is shown when the menu item Open is selected.
 *   A save file chooser dialog is shown when the menu item Save is selected.
 * @Auther Patharanan Papakang
 * @Version 1 21, Mar,2022
 */

package papakang.patharanan.lab10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import papakang.patharanan.lab9.MobileDeviceFormV9;

public class MobileDeviceFormV10 extends MobileDeviceFormV9 {

  // This is a way to declare a protected member variable.
  protected JFileChooser fileChooser = new JFileChooser();
  protected File file;

  public MobileDeviceFormV10(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  /**
   *  Set the color of the text fields to the color passed in
   *
   * @param color The color to set the text to.
   */

  protected void setColor(Color color) {
    txtBrand.setForeground(color);
    txtModel.setForeground(color);
    txtColor.setForeground(color);
    txtPrice.setForeground(color);
    txtWeight.setForeground(color);
    androidJRB.setForeground(color);
    iOSJRB.setForeground(color);
    typeComboBox.setEditable(false);
    typeComboBox.setForeground(color);
    reviewTxtArea.setForeground(color);
    featuresList.setForeground(color);
  }

  /**
   * * Set the font size for all the text fields and text areas
   * Set font plain
   *
   * @param size The size of the font.
   */
  protected void setFont(int size) {
    Font serifPlain = new FontUIResource("Serif", Font.PLAIN, size);
    txtBrand.setFont(serifPlain);
    txtModel.setFont(serifPlain);
    txtColor.setFont(serifPlain);
    txtWeight.setFont(serifPlain);
    txtPrice.setFont(serifPlain);
    androidJRB.setFont(serifPlain);
    iOSJRB.setFont(serifPlain);
    typeComboBox.setFont(serifPlain);
    reviewTxtArea.setFont(serifPlain);
    featuresList.setFont(serifPlain);
  }

  /**
   * This method set action for menu item to set text color,font,size
   * And save menu item,open menu item.
   *
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);

    if (e.getSource() == redColorItem) { //when event is redColorItem
      //calling method setColor to set text color to red color.
      setColor(Color.red);
    } else if (e.getSource() == blueColorItem) {
      //calling method setColor to set text color to blue color.
      setColor(Color.blue);
    } else if (e.getSource() == greenColorItem) {
      //calling method setColor to set text color to green color.
      setColor(Color.green);
    } else if (e.getSource() == size16Item) {
      //call method setFont and size of font is 16
      setFont(16);
    } else if (e.getSource() == size20Item) {
      //call method setFont and size of font is 20
      setFont(20);
    } else if (e.getSource() == size24Item) {
      //call method setFont and size of font is 24
      setFont(24);
    } else if (e.getSource() == openItem) {
      actionOpen();
    } else if (e.getSource() == saveItem) {
      actionSave();
    }
  }

  /**
   * Show a dialog box to select the file to save
   */
  public void actionSave() {
    int option = fileChooser.showSaveDialog(this); // Showing a dialog box to select the file to save.
    if (option == JFileChooser.APPROVE_OPTION) {
      file = fileChooser.getSelectedFile();
      String string = "Save file as:" + file.getPath();
      JOptionPane.showMessageDialog(null, string);
    } else {
      String string = "Save command canceled by user."; //a dialog "Save command canceled by user." when user cancel.
      JOptionPane.showMessageDialog(null, string);
    }
  }

  /**
   * Show a dialog box to select the file to open
   */
  public void actionOpen() {
    int option = fileChooser.showOpenDialog(this); // Showing a dialog box to select the file to open.
    if (option == JFileChooser.APPROVE_OPTION) {
      file = fileChooser.getSelectedFile(); //Returns the selected file.
      String string = "Opening:" + file.getName(); //a dialog "Opening:" + file name
      JOptionPane.showMessageDialog(null, string); //show message dialog
    } else {
      String string = "Open command canceled by user."; //a dialog "Open command canceled by user." when user cancel.
      JOptionPane.showMessageDialog(null, string); //show message dialog
    }
  }

  @Override
  public void addListeners() {
    super.addListeners();
    redColorItem.addActionListener(this);
    blueColorItem.addActionListener(this);
    greenColorItem.addActionListener(this);
    size16Item.addActionListener(this);
    size20Item.addActionListener(this);
    size24Item.addActionListener(this);
    openItem.addActionListener(this);
    saveItem.addActionListener(this);
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

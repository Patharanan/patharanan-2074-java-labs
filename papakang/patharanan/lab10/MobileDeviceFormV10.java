package papakang.patharanan.lab10;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.*;
import papakang.patharanan.lab9.MobileDeviceFormV9;

public class MobileDeviceFormV10
  extends MobileDeviceFormV9
  implements ActionListener {

  protected Font font16Plain, font20Plain, font24Plain;

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          createAndShowGUI();
        }
      }
    );
  }

  public MobileDeviceFormV10(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  protected void fontRedColor() {
    typeComboBox.setEditable(false);
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
  }

  protected void fontGreenColor() {
    typeComboBox.setEditable(false);
    txtBrand.setForeground(Color.green);
    txtModel.setForeground(Color.green);
    txtColor.setForeground(Color.green);
    txtPrice.setForeground(Color.green);
    txtWeight.setForeground(Color.green);
    androidJRB.setForeground(Color.green);
    iOSJRB.setForeground(Color.green);
    typeComboBox.setForeground(Color.green);
    reviewTxtArea.setForeground(Color.green);
    featuresList.setForeground(Color.green);
  }

  protected void fontBlueColor() {
    typeComboBox.setEditable(false);
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
  }

  protected void setFontSize16() {
    font16Plain = new Font("SansSerif", Font.PLAIN, 16);
    txtBrand.setFont(font16Plain);
    txtModel.setFont(font16Plain);
    txtColor.setFont(font16Plain);
    txtWeight.setFont(font16Plain);
    txtPrice.setFont(font16Plain);
    androidJRB.setFont(font16Plain);
    iOSJRB.setFont(font16Plain);
    typeComboBox.setFont(font16Plain);
    reviewTxtArea.setFont(font16Plain);
    featuresList.setFont(font16Plain);
  }

  protected void setFontSize20() {
    font20Plain = new Font("SansSerif", Font.PLAIN, 20);
    txtBrand.setFont(font20Plain);
    txtModel.setFont(font20Plain);
    txtColor.setFont(font20Plain);
    txtWeight.setFont(font20Plain);
    txtPrice.setFont(font20Plain);
    androidJRB.setFont(font20Plain);
    iOSJRB.setFont(font20Plain);
    typeComboBox.setFont(font20Plain);
    reviewTxtArea.setFont(font20Plain);
    featuresList.setFont(font20Plain);
  }

  protected void setFontSize24() {
    font24Plain = new Font("SansSerif", Font.PLAIN, 24);
    txtBrand.setFont(font24Plain);
    txtModel.setFont(font24Plain);
    txtColor.setFont(font24Plain);
    txtWeight.setFont(font24Plain);
    txtPrice.setFont(font24Plain);
    androidJRB.setFont(font24Plain);
    iOSJRB.setFont(font24Plain);
    typeComboBox.setFont(font24Plain);
    reviewTxtArea.setFont(font24Plain);
    featuresList.setFont(font24Plain);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == redColorItem) {
      fontRedColor();
    } else if (e.getSource() == blueColorItem) {
      fontBlueColor();
    } else if (e.getSource() == greenColorItem) {
      fontGreenColor();
    } else if (e.getSource() == size16Item) {
      setFontSize16();
    } else if (e.getSource() == size20Item) {
      setFontSize20();
    } else if (e.getSource() == size24Item) {
      setFontSize24();
    } else if (e.getSource() == openItem) {
      JFileChooser fileChooser = new JFileChooser();
      int option = fileChooser.showOpenDialog(this);
      if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        String string = "Opening:" + file.getName();
        JOptionPane.showMessageDialog(null, string);
      } else {
        String string = "Open command canceled by user.";
        JOptionPane.showMessageDialog(null, string);
      }
    } else if (e.getSource() == saveItem) {
      JFileChooser saveChooser = new JFileChooser();
      int option = saveChooser.showSaveDialog(this);
      if (option == JFileChooser.APPROVE_OPTION) {
        File file = saveChooser.getSelectedFile();
        String string = "Save file as:" + file.getAbsolutePath();
        JOptionPane.showMessageDialog(null, string);
      } else {
        String string = "Save command canceled by user.";
        JOptionPane.showMessageDialog(null, string);
      }
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
}

package papakang.patharanan.lab10;

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import papakang.patharanan.lab9.MobileDeviceFormV9;

public class MobileDeviceFormV10 extends MobileDeviceFormV9 {

  protected Font font16Plain, font20Plain, font24Plain;

  public MobileDeviceFormV10(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

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

  @Override
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);
    if (e.getSource() == redColorItem) {
      setColor(Color.red);
    } else if (e.getSource() == blueColorItem) {
      setColor(Color.blue);
    } else if (e.getSource() == greenColorItem) {
      setColor(Color.green);
    }
    if (e.getSource() == size16Item) {
      setFont(16);
    } else if (e.getSource() == size20Item) {
      setFont(20);
    } else if (e.getSource() == size24Item) {
      setFont(24);
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

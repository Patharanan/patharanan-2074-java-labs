package papakang.patharanan.lab10;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MobileDeviceFormV12 extends MobileDeviceFormV11 {

  protected JMenu areaMenu;
  protected JRadioButtonMenuItem fgButtonMenuIt, bgButtonMenuIt;
  protected JColorChooser colorChooser;
  ButtonGroup colorGroup;
  String selectedArea;

  public MobileDeviceFormV12(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  public void addMenus() {
    super.addMenus();
    areaMenu = new JMenu("Area");
    menuBar.add(areaMenu);
    this.setJMenuBar(menuBar);
  }

  public void colorChooser() {
    colorGroup = new ButtonGroup();
    fgButtonMenuIt = new JRadioButtonMenuItem("Foreground");
    bgButtonMenuIt = new JRadioButtonMenuItem("Background");

    fgButtonMenuIt.setSelected(true);

    colorGroup.add(fgButtonMenuIt);
    colorGroup.add(bgButtonMenuIt);

    mainPanel.add(fgButtonMenuIt);
    mainPanel.add(bgButtonMenuIt);

    areaMenu.add(fgButtonMenuIt);
    areaMenu.add(bgButtonMenuIt);
  }

  @Override
  protected void setColor(Color color) {
    if (fgButtonMenuIt.isSelected()) {
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
    } else if (bgButtonMenuIt.isSelected()) {
      txtBrand.setBackground(color);
      txtModel.setBackground(color);
      txtColor.setBackground(color);
      txtPrice.setBackground(color);
      txtWeight.setBackground(color);
      androidJRB.setBackground(color);
      iOSJRB.setBackground(color);
      typeComboBox.setEditable(false);
      typeComboBox.setBackground(color);
      reviewTxtArea.setBackground(color);
      featuresList.setBackground(color);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);
    Object src = e.getSource();
    if (src == customColorItem) {
      if (fgButtonMenuIt.isSelected()) {
        Color initialForeground = txtBrand.getForeground();
        Color color = JColorChooser.showDialog(
          this,
          "Choose Color",
          initialForeground
        );
        setColor(color);
      } else if (bgButtonMenuIt.isSelected()) {
        Color initialBackground = txtBrand.getBackground();
        Color color = JColorChooser.showDialog(
          this,
          "Choose Color",
          initialBackground
        );
        setColor(color);
      }
    }
  }

  @Override
  public void addListeners() {
    super.addListeners();
    customColorItem.addActionListener(this);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV12 mobileDeviceFromV12 = new MobileDeviceFormV12(
      "Mobile Device Form V12"
    );
    mobileDeviceFromV12.addComponents();
    mobileDeviceFromV12.addMenus();
    mobileDeviceFromV12.addListeners();
    mobileDeviceFromV12.setFrameFeatures();
    mobileDeviceFromV12.setMenuAccelerator();
    mobileDeviceFromV12.setMenuMnemonic();
    mobileDeviceFromV12.colorChooser();
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

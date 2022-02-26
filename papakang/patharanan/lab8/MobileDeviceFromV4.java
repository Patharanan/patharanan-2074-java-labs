package papakang.patharanan.lab8;

import javax.swing.*;
import papakang.patharanan.lab7.MobileDeviceFromV3;

public class MobileDeviceFromV4 extends MobileDeviceFromV3 {

  protected JMenuItem redColorItem, greenColorItem, blueColorItem, size16Item, size20Item, size24Item, menuItemFile;
  protected ImageIcon newImgIcon;

  public MobileDeviceFromV4(String titel) {
    super(titel);
  }

  protected void addComponents() {
    super.addComponents();
    updateMenuIcon();
    addSubMenus();
  }

  protected void updateMenuIcon() {
    fileMenu.removeAll();
    newImgIcon = new ImageIcon("images/new.png");
    newItem.setIcon(newImgIcon);
  }

  protected void addSubMenus() {
    super.addComponents();
    configMenu.removeAll();

    redColorItem = new JMenuItem("Red");
    greenColorItem = new JMenuItem("Green");
    blueColorItem = new JMenuItem("Blue");
    size16Item = new JMenuItem("16");
    size20Item = new JMenuItem("20");
    size24Item = new JMenuItem("24");

    colorSubMenu.add(redColorItem);
    colorSubMenu.add(greenColorItem);
    colorSubMenu.add(blueColorItem);
    configMenu.add(colorSubMenu);

    sizeSubMenu.add(size16Item);
    sizeSubMenu.add(size20Item);
    sizeSubMenu.add(size24Item);
    configMenu.add(sizeSubMenu);

    menuBar.add(configMenu);

    this.setJMenuBar(menuBar);
  }

  public static void createAndShowGUI() {
    MobileDeviceFromV4 mobileDeviceFromV4 = new MobileDeviceFromV4(
      "Mobile Device From V4"
    );
    mobileDeviceFromV4.addComponents();
    mobileDeviceFromV4.addMenus();
    mobileDeviceFromV4.setFrameFeatures();
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

/**This program add an icon for menu New and add submenus
 * Implement the program called MobileDeviceFormV4  which extends from MobileDeviceFormV3
 * @Auther Patharanan Papakang
 * @Version 1 25,Feb 2022
 */
package papakang.patharanan.lab8;

import javax.swing.*;
import papakang.patharanan.lab7.MobileDeviceFormV3;

public class MobileDeviceFormV4 extends MobileDeviceFormV3 {

  // Creating a variable for each item in the submenu.
  protected JMenuItem redColorItem, greenColorItem, blueColorItem, size16Item, size20Item, size24Item, menuItemFile;
  // Creating a variable for each item in the submenu.
  protected ImageIcon newImgIcon;

  // This is the constructor of the class. It calls the constructor of the superclass.
  public MobileDeviceFormV4(String titel) {
    super(titel);
  }

  /**
   * Add the menu icon and submenus to the menu
   */
  protected void addComponents() {
    super.addComponents();
    updateMenuIcon();
    addSubMenus();
  }

  /**
   * It removes all the items in the menu.
   * and add image icon for file menu.
   */
  protected void updateMenuIcon() {
    fileMenu.removeAll();
    newImgIcon = new ImageIcon("images/new.png");
    newItem.setIcon(newImgIcon);
  }

  /**
   * This method it calls the method addComponents of the superclass.
   * and add submenu in the config menu is color and size.
   */
  protected void addSubMenus() {
    super.addComponents();
    configMenu.removeAll(); //It removes all the items in the menu.

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
    MobileDeviceFormV4 mobileDeviceFormV4 = new MobileDeviceFormV4(
      "Mobile Device Form V4"
    );
    mobileDeviceFormV4.addComponents();
    mobileDeviceFormV4.addMenus();
    mobileDeviceFormV4.setFrameFeatures();
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

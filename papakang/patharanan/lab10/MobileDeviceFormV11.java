/**This program add the menu item “Custom …” for menu “Color”
 * and set mnemonic and accelerator keys for a menu item
 * @Auther Patharanan Papakang
 * @Version 1 22, Mar,2022
 */
package papakang.patharanan.lab10;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MobileDeviceFormV11 extends MobileDeviceFormV10 {

  protected JMenuItem customColorItem;

  public MobileDeviceFormV11(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  /**
   * Add a menu item to the color menu that allows the user to select a custom color
   * and set mnemonic and accelerator keys for a menu item.
   */
  @Override
  protected void addMenus() {
    super.addMenus();
    customColorItem = new JMenuItem("Custom...");
    colorSubMenu.add(customColorItem);
    setKeys();
  }

  /**
   * * Set the menu item's mnemonic and accelerator key
   */
  protected void setKeys() {
    setMneAndAcc(fileMenu, KeyEvent.VK_F);
    setMneAndAcc(newItem, KeyEvent.VK_N);
    setMneAndAcc(openItem, KeyEvent.VK_O);
    setMneAndAcc(saveItem, KeyEvent.VK_S);
    setMneAndAcc(exitItem, KeyEvent.VK_X);
    setMneAndAcc(configMenu, KeyEvent.VK_C);
    setMneAndAcc(colorSubMenu, KeyEvent.VK_L);
    setMneAndAcc(redColorItem, KeyEvent.VK_R);
    setMneAndAcc(greenColorItem, KeyEvent.VK_G);
    setMneAndAcc(blueColorItem, KeyEvent.VK_B);
    setMneAndAcc(customColorItem, KeyEvent.VK_U);
  }

  /**
   * If it's jmenu, just set Mnemonic
   * If it's jmenu item, just set Mnemonic and Accelerator.
   * @param menuItem
   * @param key
   */
  protected void setMneAndAcc(JMenuItem menuItem, int key) {
    if (menuItem instanceof JMenu) {
      menuItem.setMnemonic(key);
    } else {
      menuItem.setMnemonic(key);
      menuItem.setAccelerator(
        KeyStroke.getKeyStroke(
          key,
          Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
        )
      );
    }
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV11 mobileDeviceFromV11 = new MobileDeviceFormV11(
      "Mobile Device Form V11"
    );
    mobileDeviceFromV11.addComponents();
    mobileDeviceFromV11.addMenus();
    mobileDeviceFromV11.addListeners();
    mobileDeviceFromV11.setFrameFeatures();
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

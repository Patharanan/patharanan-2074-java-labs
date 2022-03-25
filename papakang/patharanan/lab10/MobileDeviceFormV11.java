/**This program add the menu item “Custom …” for menu “Color”
 * and set mnemonic and accelerator keys for a menu item
 * @Auther Patharanan Papakang
 * @Version 1 22,11 Mar,2022
 */
package papakang.patharanan.lab10;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class MobileDeviceFormV11 extends MobileDeviceFormV10 {

  protected JMenuItem customColorItem;

  public MobileDeviceFormV11(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  /**
   * Add a menu item to the color menu that allows the user to select a custom color
   */
  protected void addSubMenus() {
    super.addSubMenus();
    customColorItem = new JMenuItem("Custom...");
    colorSubMenu.add(customColorItem);
  }

  /**
   * * Set the mnemonic for each menu item
   */
  protected void setMenuMnemonic() {
    fileMenu.setMnemonic(KeyEvent.VK_F);
    newItem.setMnemonic(KeyEvent.VK_N);
    openItem.setMnemonic(KeyEvent.VK_O);
    saveItem.setMnemonic(KeyEvent.VK_S);
    exitItem.setMnemonic(KeyEvent.VK_X);
    configMenu.setMnemonic(KeyEvent.VK_C);
    colorSubMenu.setMnemonic(KeyEvent.VK_L);
    redColorItem.setMnemonic(KeyEvent.VK_R);
    greenColorItem.setMnemonic(KeyEvent.VK_G);
    blueColorItem.setMnemonic(KeyEvent.VK_B);
    customColorItem.setMnemonic(KeyEvent.VK_U);
  }

  /**
   * set menu accelerator  for each menu item
   */
  protected void setMenuAccelerator() {
    KeyStroke ctrlN = KeyStroke.getKeyStroke(
      KeyEvent.VK_N,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );
    KeyStroke ctrlO = KeyStroke.getKeyStroke(
      KeyEvent.VK_O,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );
    KeyStroke ctrlS = KeyStroke.getKeyStroke(
      KeyEvent.VK_S,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );
    KeyStroke ctrlX = KeyStroke.getKeyStroke(
      KeyEvent.VK_X,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );
    KeyStroke ctrlR = KeyStroke.getKeyStroke(
      KeyEvent.VK_R,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );
    KeyStroke ctrlG = KeyStroke.getKeyStroke(
      KeyEvent.VK_G,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );
    KeyStroke ctrlB = KeyStroke.getKeyStroke(
      KeyEvent.VK_B,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );
    KeyStroke ctrlU = KeyStroke.getKeyStroke(
      KeyEvent.VK_U,
      Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()
    );

    newItem.setAccelerator(ctrlN);
    openItem.setAccelerator(ctrlO);
    saveItem.setAccelerator(ctrlS);
    exitItem.setAccelerator(ctrlX);
    redColorItem.setAccelerator(ctrlR);
    greenColorItem.setAccelerator(ctrlG);
    blueColorItem.setAccelerator(ctrlB);
    customColorItem.setAccelerator(ctrlU);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV11 mobileDeviceFromV11 = new MobileDeviceFormV11(
      "Mobile Device Form V11"
    );
    mobileDeviceFromV11.addComponents();
    mobileDeviceFromV11.addMenus();
    mobileDeviceFromV11.addListeners();
    mobileDeviceFromV11.setFrameFeatures();
    mobileDeviceFromV11.setMenuAccelerator();
    mobileDeviceFromV11.setMenuMnemonic();
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

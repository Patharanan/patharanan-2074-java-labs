/**This program extend MobileDeviceFromV2 .
 * Add method addMenus() in creatAndShowGUI()
 * @Auther Patharanan Papakang
 * @Version 1 22,Feb 2022
 */
package papakang.patharanan.lab7;

import javax.swing.*;
import javax.swing.JMenuBar;

public class MobileDeviceFormV3 extends MobileDeviceFormV2 {

  protected JMenuBar menuBar = new JMenuBar();
  protected JMenu fileMenu = new JMenu("File"); //creates a new menu bar named File.
  protected JMenu configMenu = new JMenu("Config"); // creates a new menu bar named  named Config.
  protected JMenu colorSubMenu = new JMenu("Color"); //is creates a new menu item "Color".
  protected JMenu sizeSubMenu = new JMenu("Size"); //is creates a new menu item "Size".
  protected JMenuItem newItem = new JMenuItem("New"); //is creates a new menu item "New".
  protected JMenuItem openItem, saveItem, exitItem;

  public MobileDeviceFormV3(String titel) {
    super(titel);
  }

  /**
   * This method is creates a new menu item Open,Save and Exit.
   * Adds the newItem,openItem,saveItem and exitItem to the menuFile.
   * Adds the colorItem and sizeItem to the menuConfig.
   * Adds the menuFile and menuConfig to the menuBar.
   */
  protected void addMenus() {
    openItem = new JMenuItem("Open");
    saveItem = new JMenuItem("Save");
    exitItem = new JMenuItem("Exit");

    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);

    configMenu.add(colorSubMenu);
    configMenu.add(sizeSubMenu);

    menuBar.add(fileMenu);
    menuBar.add(configMenu);
    // It adds the menuBar to the frame.
    this.setJMenuBar(menuBar);
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

  public static void createAndShowGUI() {
    MobileDeviceFormV3 msw = new MobileDeviceFormV3("Mobile Device Form V3");
    msw.addComponents();
    msw.addMenus();
    msw.setFrameFeatures();
  }
}

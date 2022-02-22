/**This program extend MobileDeviceFromV2 .
 * Add method addMenus() in creatAndShowGUI()
 * @Auther Patharanan Papakang
 * @Version 1 22,Feb 2022
 */
package papakang.patharanan.lab7;

import java.awt.*;
import javax.swing.*;
import javax.swing.JMenuBar;

public class MobileDeviceFromV3 extends MobileDeviceFromV2 {

  protected JMenuBar menuBar;
  protected JMenu menuFile, menuConfig;
  protected JMenuItem newItem, openItem, saveItem, exitItem, colorItem, sizeItem;

  public MobileDeviceFromV3(String titel) {
    super(titel);
  }

  /**
   * This method is creates a new menu bar.Creates a new menu named File and named Config.
   * Creates a new menu item New,Open,Save,Exit,Color and Size.
   * Adds the newItem,openItem,saveItem and exitItem to the menuFile.
   * Adds the colorItem and sizeItem to the menuConfig.
   * Adds the menuFile and menuConfig to the menuBar.
   */
  public void addMenus() {
    menuBar = new JMenuBar();

    menuFile = new JMenu("File");
    menuConfig = new JMenu("Config");

    newItem = new JMenuItem("New");
    openItem = new JMenuItem("Open");
    saveItem = new JMenuItem("Save");
    exitItem = new JMenuItem("Exit");
    colorItem = new JMenuItem("Color");
    sizeItem = new JMenuItem("Size");

    menuFile.add(newItem);
    menuFile.add(openItem);
    menuFile.add(saveItem);
    menuFile.add(exitItem);

    menuConfig.add(colorItem);
    menuConfig.add(sizeItem);

    menuBar.add(menuFile);
    menuBar.add(menuConfig);

    this.add(menuBar, BorderLayout.PAGE_START); // It adds the menuBar to the frame.
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
    MobileDeviceFromV3 msw = new MobileDeviceFromV3("Mobile Device Fromo V3");
    msw.addComponents();
    msw.addMenus();
    msw.setFrameFeatures();
  }
}

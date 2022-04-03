/**This program add menu and menuitem.
 * Display menu item is selected, the program displays all the devices added in deviceList in a dialog
 * Sort menu item is selected, the mobile devices in deviceList are sorted according to the price from the least expensive to the most expensive. Then the sorted list is displayed in a dialog as shown
 * Search menu item is selected, an input dialog is displayed.A model name is entered to be used for searching
 * Remove menu item is selected, an input dialog appears for the user to enter a model name to remove. The program searches if the input model name is in deviceList
 *
 * @Auther Patharanan Papakang
 * @Version 1 27 Mar,2022
 */
package papakang.patharanan.lab11;

import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import papakang.patharanan.lab6.SortMobileDevicesByPrice;

public class MobileDeviceFormV14 extends MobileDeviceFormV13 {

  protected JMenu devicesMenu;
  protected JMenuItem displayItem, sortItem, searchItem, removeItem;
  protected String input;

  public MobileDeviceFormV14(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  /**
   * Add menu "Devices"
   * Add the four menu items to the menu bar is Display,Sort,Search,Remove
   */
  @Override
  public void addMenus() {
    super.addMenus();
    devicesMenu = new JMenu("Devices");
    menuBar.add(devicesMenu);

    displayItem = new JMenuItem("Display");
    sortItem = new JMenuItem("Sort");
    searchItem = new JMenuItem("Search");
    removeItem = new JMenuItem("Remove");

    devicesMenu.add(displayItem);
    devicesMenu.add(sortItem);
    devicesMenu.add(searchItem);
    devicesMenu.add(removeItem);
  }

  /**
   * Display the list of mobile devices
   *
   * @param e The event that triggered the action.
   */

  @Override
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);
    Object src = e.getSource();

    if (src == displayItem) {
      JOptionPane.showMessageDialog(this, displayDialog(deviceList));
    } else if (src == sortItem) {
      Collections.sort(deviceList, new SortMobileDevicesByPrice());
      JOptionPane.showMessageDialog(this, displayDialog(deviceList));
    } else if (src == searchItem) {
      input = JOptionPane.showInputDialog(this, "Enter model name search");
      int indexDeviceList = searchArrayList(input);
      if (indexDeviceList >= 0) {
        String outputSearch = deviceList.get(indexDeviceList) + "\nis found";
        JOptionPane.showMessageDialog(
          this,
          (indexDeviceList + 1) + "." + outputSearch
        );
      } else {
        String searchMessage = input + " is not found.";
        JOptionPane.showMessageDialog(this, searchMessage);
      }
    } else if (src == removeItem) {
      input = JOptionPane.showInputDialog(this, "Enter model name to remove");
      int indexDeviceList = searchArrayList(input);
      if (indexDeviceList >= 0) {
        String outputSearch = deviceList.get(indexDeviceList) + "\nis remove";
        JOptionPane.showMessageDialog(
          this,
          (indexDeviceList + 1) + "." + outputSearch
        );
        deviceList.remove(indexDeviceList);
      } else {
        String searchMessage = input + " is not found.";
        JOptionPane.showMessageDialog(this, searchMessage);
      }
    }
  }

  /**
   * Search the device list for a device with the specified model name.
   *
   * @param input The name of the device you want to search for.
   * @return The index of the device in the list.
   */
  public int searchArrayList(String input) {
    for (int cnt = 0; cnt < deviceList.size(); cnt++) {
      if ((deviceList.get(cnt).getModelName()).equals(input)) {
        return cnt;
      }
    }
    return -1;
  }

  /**
   * Display a list of devices in a dialog box
   *
   * @param deviceList The list of devices to display.
   * @return The string buffer is being returned.
   */

  public StringBuffer displayDialog(ArrayList<MobileDeviceV2> deviceList) {
    StringBuffer string = new StringBuffer();
    for (int i = 0; i < deviceList.size(); i++) {
      string.append((i + 1) + "." + deviceList.get(i) + "\n");
    }
    return string;
  }

  @Override
  public void addListeners() {
    super.addListeners();
    displayItem.addActionListener(this);
    sortItem.addActionListener(this);
    searchItem.addActionListener(this);
    removeItem.addActionListener(this);
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV14 mobileDeviceFromV14 = new MobileDeviceFormV14(
      "Mobile Device Form V14"
    );
    mobileDeviceFromV14.addComponents();
    mobileDeviceFromV14.addMenus();
    mobileDeviceFromV14.addListeners();
    mobileDeviceFromV14.setFrameFeatures();
    mobileDeviceFromV14.colorChooser();
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

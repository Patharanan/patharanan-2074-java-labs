package papakang.patharanan.lab11;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class MobileDeviceFormV14 extends MobileDeviceFormV13 {

  protected JMenu devicesMenu;
  protected JMenuItem displayItem, sortItem, searchItem, removeItem;

  public MobileDeviceFormV14(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

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

  @Override
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);

    if (e.getSource() == displayItem) {
      for (MobileDeviceV2 i : deviceList) {
        System.out.println(i);
      }
    }
  }

  @Override
  public void addListeners() {
    super.addListeners();
    displayItem.addActionListener(this);
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

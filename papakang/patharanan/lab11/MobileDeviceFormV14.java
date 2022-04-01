package papakang.patharanan.lab11;

import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

public class MobileDeviceFormV14 extends MobileDeviceFormV13 {

  public MobileDeviceFormV14(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV14 mobileDeviceFromV14 = new MobileDeviceFormV14(
      "Mobile Device Form V14"
    );
    mobileDeviceFromV14.addComponents();
    mobileDeviceFromV14.addMenus();
    mobileDeviceFromV14.addListeners();
    mobileDeviceFromV14.setFrameFeatures();
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

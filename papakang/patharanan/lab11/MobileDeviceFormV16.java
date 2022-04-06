/**This program when the Save menu item is selected, a save file window appears.
 * After a file name has been entered, open the output stream using the file name. This can be done by suing PrintWritter.
 * When the Open menu item will show open dialog
 * After choosing the file to open, read from the file, line by line.
 * To create an instance of MobileDeviceV2, then add it to deviceList.
 * After reading from the file, you can display all the added devices from the Display menu item
 *  @Auther Patharanan Papakang
 * @Version 1 6 April,2022
 */
package papakang.patharanan.lab11;

import java.io.*;
import javax.swing.*;

public class MobileDeviceFormV16 extends MobileDeviceFormV15 {

  public MobileDeviceFormV16(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  /**
   * It writes the contents of the displayDialog function to a file.
   */
  @Override
  public void actionSave() {
    super.actionSave();
    try {
      String filename = file.getPath();
      PrintWriter p = new PrintWriter(filename);
      p.print(displayDialog(deviceList));
      p.close();
    } catch (IOException e) { // A catch block that handles the IOException.
      System.err.println("Error in writing file");
      e.printStackTrace(System.err);
    }
  }

  /**
   * Reads a file and creates a list of MobileDeviceV2 objects
   */
  @Override
  public void actionOpen() {
    super.actionOpen();
    String filename = file.getPath();
    try {
      FileReader fr = new FileReader(filename);
      BufferedReader r = new BufferedReader(fr);
      String line;
      // Reading the file line by line.
      while ((line = r.readLine()) != null) {
        String[] splitStrings = line.split(",", -1);
        String brandName = ((splitStrings[0].split(":", -1)[1].trim()));
        String modelName = ((splitStrings[1].split(":", -1)[1].trim()));
        String color = ((splitStrings[2].split(":", -1)[1].trim()));
        double weight = Double.parseDouble(
          ((splitStrings[3].split(":", -1)[1].trim()))
        );
        double price = Double.parseDouble(
          ((splitStrings[4].split(":", -1)[1].trim()))
        );
        String mobileOS = ((splitStrings[5].split(":", -1)[1].trim()));
        String type = ((splitStrings[6].split(":", -1)[1].trim()));
        MobileDeviceV2 mobileDeviceV2 = new MobileDeviceV2(
          brandName,
          modelName,
          color,
          weight,
          price,
          mobileOS,
          type
        );
        deviceList.add(mobileDeviceV2);
      }

      r.close();
      fr.close();
    } catch (IOException e) { // A catch block that handles the IOException.
      System.err.println("Error in reading file");
      e.printStackTrace(System.err);
    } catch (IndexOutOfBoundsException inf) { // A catch block that handles the IndexOutOfBoundsException.
      System.err.println("Null");
    }
  }

  public static void createAndShowGUI() {
    MobileDeviceFormV16 mobileDeviceFromV16 = new MobileDeviceFormV16(
      "Mobile Device Form V16"
    );
    mobileDeviceFromV16.addComponents();
    mobileDeviceFromV16.addMenus();
    mobileDeviceFromV16.addListeners();
    mobileDeviceFromV16.setFrameFeatures();
    mobileDeviceFromV16.colorChooser();
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

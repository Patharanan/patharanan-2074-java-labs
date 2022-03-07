/**This program implement the program called MobileDeviceFormV6  which extends from MobileDeviceFormV5
 * Add a  panel that contains the label “Features:”
 * Add a panel that extends from JPanel that draws an image
 * @Auther Patharanan Papakang
 * @Version 1 27,Feb 2022
 */
package papakang.patharanan.lab8;

import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JPanel;

public class MobileDeviceFromV6 extends MobileDeviceFromV5 {

  // Creating a panel that contains the image.
  protected JPanel drawPanel, featuresPanel;
  // Creating a label called featuresLabel and set it to protected.
  protected JLabel featuresLabel;
  // This is creating a list of features.
  protected JList featuresList;
  // Creating an array of strings.
  protected String[] featuresArray;

  public MobileDeviceFromV6(String titel) {
    super(titel);
  }

  /**
   * This Method is creating an array of strings add list to the features panel.
   *  Add the features panel to the total panel
   * Set font
   */
  @Override
  protected void addComponents() {
    super.addComponents();
    featuresLabel = new JLabel("Features:");
    featuresPanel = new JPanel();
    featuresPanel.setLayout(new BorderLayout());

    // Creating an array of strings.
    featuresArray =
      new String[] {
        "10.9-inch display",
        "12MP rear camera",
        "next-generation Touch ID sensor",
      };
    featuresList = new JList(featuresArray);

    featuresPanel.add(featuresList);

    featuresLabel.setFont(font14Plain);
    featuresList.setFont(font14Bold);

    ReadImages content = new ReadImages();

    featuresPanel.add(featuresLabel, BorderLayout.NORTH);

    featuresPanel.add(content, BorderLayout.SOUTH);
    totalPanel.add(featuresPanel, BorderLayout.SOUTH);
  }

  /**
   *  Add a panel that extends from JPanel that draws an image read from the specified file.
   */
  public class ReadImages extends JPanel {

    BufferedImage img;

    public void paint(Graphics graphics) {
      graphics.drawImage(img, 0, 0, null);
    }

    // A constructor that read the image from the specified file.

    public ReadImages() {
      try {
        URL myImg = this.getClass().getResource("/images/ipadair.jpg");
        img = ImageIO.read(myImg);
      } catch (IOException e) {
        e.printStackTrace(System.err);
      }
    }

    /**
     * Returns the preferred size of the image
     *
     * @return The preferred size of the image.
     */
    public Dimension getPreferredSize() {
      if (img == null) {
        return new Dimension(100, 100);
      } else {
        return new Dimension(img.getWidth() + 20, img.getHeight() + 60);
      }
    }
  }

  /**
   * Create a new instance of the MobileDeviceFromV6 class and show it
   */
  public static void createAndShowGUI() {
    MobileDeviceFromV6 mobileDeviceFromV6 = new MobileDeviceFromV6(
      "Mobile Device From V6"
    );
    mobileDeviceFromV6.addComponents();
    mobileDeviceFromV6.addMenus();
    mobileDeviceFromV6.setFrameFeatures();
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

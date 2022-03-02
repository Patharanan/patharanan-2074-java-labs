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

  protected JPanel drawPanel, featuresPanel;
  protected JLabel featuresLabel;
  protected JList featuresList;
  protected String[] featuresArray;

  public MobileDeviceFromV6(String titel) {
    super(titel);
  }

  @Override
  protected void addComponents() {
    super.addComponents();
    featuresLabel = new JLabel("Features:");
    featuresPanel = new JPanel();
    featuresPanel.setLayout(new BorderLayout());

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

  public class ReadImages extends JPanel {

    BufferedImage img;

    public void paint(Graphics graphics) {
      graphics.drawImage(img, 0, 0, null);
    }

    public ReadImages() {
      try {
        URL myImg = this.getClass().getResource("/images/ipadair.jpg");
        img = ImageIO.read(myImg);
      } catch (IOException e) {
        e.printStackTrace(System.err);
      }
    }

    public Dimension getPreferredSize() {
      if (img == null) {
        return new Dimension(100, 100);
      } else {
        return new Dimension(img.getWidth() + 20, img.getHeight() + 60);
      }
    }
  }

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

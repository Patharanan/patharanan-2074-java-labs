/** MySimpleWindow to be a superclass for all other classes
 * This program MySimpleWindow extends from class JFrame
 * Add two buttons whose names are “Cancel” and “OK”.
 * @Auther Patharanan Papakang
 * @version 1 18,Feb 2022
 */

package papakang.patharanan.lab7;

import java.awt.*;
import javax.swing.*;

class MySimpleWindow extends JFrame {

  /**
   * creating a protected JButton is okButton,cancelButton
   * and a protected JPanel is mainPanel,buttonPanel.
   */

  protected JButton okButton, cancelButton;
  protected JPanel mainPanel, buttonPanel;

  /**
   * Create a new instance of the MySimpleWindow class and call the addComponents() method
   * and setFrameFeatures() method
   */
  public static void createAndShowGUI() {
    MySimpleWindow msw = new MySimpleWindow("My Simple Window");
    msw.addComponents();
    msw.setFrameFeatures();
  }

  // This is the constructor of the class. It is calling the constructor of the superclass.
  public MySimpleWindow(String titel) {
    super(titel);
  }

  /**
   * This function sets the frame features
   */
  protected void setFrameFeatures() {
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application using the System exit method when the user initiates a "close" on this frame
  }

  protected void addComponents() {
    mainPanel = new JPanel(); // This is creating a new panel.
    buttonPanel = new JPanel(); // This is creating a new panel.
    cancelButton = new JButton("Cancel"); // This is creating a new button. The button is named "Cancel".
    okButton = new JButton("OK"); // This is creating a new button. The button is named "OK".
    buttonPanel.add(cancelButton); // This is adding the cavcelbutton to the button panel.
    buttonPanel.add(okButton); // This is adding the button to the button panel.

    this.add(buttonPanel, BorderLayout.PAGE_END); //is the position of the panel.
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

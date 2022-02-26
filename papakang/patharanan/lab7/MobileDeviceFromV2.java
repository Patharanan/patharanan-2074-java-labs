/** MobileDeviceFromV2 extends  MobileDeviceFromV1 class.
 * This program creating a new JComboBox object
 * Add the label “Type:” and the combo box of device type which includes “Phone”, “Tablet”, “Smart Watch”
 * and allow the user to edit this combo box.
 * Add the label “Review:” and the text area
 * @Auther Patharanan Papakang
 * @Version 1 21,Feb 2022
 */
package papakang.patharanan.lab7;

import java.awt.*;
import javax.swing.*;

public class MobileDeviceFromV2 extends MobileDeviceFromV1 {

  protected JPanel centerPanel, reviewPanel, typePanel;
  protected JLabel typeLabel, reviewLabel;
  protected JComboBox typeComboBox;
  protected JTextArea reviewTxtArea;
  protected JScrollPane scrollPane;

  public MobileDeviceFromV2(String titel) {
    super(titel);
  }

  /**
   * This method creating a new JLabel object and setting the text to "Type:"
   * and the combo box of device type which includes “Phone”, “Tablet”, “Smart Watch”.
   * Creating a new JPanel object.Creating a new JComboBox object
   * Creating a JTextArea object with 5 rows and 30 columns and  adding a text to the reviewTxtArea.
   */

  @Override
  protected void addComponents() {
    super.addComponents();

    typeLabel = new JLabel("Type:");
    typePanel = new JPanel();
    typeComboBox = new JComboBox();
    centerPanel = new JPanel();
    centerPanel.setLayout(new BorderLayout()); // Setting the layout of the center panel to a BorderLayout.

    typeComboBox.addItem("Phone");
    typeComboBox.addItem("Tablet");
    typeComboBox.addItem("Smart Watch");
    typeComboBox.setSelectedIndex(1); //setting the selected index to 1.
    typeComboBox.setEditable(true);

    typePanel.setLayout(new GridLayout(1, 2)); //setting the layout to 1 rows 2 colums.

    // Adding the typeLabel and typeComboBox to the typePanel.
    typePanel.add(typeLabel);
    typePanel.add(typeComboBox);

    reviewLabel = new JLabel("Review:"); // Creating a new JLabel object and setting the text to "Review:".
    reviewPanel = new JPanel();
    reviewTxtArea = new JTextArea(5, 30);
    reviewTxtArea.setLineWrap(true);
    reviewTxtArea.setWrapStyleWord(true);
    reviewTxtArea.setText(
      "The iPhone 13’s brighter display, longer battery life and powerful cameras make it the best iPhone for the money. But we wish it had faster charging and the iPhone 13 Pro’s adaptive 120Hz display."
    );

    reviewPanel.setLayout(new BorderLayout());
    // This is adding the reviewLabel and reviewTxtArea to the reviewPanel.
    reviewPanel.add(reviewLabel, BorderLayout.PAGE_START);

    scrollPane = new JScrollPane(reviewTxtArea);
    reviewPanel.add(scrollPane);

    // This is adding the typePanel and reviewPanel to the centerPanel.
    centerPanel.add(typePanel, BorderLayout.PAGE_START);
    centerPanel.add(reviewPanel, BorderLayout.PAGE_END);

    // This is adding the centerPanel to the totalPanel and the totalPanel to the frame.
    totalPanel.add(centerPanel, BorderLayout.CENTER);
    this.add(totalPanel, BorderLayout.CENTER);
  }

  public static void createAndShowGUI() {
    MobileDeviceFromV2 msw = new MobileDeviceFromV2("Mobile Device From V2");
    msw.addComponents();
    msw.setFrameFeatures();
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

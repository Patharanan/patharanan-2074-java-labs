package papakang.patharanan.lab8;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class MobileDeviceFromV5 extends MobileDeviceFromV4 {

  public MobileDeviceFromV5(String titel) {
    super(titel);
    //TODO Auto-generated constructor stub
  }

  public void addComponents() {
    super.addComponents();
    this.setFormValues();
    this.setFontsColors();
  }

  private void setFormValues() {}

  private void setFontsColors() {
    brandNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
    cancelButton.setForeground(Color.RED);
    okButton.setForeground(Color.BLUE);
    Panel.add(brandNameLabel);
    this.add(Panel);
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

import java.awt.*;
import javax.swing.*;

public class Main {
 
  public static void main(String[] args) { 
    //random essentials
    


    //Load up from base to top layer order
    JFrame frame = new JFrame("Gym Progress");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(1000, 750));
    frame.setLayout(null);
    frame.setVisible(true);

    JPanel panel = new JPanel();
    panel.setBounds(0,0,1000,750);
    panel.setBackground(new Color(45,45,50));

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0,0,500,500);
    


    frame.add(panel);
    panel.add(layeredPane);


  }

}
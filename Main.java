import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Main {
  Font myFont = new Font("Times New Romans", Font.BOLD, 18);

  public static void main(String[] args) { 
    //random essentials
    //Load up from base to top layer order
    JFrame frame = new JFrame("Gym Progress");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(1000, 750));
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setResizable(false);

    Insets insets = frame.getInsets();
    int frameWidth = 1000;
    int frameHeight = 750;

    int panelWidth = frameWidth - (insets.left + insets.right);
    int panelHeight = frameHeight - (insets.top + insets.bottom);

    JPanel panel = createPanel();

    JLayeredPane TL = createJLayeredPaneTopLeft(panelWidth, panelHeight);
    JLayeredPane TR = createJLayeredPaneTopRight(panelWidth, panelHeight);
    JLayeredPane BL = createJLayeredPaneBottomLeft(panelWidth, panelHeight);
    JLayeredPane BR = createJLayeredPaneBottomRight(panelWidth, panelHeight);

    frame.add(panel);
    panel.add(TL);
    panel.add(TR);
    panel.add(BL);
    panel.add(BR);

  }

  private static JPanel createPanel()
  {
    JPanel p = new JPanel(null);
    p.setBounds(0,0,1000,750);
    p.setBackground(new Color(45,45,50));
    return p;

  } 

  private static JLayeredPane createJLayeredPaneTopLeft(int pW, int pH)
  {
    //pW = panelWidth
    //pH = panelHeight
    JLayeredPane layeredPaneTopLeft = new JLayeredPane();
    layeredPaneTopLeft.setBounds(0,0,pW/2,pH/2);
    layeredPaneTopLeft.setBorder(new LineBorder(Color.red));
    JPanel innerJPanel = createSmallPanel();

    JLabel labelA = new JLabel("Tello");
    labelA.setBounds(0,0,20,60);
    layeredPaneTopLeft.add(labelA);

    layeredPaneTopLeft.add(innerJPanel);
    return layeredPaneTopLeft;
  }

  private static JLayeredPane createJLayeredPaneTopRight(int pW, int pH)
  {
    JLayeredPane layeredPaneTopRight = new JLayeredPane();
    layeredPaneTopRight.setBounds(pW/2, 0, pW/2 ,pH/2);
    layeredPaneTopRight.setBorder(new LineBorder(Color.white));

    return layeredPaneTopRight;
  }

  private static JLayeredPane createJLayeredPaneBottomLeft(int pW, int pH)
  {
    JLayeredPane layeredPaneBottomLeft = new JLayeredPane();
    layeredPaneBottomLeft.setBounds(0, pH/2, pW/2, pH/2);
    layeredPaneBottomLeft.setBorder(new LineBorder(Color.cyan));
    
    return layeredPaneBottomLeft;
  }

  private static JLayeredPane createJLayeredPaneBottomRight(int pW, int pH)
  {
    // pW/2 = 492
    // pH/2 = 355
    JLayeredPane layeredPaneBottomRight = new JLayeredPane();
    layeredPaneBottomRight.setBounds(pW/2 ,pH/2,pW/2 ,pH/2);
    layeredPaneBottomRight.setBorder(new LineBorder(Color.green));


    JButton addButton = new JButton("add");
    addButton.setBounds(422, 322, 60,20);
    addButton.setActionCommand("addButton Command");
    addButton.addActionListener(new MyActionListener());


    layeredPaneBottomRight.add(addButton);
    return layeredPaneBottomRight;
  }

  private static JPanel createSmallPanel()
  {
    JPanel p = new JPanel();
    p.setBounds(30,30,432,295);
    p.setBackground(new Color(35,35,35));
    p.setBorder(new LineBorder(new Color(206, 130, 47)));
    return p;
  }
}
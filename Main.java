import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Main {
  static Font myFont = new Font("Times New Romans", Font.BOLD, 18);
  private static JPanel innerJPanel;
  public static void main(String[] args) { 
    //random essentials
    //Load up from base to top layer order
    JFrame frame = new JFrame("Gym Progress");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(1000, 750));
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
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

    frame.revalidate();
    frame.repaint();
    panel.revalidate();
    panel.repaint();
    TL.revalidate();
    TL.repaint();

  }

  private static JPanel createPanel()
  {
    //BackGround Panel
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
    JScrollPane innerJScrollPanel = createJScrollPaneTL();

    innerJPanel = createsmallJPanel();
    innerJScrollPanel.setViewportView(innerJPanel);

    JLabel labelA = new JLabel("My Exercises");
    labelA.setFont(myFont);
    labelA.setBounds(40,0,120,30);
    layeredPaneTopLeft.add(labelA);
    labelA.setForeground(Color.white);

    layeredPaneTopLeft.add(innerJScrollPanel);
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

    JPanel panel = new JPanel();
    panel.setBounds(30,30,100,100);
    panel.setBackground(Color.orange);


    JButton addButton = new JButton("add");
    addButton.setBounds(422, 322, 60,20);
    addButton.setBackground(new Color(35,35,35));
    addButton.setForeground(new Color(206, 130, 47));
    addButton.setBorder(BorderFactory.createEmptyBorder());
    addButton.setFocusPainted(false);

    //add button to inner panel
    addButton.setActionCommand("addButton Command");
    addButton.addActionListener(new MyActionListener(innerJPanel));

    layeredPaneBottomRight.add(panel);
    layeredPaneBottomRight.add(addButton);
    return layeredPaneBottomRight;
  }

  private static JScrollPane createJScrollPaneTL()
  {
    //height = 295
    JScrollPane p = new JScrollPane();
    p.setBounds(30,30,432,295);
    p.setBorder(new LineBorder(new Color(206, 130, 47)));
    p.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
    p.getVerticalScrollBar().setUI(new CustomScrollBarUI());
    p.getHorizontalScrollBar().setUI(new CustomScrollBarUI());

    JScrollBar verticalScrollBar = p.getVerticalScrollBar();
    verticalScrollBar.setUnitIncrement(16);  // Set the scroll speed (16 pixels per scroll)
    verticalScrollBar.setBlockIncrement(50);

    return p;
  }
  private static JPanel createsmallJPanel()
  {
    // 432p x 295p
    // min: 300p x 300p probably
    JPanel p = new JPanel(null);
    p.setPreferredSize(new Dimension(450,1000));
    p.setBounds(30,30,450,1000);
    p.setBackground(new Color(35,35,35));
    // p.setBorder(new LineBorder(new Color(206, 130, 47)));
    return p;
  }

}
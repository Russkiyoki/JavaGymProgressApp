import java.awt.*;
import javax.swing.*;

public class AddExercisePopUp
{
    private static int height;
    private static int width;
    private static Insets insets;
    private static int panelWidth;
    private static int panelHeight;
    private static Main m = new Main();
    public AddExercisePopUp()
    {
        JFrame popUp = new JFrame("Pop up");
        // popUp.setBounds(400,400,100,100);
        popUp.setSize(400,200);
        popUp.setLocationRelativeTo(null);
        popUp.setResizable(false);
        popUp.setLayout(null);
        height = popUp.getHeight();
        width = popUp.getWidth();

        JPanel backGroundPanel = backgroundJPanel();
        JTextField textField = nameTextField(backGroundPanel);
        JButton folderButton = folderJButton();
        JButton exerciseButton = exerciseJButton();

        backGroundPanel.add(textField);
        backGroundPanel.add(folderButton);
        backGroundPanel.add(exerciseButton);
        popUp.add(backGroundPanel);
        popUp.setVisible(true);

    }
    public JPanel backgroundJPanel()
    {
        JPanel bg = new JPanel(null);
        bg.setBounds(0,0,width,height);
        bg.setBackground(new Color(35,35,35));
        return bg;
    }
    public JTextField nameTextField(JPanel p)
    {
        insets = p.getInsets();
        panelWidth = width - insets.left - insets.right;
        panelHeight = height - insets.top - insets.bottom;

        int tfWidth = (int) (panelWidth * 0.75);
        // System.out.println(panelWidth - );
        JTextField tf = new JTextField(null);
        tf.setFont(m.myFont);
        tf.setSize(tfWidth,40);
        // mess around to find the 7 LOL
        tf.setLocation((width - tfWidth)/2 -7, panelHeight /2 - 40);


        //add Exercise button
        //add Folder button

        return tf;
    }
    public JButton folderJButton()
    {
        JButton fb = new JButton("Create Folder");
        int bW = panelWidth / 2;
        int bH = 40;
        fb.setBounds(panelWidth/4 +7, bH/2, bW - 40,bH);
        fb.setBackground(new Color(206, 130, 47));
        fb.setForeground(new Color(35,35,35));
        // fb.setBorder(BorderFactory.createEmptyBorder());
        fb.setFocusPainted(false);

        //add button to inner panel
        fb.setActionCommand("fb Command");
        fb.addActionListener(new MyActionListener(m.innerJPanel));

        return fb;

    }
    public JButton exerciseJButton()
    {
        JButton eb = new JButton("Create Exercise");
        int bW = panelWidth / 2;
        int bH = 40;
        eb.setBounds(panelWidth/4 +7, (bH*2) + (bH/2), bW - 40,bH);
        eb.setBackground(new Color(206, 130, 47));
        eb.setForeground(new Color(35,35,35));
        eb.setBorder(BorderFactory.createEmptyBorder());
        eb.setFocusPainted(false);

        //add button to inner panel
        eb.setActionCommand("eb Command");
        eb.addActionListener(new MyActionListener(m.innerJPanel));
        return eb;
    }
}
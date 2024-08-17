import java.awt.*;
import javax.swing.*;
public class EditExercisePopUp 
{
    private static int height;
    private static int width;
    private static Insets insets;
    private static int panelWidth;
    private static int panelHeight;
    private static Main m = new Main();
    public static JTextField textField;
    public static String updatedText;
    public static JFrame popUp;
    //Initilization / constructor
    public EditExercisePopUp()
    {
        JFrame editPopUp = new JFrame();
        editPopUp.setSize(400,200);
        editPopUp.setLocationRelativeTo(null);
        editPopUp.setResizable(false);
        editPopUp.setLayout(null);
        height = editPopUp.getHeight();
        width = editPopUp.getWidth();

        JPanel backGroundPanel = backgroundJPanel();
        textField = nameTextField(backGroundPanel);
        JButton confirmButton = confirmJButton();

        backGroundPanel.add(textField);
        backGroundPanel.add(confirmButton);
        editPopUp.add(backGroundPanel);
        editPopUp.setVisible(true);
    }
    private JPanel backgroundJPanel()
    {
        JPanel bg = new JPanel(null);
        bg.setBounds(0,0,width,height);
        bg.setBackground(new Color(35,35,35));
        return bg;
    }
    private JTextField nameTextField(JPanel p)
    {
        insets = p.getInsets();
        panelWidth = width - insets.left - insets.right;
        panelHeight = height - insets.top - insets.bottom;

        int tfWidth = (int) (panelWidth * 0.75);

        JTextField tf = new JTextField(null);
        tf.setFont(m.myFont);
        tf.setSize(tfWidth,40);
        // mess around to find the 7 LOL
        tf.setLocation((width - tfWidth)/2 -7, panelHeight /2 - 40);

        return tf;
    }
    public String getTextString()
    {
        return textField.getText();
    }
    private JButton confirmJButton()
    {
        JButton cB = new JButton("Confirm");
        int bW = panelWidth / 2;
        int bH = 40;
        cB.setBounds(panelWidth/4 +7, (bH*2) + (bH/2), bW - 40,bH+5);
        cB.setBackground(new Color(206, 130, 47));
        cB.setForeground(new Color(35,35,35));
        cB.setBorder(BorderFactory.createEmptyBorder());
        cB.setFocusPainted(false);
        cB.setActionCommand("cb Command");
        cB.addActionListener(new MyActionListener());



        return cB;
    }

}

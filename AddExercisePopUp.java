import java.awt.*;
import javax.swing.*;

public class AddExercisePopUp
{
    private static int height;
    private static int width;
    private static Insets insets;
    private static int panelWidth;
    private static int panelHeight;
    public AddExercisePopUp()
    {
        JFrame popUp = new JFrame("Pop up");
        // popUp.setBounds(400,400,100,100);
        popUp.setSize(400,200);
        popUp.setLocationRelativeTo(null);
        popUp.setResizable(false);
        popUp.setLayout(null);

        JTextField textField = nameTextField(popUp);
        JButton folderButton = folderJButton();

        popUp.add(folderButton);
        popUp.add(textField);
        popUp.setVisible(true);

    }
    // public JPanel 
    public JTextField nameTextField(JFrame f)
    {
        Main m = new Main();
        height = f.getHeight();
        width = f.getWidth();
        insets = f.getInsets();
        panelWidth = width - (insets.left + insets.right);
        panelHeight = height - (insets.top + insets.bottom);


        JTextField tf = new JTextField();
        tf.setFont(m.myFont);
        tf.setSize(panelWidth *= 0.75,40);
        tf.setLocation(5,panelHeight/2 - 40);
        //add Exercise button
        //add Folder button

        return tf;
    }
    public JButton folderJButton()
    {
        JButton fb = new JButton();
        fb.setText("Folder");
        fb.setBounds(panelWidth/2 + 5, panelHeight/2 - 60, panelWidth/2 - 20,40);
        

        return fb;

    }
}
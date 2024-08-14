import java.awt.Color;
import javax.swing.*;

public class CustomExerciseButton extends JPanel
{
    private JButton mainButton;
    private JButton editButton;
    private JLayeredPane buttonHolder;
    private static int count = -1;

    //count not working because it is getting redifined each time class is called in MyActionListener

    public CustomExerciseButton()
    {
        count++;
        System.out.println("customExercise accessed");
        System.out.println(count);

        buttonHolder = new JLayeredPane();
        // buttonHolder.setBounds(5,(count * 40) + 5,200,40);
        buttonHolder.setBackground(Color.orange);

        mainButton = new JButton("Button pp" + count);
        // mainButton.setBounds(5,(count * 40),200,40);
        mainButton.setSize(400,40);
        mainButton.setActionCommand("Button " + count);
        mainButton.addActionListener(new MyActionListener());
        mainButton.setBackground(new Color(206, 130, 47));
        
        editButton = new JButton();
        // editButton.setBounds(160,(count * 40),40,40);
        editButton.setSize(40,40);
        editButton.setActionCommand("edit " + count);
        editButton.addActionListener(new MyActionListener());
        // editButton.setBackground;

        editButton.setIcon(new ImageIcon("edit.png"));

        buttonHolder.add(editButton, JLayeredPane.PALETTE_LAYER);
        buttonHolder.add(mainButton, JLayeredPane.DEFAULT_LAYER);
        
    }

    public JButton getMainButton()
    {
        return mainButton;
    }
    public JButton getEditButton()
    {
        return editButton;
    }
    public JLayeredPane getButtonHolder()
    {
        return buttonHolder;
    }
}

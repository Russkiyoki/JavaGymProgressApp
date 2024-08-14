import java.awt.Color;
import javax.swing.*;

public class CustomExerciseButton extends JPanel
{
    private JButton mainButton;
    private JButton editButton;
    private JLayeredPane buttonHolder;
    public CustomExerciseButton()
    {
        int count = -1;
        count++;

        buttonHolder = new JLayeredPane();
        // buttonHolder.setBounds(5,(count * 40) + 5,200,40);
        buttonHolder.setBackground(Color.orange);

        mainButton = new JButton("Button pp" + count);
        // mainButton.setBounds(5,(count * 40),200,40);
        mainButton.setSize(200,40);
        mainButton.setActionCommand("Button " + count);
        mainButton.addActionListener(new MyActionListener());
        mainButton.setBackground(Color.green);
        
        editButton = new JButton("e");
        // editButton.setBounds(160,(count * 40),40,40);
        editButton.setSize(40,40);
        editButton.setActionCommand("edit");
        editButton.addActionListener(new MyActionListener());
        editButton.setBackground(Color.cyan);

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

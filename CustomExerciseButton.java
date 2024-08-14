import javax.swing.*;

public class CustomExerciseButton extends JPanel
{
    private JButton mainButton;
    private JButton editButton;
    private int count = -1;
    public CustomExerciseButton()
    {
        count++;
        mainButton = new JButton("Button" + count);
        mainButton.setBounds(5,(count * 40),200,40);
        mainButton.setActionCommand("Button " + count);
        
        editButton = new JButton("edit");
        editButton.setBounds(185,(count * 40),20,20);
        editButton.setActionCommand("edit");
        editButton.addActionListener(new MyActionListener());

    }
}

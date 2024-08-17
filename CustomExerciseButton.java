import java.awt.*;
import javax.swing.*;

public class CustomExerciseButton extends JPanel
{
    private JButton mainButton;
    private JButton editButton;
    private JLayeredPane buttonHolder;
    public static JButton[] mainButtons = new JButton[15];

    private static int count = -1;

    public CustomExerciseButton()
    {
        count++;
        // setButtonHolder();
        setEditButton();
        setMainButton();
        buttonHolder = new JLayeredPane();
        buttonHolder.setBackground(Color.orange);
        buttonHolder.add(editButton, JLayeredPane.PALETTE_LAYER);
        buttonHolder.add(mainButton, JLayeredPane.DEFAULT_LAYER);
    }
    // private void setButtonHolder()
    // {

    // }
    private void setEditButton()
    {
        editButton = new JButton();
        editButton.setLayout(null);
        editButton.setSize(40,40);
        editButton.setActionCommand("edit " + count);
        editButton.addActionListener(new MyActionListener());
        // editButton.setBackground();
        editButton.setOpaque(true);
        editButton.setBorderPainted(false);
        editButton.setContentAreaFilled(false);
        editButton.setVisible(true);
        editButton.setMargin(new Insets(0,0,0,0));
        editButton.setIcon(new ImageIcon("editMed.png"));
        //if in resources folder, then access using FULL file path ex: "Resources\editMed.png"
        editButton.setFocusable(false);
    }
    private void setMainButton()
    {
        String text = AddExercisePopUp.textField.getText();
        mainButton = new JButton("Button " + count);
        mainButton.setText(text);
        
        mainButton.setSize(400,40);
        mainButton.setActionCommand("Button " + count);
        mainButton.addActionListener(new MyActionListener());
        mainButton.setBackground(new Color(206, 130, 47));
        mainButton.setFocusable(false);
        mainButtons[count] = mainButton;
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

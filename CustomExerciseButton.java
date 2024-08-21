import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class CustomExerciseButton extends JPanel
{
    private JButton mainButton;
    private JButton editButton;
    private JButton deleteButton;
    private static JLayeredPane buttonHolder;
    // we wont be using mainButtons array. We will use mainButtonsList instead
    // public static JButton[] mainButtons = new JButton[15];
    public static List<JButton> mainButtonsList = new ArrayList<>();
    public static List<JLayeredPane> buttonHolderList = new ArrayList<>();
    
    public static int count = 0;
    public static int id = 0;
    public CustomExerciseButton()
    {

        // setButtonHolder();
        setEditButton();
        setMainButton();
        setDeleteButton();
        buttonHolder = new JLayeredPane();
        buttonHolder.setBackground(Color.orange);
        buttonHolder.add(editButton, JLayeredPane.PALETTE_LAYER);
        buttonHolder.add(deleteButton,JLayeredPane.DEFAULT_LAYER);
        buttonHolder.add(mainButtonsList.get(count));
        buttonHolderList.add(buttonHolder);
        count++;
        id++;
    }
    public void removeButtonHolder()
    {   
        count--;
    }
    public static int getButtonHolderID()
    {
        return id;
    }
    public static void setNewID(int newID)
    {
        id = newID;
    }

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
        mainButtonsList.add(mainButton);
    }
    private void setDeleteButton()
    {
        deleteButton = new JButton();
        deleteButton.setLayout(null);
        deleteButton.setSize(40,40);
        deleteButton.setLocation(40,0);
        deleteButton.setActionCommand("delete " + count);
        deleteButton.addActionListener(new MyActionListener());
        deleteButton.setOpaque(true);
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setVisible(true);
        deleteButton.setMargin(new Insets(0,0,0,0));
        deleteButton.setFocusable(false);
        deleteButton.setIcon(new ImageIcon("garbage.png"));

    }

    public JButton getMainButton()
    {  return mainButton;  }
    public JButton getEditButton()
    {  return editButton;  }
    public JLayeredPane getButtonHolder()
    {  return buttonHolder;   }
}

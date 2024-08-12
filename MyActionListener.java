import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyActionListener implements ActionListener
{
    private JPanel p;
    public void actionPerformed(ActionEvent e) {
        // Your action code here
        String option = e.getActionCommand();
        if (option.equals("addButton Command"))
        {
            System.out.println("Button clicked!");
            JButton asd = new JButton();
            asd.setBounds(0,0,80,80);

        }
    }
}

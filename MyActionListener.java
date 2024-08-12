import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) {
        // Your action code here
        String option = e.getActionCommand();
        if (option.equals("addButton Command"))
        {
            System.out.println("Button clicked!");
        }
    }
}

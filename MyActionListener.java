
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyActionListener implements ActionListener
{
    private JPanel p;
    private int count = -1;

    //constructors
    public MyActionListener(JPanel p)
    {
        this.p = p;
    }
    public MyActionListener()
    {
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // Your action code here
        String option = e.getActionCommand();
        if (option.equals("addButton Command"))
        {
            AddExercisePopUp popUp = new AddExercisePopUp();
        }
        // Exercise Button Actions
        switch(option)
        {
            case "Button 0":
                System.out.println("Button 0 pressed");
                break;
            case "Button 1":
                System.out.println("Button 1 pressed");
                break;
        }
        // Exercise edit Button Actions
        switch(option)
        {
            case "edit 0":
                System.out.println("Edit 0 pressed!");
                break;
        }
        switch(option)
        {
            case "eb Command":
                // System.out.println("eb pressed!!!");
                CustomExerciseButton customButton = new CustomExerciseButton();
                JLayeredPane pp = customButton.getButtonHolder();
                asd(p,pp);
                break;
            case "fb Command":
                System.out.println("fb pressed!");
                break;
        }

    }

    private JLayeredPane asd(JPanel p, JLayeredPane pp)
    {
        count ++;
        pp.setBounds(5,(count * 40) + 5,400,40);

        p.add(pp);
        p.revalidate();
        p.repaint();
        return pp;

    }
    
}

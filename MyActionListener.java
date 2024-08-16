
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyActionListener implements ActionListener
{
    private JPanel p;
    private int count = -1;

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // Your action code here
        String option = e.getActionCommand();
        if (option.equals("addButton Command"))
        {
            // CustomExerciseButton customButton = new CustomExerciseButton();
            // JLayeredPane pp = customButton.getButtonHolder();
            // asd(p,pp);
            AddExercisePopUp popUp = new AddExercisePopUp();
        }
        switch(option)
        {
            case "Button 0":
                System.out.println("Button 0 pressed");
                break;
            case "Button 1":
                System.out.println("Button 1 pressed");
                break;
        }

    }
    public MyActionListener(JPanel p)
    {
        this.p = p;
    }
    public MyActionListener()
    {
        
    }
    private JLayeredPane asd(JPanel p, JLayeredPane pp)
    {
        // JButton asd = new JButton("Button " + ++count);

        // // asd.setBounds(5,(count*40) + 5,80,40);
        count ++;
        pp.setBounds(5,(count * 40) + 5,400,40);
        // asd.setBackground(new Color(206, 130, 47));
        // //Figure out color for border
        // asd.setFocusPainted(false);
        // asd.setActionCommand("Button " + count);
        // asd.addActionListener(this);


        p.add(pp);
        p.revalidate();
        p.repaint();
        return pp;

    }
    
}

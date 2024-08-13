import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyActionListener implements ActionListener
{
    private JPanel p;
    private int count = -1;
    public void actionPerformed(ActionEvent e) 
    {
        // Your action code here
        String option = e.getActionCommand();
        if (option.equals("addButton Command"))
        {
            asdButton(p);
        }

    }
    public MyActionListener(JPanel p)
    {
        this.p = p;
    }
    private JButton asdButton(JPanel p)
    {
        // System.out.println("Button clicked!");
        JButton asd = new JButton("Button " + ++count);

        // asd.setBounds(5,(count*40) + 5,80,40);
        asd.setBounds(50*count,5,200,40);
        p.add(asd);
        p.revalidate();
        p.repaint();
        return asd;
    }
}

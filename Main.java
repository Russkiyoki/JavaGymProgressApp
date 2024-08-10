import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame
{
    //Declaration of UI's
    JButton addExerciseButton;
    JLabel A, myExercisesLabel; 
    public static void main(String args[]) throws Exception
    {
        //initial GUI set up 
        Main gui = new Main();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(750,550);
        gui.setTitle("Gym Progress");
        gui.setResizable(true);
    }
    //constructor for Panels/Containers and what not
    public Main()
    {
        Font font = new Font("Times New Roman", Font.BOLD, 16);

        Container pane = this.getContentPane();

        JPanel topLeft = new JPanel();
        topLeft.setBounds(0,0,375,275);
        topLeft.setBackground(Color.green);

        JPanel topRight = new JPanel();
        topRight.setBounds(375,0,375,275);
        topRight.setBackground(Color.cyan);

        
        JPanel bottomLeft = new JPanel();
        bottomLeft.setBounds(0,275,375,275);
        bottomLeft.setBackground(Color.red);


        JPanel bottomRight = new JPanel();
        bottomRight.setBounds(375,275,375,275);
        bottomRight.setBackground(Color.blue);

        pane.add(topLeft);
        pane.add(topRight);
        pane.add(bottomLeft);
        pane.add(bottomRight);


        //UI setups
        Label myExercisesLabel = new Label("Yolki golki", SwingConstants.CENTER);
        myExercisesLabel.setFont(font);
        topLeft.add(myExercisesLabel);
        
        Label A = new Label("blinchiki", SwingConstants.TOP);
        topLeft.add(A);

        JButton addExerciseButton = new JButton("Some random text");
        topRight.add(addExerciseButton);
        

        //action listeners
        event e = new event();
        addExerciseButton.addActionListener(e);
        
    }
    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String stringg = "this is a string";
            String option = e.getActionCommand();
            if (option.equals("Some random text"))
            {
                addExerciseButton.setText(stringg);
            }
        }
    }
}
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame
{
    //Declaration of UI's
    //JButton addExerciseButton;
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
        topLeft.setBounds(0,0,250,250);

        JPanel topRight = new JPanel();
        topRight.setBounds(251,0,250,250);
        
        JPanel bottomLeft = new JPanel();
        bottomLeft.setBounds(0,251,250,250);

        JPanel bottomRight = new JPanel();
        bottomRight.setBounds(251,251,250,250);
        bottomRight.setBackground(Color.black);

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
        
    }
}
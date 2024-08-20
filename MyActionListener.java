
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyActionListener implements ActionListener
{
    private static JPanel p;
    private JLayeredPane pp;
    private static int count = -1;
    private static int whichEdit;

    //constructors
    public MyActionListener(JPanel p)
    {
        this.p = p;
    }
    public MyActionListener(JLayeredPane pp)
    {
        this.pp = pp;
    }
    public MyActionListener()
    {
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // Your action code here
        String option = e.getActionCommand();
        mainButtonSetText(option);
        editConfirmButtonClick(option);
        deleteButtonClick(option);
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
                pp = customButton.getButtonHolder();
                asd(p,pp);
                AddExercisePopUp.popUp.dispose();
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
    private static void mainButtonSetText(String o)
    {
        for(int i = 0; i <=15; i++)
        {   
            if (o.equals("edit " + i))
            {
                // CustomExerciseButton.mainButtons[i].setText("asd");
                EditExercisePopUp editClass = new EditExercisePopUp();

                // editClass.getTextString();
                whichEdit = i;
                System.out.println(whichEdit);

            }
        }
    }
    private void editConfirmButtonClick(String o)
    {
        if(o.equals("cb Command"))
        {
            System.out.println("cb pressed!");
            String updatedText = EditExercisePopUp.textField.getText(); 
            CustomExerciseButton.mainButtonsList.get(whichEdit).setText(updatedText);
            EditExercisePopUp.editPopUp.dispose();

        }
    }
private void deleteButtonClick(String o)
{
    for (int i = 0; i < CustomExerciseButton.buttonHolderList.size(); i++)
    {
        //only gets triggered if the deleteButton.ActionCommand is met
        if (o.equals("delete " + i))
        {
        System.out.println("Current I: " +i);
        CustomExerciseButton.buttonHolderList.remove(i);
            for(int j =0; j < CustomExerciseButton.buttonHolderList.size();j++)
            {
                //if ID of buttonHolder is less than buttonHolders after
                //then decrement value of ID of everything after
                // System.out.println("ID:"+CustomExerciseButton.buttonHolderList.get(i).getButtonHolderID());
                CustomExerciseButton.setNewID(i--);

                if(i < CustomExerciseButton.buttonHolderList.size() )
                {
                    //grab ButtonHolderList[i].setNewID(id-1);
                    JLayeredPane ourPane = CustomExerciseButton.buttonHolderList.get(i);
                    //other positions aren't filled yet so they are null. 
                    System.out.println("ID:"+CustomExerciseButton.getButtonHolderID());

                }
                
            }
            p.remove(i);
            p.revalidate();
            p.repaint();
        }


    }
}

    
}

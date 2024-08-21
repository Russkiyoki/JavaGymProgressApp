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
        if(option.contains("delete "))
        {
            System.out.println("IF contains accessed");
            deleteButtonClick(option);
        }
        // deleteButtonClick(option);
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
    //problem with the method is that when we delete the JLayeredPane from buttonHolderList,
    //it alters the size therefore screwing us over by changing the index position of all the
    //currently added ButtonHolders.
    // Fix:
    //possibly dupe the list after every click and then access that new list to delete?
    // Fix 2:
    // on delete.click check if i < everything after the click in order to move it
    // fix 3:
    // hashmap this mf
    for (int i = 0; i < CustomExerciseButton.buttonHolderList.size(); i++)
    {
        //only gets triggered if the deleteButton.ActionCommand is met
        if (o.equals("delete " + i))
        {
            System.out.println("Delete button pressed");
            System.out.println("Current I: " +i);
            System.out.println("customExercise.count = " + CustomExerciseButton.count);

            
            // CustomExerciseButton.buttonHolderList.remove(i);

            p.remove(i);
            p.revalidate();
            p.repaint();
        }


    }
}

    
}

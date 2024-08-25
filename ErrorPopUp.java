import javax.swing.JOptionPane;

public class ErrorPopUp 
{   
    private static JOptionPane errPopUp;
    public static String errorMessage;
    public ErrorPopUp() 
    {
        
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    
}

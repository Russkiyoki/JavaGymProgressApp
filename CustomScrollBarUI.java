import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
//All AI generated
public class CustomScrollBarUI extends BasicScrollBarUI 
{

    @Override
    protected void configureScrollBarColors() 
    {
        this.thumbColor = Color.BLUE;
        this.trackColor = Color.LIGHT_GRAY;
    }

    @Override
    protected JButton createDecreaseButton(int orientation) 
    {
        return createZeroButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) 
    {
        return createZeroButton();
    }

    private JButton createZeroButton() 
    {
        JButton jbutton = new JButton();
        jbutton.setPreferredSize(new Dimension(0, 0));
        jbutton.setMinimumSize(new Dimension(0, 0));
        jbutton.setMaximumSize(new Dimension(0, 0));
        return jbutton;
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) 
    {
        g.setColor(trackColor);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) 
    {
        if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) 
        {
            return;
        }
        int w = thumbBounds.width;
        int h = thumbBounds.height;

        g.translate(thumbBounds.x, thumbBounds.y);
        g.setColor(thumbColor);
        g.fillRect(0, 0, w - 1, h - 1);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(0, 0, w - 1, h - 1);
        g.translate(-thumbBounds.x, -thumbBounds.y);
    }

    protected void setUnitIncrement()
    {
        
    }
}

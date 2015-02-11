import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing. JLabel;
import java.awt.event.ActionEvent;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    JFrame frame;
    JPanel panel;
    JButton buttonA, buttonB;
    JLabel label;
    
    public ButtonViewer()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        JButton buttonA = new JButton( "A");
        JButton buttonB = new JButton("B"); 
        
        JLabel label = new JLabel("No button clicked");
        panel.add(label);
        panel.add(buttonA);
        panel.add(buttonB);   
        frame.add(panel);
        
        
        ActionListener listner = new ClickListener();
        buttonA.addActionListener(listner);
        buttonB.addActionListener(listner);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
       
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            label.setText("Button " + event.getActionCommand() + " was clicked");
        }
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
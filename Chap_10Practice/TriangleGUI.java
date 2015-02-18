import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.awt.geom.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class TriangleGUI extends JComponent {
    public class Mouse implements MouseListener {
        private int xPos;
        private int yPos;
        Graphics2D g2;
        @Override
        public void mouseClicked(MouseEvent e) {
            
        }
        @Override
        public void mouseEntered(MouseEvent e) {
           
        }
        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        @Override
            public void mousePressed(MouseEvent e) {
            
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            xPos = e.getX();
            yPos = e.getY();
            Paint dot = new Paint();
            dot.drawDot(g2,xPos, yPos);
        }
    }  
    public TriangleGUI(){
        JFrame frame = new JFrame();
        frame.setSize(1000,800);
            
        frame.add(this);
        Mouse mouse = new Mouse();
        this.addMouseListener(mouse);
        
            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        frame.setVisible(true);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    public static void main(String[] args){
        TriangleGUI view = new TriangleGUI();
        }
}

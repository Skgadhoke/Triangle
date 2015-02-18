import java.awt.geom.*;
import java.awt.Graphics2D;
import java.awt.Color;

public class Paint{
    public void drawDot(Graphics2D g2, int x, int y){
        Color dotColor = new Color(100,100,200);
        Ellipse2D.Double dot = new Ellipse2D.Double();
        g2.setColor(dotColor);
        g2.draw(dot);
        g2.fillOval(x,y,10,10); 
        }
}

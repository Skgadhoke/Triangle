<<<<<<< HEAD
                                                                                      

/**
 * Write a description of class f here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paint
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class f
     */
    public f()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

=======
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
>>>>>>> 593069f525e00ea7d427c60dd78b6c762ab95c62
}

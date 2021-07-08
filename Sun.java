import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * A yellow Circle that moves from left to right
 *
 * @author gokulvipin
 * @version 11/30/2020
 */
public class Sun{
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for the Sun class.
     */
    public Sun(int initialX, int initialY){
        this.xLeft = initialX;
        this.yTop = initialY;  
    }

    /**
      Draws the sun.
      @param g2 the graphics context
   */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double body = new Ellipse2D.Double(this.xLeft, this.yTop, 100, 100);
        g2.setColor(Color.yellow);
        //fills the sun
        g2.fill(body);
    }
    public void move(){
       this.xLeft += 2;
    }
}


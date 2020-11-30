import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * Red blocks of rectangle
 *
 * @author gokulvipin
 * @version 11/30/2020
 */
public class Building
{
    private double breadth ;
    private double height;
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for the Building class.
     */
    public Building(int initialBreadth, int initialHeight,  int initialX, int initialY){
        this.breadth = initialBreadth;
        this.height = initialHeight;
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
      Draws the building.
      @param g2 the graphics context
   */
    public void draw(Graphics2D g2)
    {
         Rectangle2D.Double body = new Rectangle2D.Double(this.xLeft,this.yTop,this.breadth,this.height);      
         g2.setColor(Color.red);
         //fills the building
         g2.fill(body);
    }

}


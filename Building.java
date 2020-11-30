import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * Write a description of class building here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Building
{
  private double breadth ;
  private double height;
  private String color; 

    /**
     * Default constructor for the Sun class.
     */
    public Building(int initialBreadth, int initialHeight, String initialColor){
        this.breadth = initialBreadth;
        this.height = initialHeight;
        this.color = initialColor;  
    }
    public void draw(Graphics2D g2)
   {
      
   }

}


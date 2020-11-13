import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Sun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sun{
    private double radius ;
    private String color;
    private Sun sun1;   

    /**
     * Default constructor for the Sun class.
     */
    public Sun(int initialRadius, String initialColor){
        this.radius = initialRadius;
        this.color = initialColor;  
    }
    public void draw(Graphics2D g2)
   {
      //Ellipse2D.Double frontTire 
       //  = new Ellipse2D.Double(this.radius);
   }

}


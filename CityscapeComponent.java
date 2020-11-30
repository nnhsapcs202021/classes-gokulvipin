import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author gokulvipin
 * @version 11-6-2020
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...

    private Carnew car1 = new Carnew(0,350);
    private Sun sun1 = new Sun(100,10);
    private Carnew car2 = new Carnew(90,350);
    private Building building1 = new Building(45,150,10,150);
    private Building building2 = new Building(55,50,40,250);
    private Building building3 = new Building(60,150,150,150);
    private Building building4 = new Building(75,125,250,175);
    private Building building5 = new Building(75,125,350,175);
    private Building building6 = new Building(75,125,450,175);
    private Building building7 = new Building(75,125,550,175);
    // define the CityscapeComponent contructor and intiailize all instance variables
    public CityscapeComponent(Carnew initialCar1, Carnew initialCar2, Sun initialSun1, Building initialBuilding1, Building initialBuilding2, Building initialBuilding3, Building initialBuilding4, Building initialBuilding5, Building initialBuilding6, Building initialBuilding7){
        this.car1 = initialCar1;
        this.car2 = initialCar2;
        this.sun1 = initialSun1;
        this.building1 = initialBuilding1;
        this.building2 = initialBuilding2;
        this.building3 = initialBuilding3;
        this.building4 = initialBuilding4;
        this.building5 = initialBuilding5;
        this.building5 = initialBuilding6;
        this.building7 = initialBuilding7;

    }

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method on each object in your Cityscape
        // ...
        car1.draw(g2);
        car2.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        sun1.draw(g2);
    }

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...

        car1.drive();
        car2.drive();
        sun1.move();
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}

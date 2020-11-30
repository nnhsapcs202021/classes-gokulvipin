import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author gokulvipin
 * @version 11/30/2020
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;
    static private Carnew car1 = new Carnew(0,350);
    static private Sun sun1 = new Sun(100,10);
    static private Carnew car2 = new Carnew(90,350);
    static private Building building1 = new Building(45,150,10,150);
    static private Building building2 = new Building(55,50,40,250);
    static private Building building3 = new Building(60,150,150,150);
    static private Building building4 = new Building(75,125,250,175);
    static private Building building5 = new Building(75,125,350,175);
    static private Building building6 = new Building(75,125,450,175);
    static private Building building7 = new Building(75,125,550,175);
    /**
     * main method for the program which creates and configures the frame for the program
     * 
     * @param args  not used
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(car1, car2, sun1, building1, building2, building3, building4, building5, building6, building7);
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 1000 );
        }
        
    }

}

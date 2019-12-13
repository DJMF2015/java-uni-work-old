// To import the graphics features
import java.awt.*;

/**
 *  Class repesenting a Balloon and its details
 *  
 * @author     Simon Jones
 * @version    02 November 2005
 */
public class Balloon {

    /** The balloon's diameter */
    private int diameter;
    
    /** The balloon's position */
    private int xCoord, yCoord;
    
    /** The balloon's colour */
    private Color color;

    /**
     * Constructor for the Balloon object
     *
     * @param  initialDiameter  Initial diameter
     * @param  initialX         Initial x coordinate
     * @param  initialY         Initial y coordinate
     */
    public Balloon( int initialDiameter,
            int initialX, int initialY ) {
                
        // Initialize instance variables
        diameter = initialDiameter;
        xCoord = initialX;
        yCoord = initialY;
        color = Color.black;
        
    } // end of constructor Balloon

    /**
     *  Alters the size of the balloon
     *
     * @param  change  This is added to the current diameter
     */
    public void changeSize( int change ) {
        
        diameter += change;    // Note: a+=b means a = a+b
        
    } // end of changeSize

    /**
     *  Moves the balloon
     *
     * @param  xChange  This should be added to the current x coordinate
     * @param  yChange  This should be added to the current y coordinate
     */
    public void move( int xChange, int yChange ) {
        
        // need stuff here
        xCoord =  xCoord + xChange ;
        yCoord =   yCoord + yChange ;
        
    } // end of move

    /**
     *  Sets the balloonColor attribute of the Balloon object
     *
     * @param  col  The new balloonColor value
     */
    public void setBalloonColor( Color col ) {
        
        color = col;
        
    } // end of setBalloonColor

    /**
     *  Draw a pictorial view of the balloon
     *
     * @param  g  Where to draw
     */
    public void display( Graphics g ) {
        
        g.setColor( color );
        g.drawOval( xCoord, yCoord, diameter, diameter );
        
    } // end of display

    /**
     *  Draw a textual "view" of the balloon
     *
     * @param  g  Where to draw
     */
    public void describe( Graphics g ) {
        
        // In the balloon's current colour, display a message block like:
        //      Balloon diameter: 20      (whatever diameter it actually is)
        //      At position: (50,50)      (whatever position it is actually at)
        // with the B of Balloon positioned at the balloon's xCoord and yCoord
        g.setColor(color);
        g.drawString(" Balloon diameter is : " + diameter , xCoord , yCoord);
        
    } // end of describe

} // end of class Balloon

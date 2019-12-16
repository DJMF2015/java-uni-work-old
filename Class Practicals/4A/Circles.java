
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *  For Practical 5: Draws a row of circles.
 *  The number of circles is controlled by a slider.
 *  <p>
 *  Note: All the instance variables and methods in this program are
 *  designated as public, to make JavaDoc generation produce something
 *  interesting. Properly, only main and stateChanged should be public.
 *
 * @author     sbj
 * @version    16 October 2008
 */
public class Circles extends JFrame
         implements ChangeListener {

    /**
     *  The slider for selecting the number of circles to be drawn
     */
    private JSlider slider;

    /**
     *  The drawing panel
     */
    private JPanel panel;

    /**
     *  The width of the drawing panel
     */
    private final int panelWidth = 700;

    /**
     *  The height of the drawing panel
     */
    private final int panelHeight = 100;
    
    /**
     *  The main program launcher for the Circles class
     *
     * @param  args  The command line arguments (ignored here)
     */
    public static void main( String[] args ) {

        Circles demo = new Circles();
        demo.setSize( 750, 200 );
        demo.createGUI();
        demo.setVisible( true );

    } // End of main

    /**
     *  Sets up the graphical user interface
     */
    public void createGUI() {

        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        slider = new JSlider( 0, 20, 20 );
        window.add( slider );
        slider.addChangeListener( this );

        panel = new JPanel();
        panel.setPreferredSize( new Dimension( panelWidth, panelHeight ) );
        panel.setBackground( Color.white );
        window.add( panel );

    } // End of createGUI

    /**
     *  Reacts to adjustment of the slider.
     *  Draws a number of circles as selected by the slider.
     *
     * @param  e  Details of the event (ignored here)
     */
    public void stateChanged( ChangeEvent e ) {
        
       
        Graphics g = panel.getGraphics();
        // Fetch up to date slider setting
        int numberOfCircles = slider.getValue();
       
        // Erase the drawing panel
        g.setColor( Color.white );
        g.fillRect( 0, 0, panelWidth, panelHeight );
        // Draw a row of circles
        g.setColor( Color.black );
        int x = 20;
        g.drawString ("Number of circles is: " +  numberOfCircles, 0, 10);// displays number of circles drawn
        for ( int circle = numberOfCircles; circle>0; circle--){ //for loop to control decrement
            
            g.drawOval( x, 30, 20, 20 ); //draws circle(s)
            
            
            // 20 pixel diameter
            x = x + 30; //x counter
            
            
            
           // Gives a 10 pixel gap
    }

  g.drawString ("Number of circles is: " + x, 0, 70);//g.drawString to print 'x' counter value of circles
    } // End of stateChanged

} // End of Circles


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *  An extended UseBalloon application for Practical 6B
 *  Exercises with classes, display modes
 *
 * @author     Simon Jones
 * @version    02 November 2005
 */
public class PlayBalloon extends JFrame
         implements ActionListener, ChangeListener {

    /** Size change buttons */
    private JButton grow, shrink;
    
    /** Four movement buttons */
    private JButton moveLeft, moveRight, moveUp, moveDown;
    
    /** To flip between highlighted and normal display of the balloon (not used yet) */
    private JButton highlight;
    
    /** To flip picture <-> description mode */
    private JButton mode;
    
    /** 'Flag' to indicate the current mode:
     *      true = show a picture, false = show a description
    */
    private boolean pictureMode , drawMode = true;
    
    /** Range 0-6 for colours (see method convertColour below) */
    private JSlider colorSelector; 

    /** Panel for drawing on */
    private JPanel panel;

    /** To hold a single instance of the Balloon class */
    private Balloon myBalloon;

    /**
     *  The main program for the PlayBalloon class
     *
     * @param  args  The command line arguments
     */
    public static void main( String[] args ) {

        PlayBalloon play = new PlayBalloon();
        play.setSize( 320, 430 );
        play.createGUI();
        play.setVisible( true );

    } // end of main

    /** Set up the Graphical user interface */
    private void createGUI() {

        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        grow = new JButton( "Grow" );
        window.add( grow );
        grow.addActionListener( this );

        shrink = new JButton( "Shrink" );
        window.add( shrink );
        shrink.addActionListener( this );

        moveLeft = new JButton( "Left" );
        window.add( moveLeft );
        moveLeft.addActionListener( this );

        moveRight = new JButton( "Right" );
        window.add( moveRight );
        moveRight.addActionListener( this );

        moveUp = new JButton( "Up" );
        window.add( moveUp );
        moveUp.addActionListener( this );

        moveDown = new JButton( "Down" );
        window.add( moveDown );
        moveDown.addActionListener( this );

        mode = new JButton( "Picture/description mode" );
        window.add( mode );
        mode.addActionListener( this );
        
        highlight = new JButton( "highlight" );
        window.add( highlight );
        highlight.addActionListener( this );

        JLabel lab = new JLabel( "Colour:", JLabel.RIGHT );  // Right align the label text
        window.add( lab );

        colorSelector = new JSlider( JSlider.HORIZONTAL, 0, 6, 0 );
        window.add( colorSelector );
        colorSelector.addChangeListener( this );

        panel = new JPanel();
        panel.setPreferredSize( new Dimension( 300, 300 ) );
        panel.setBackground( Color.white );
        window.add( panel );

        // Finally, create the actual Balloon instance
        myBalloon = new Balloon( 20, 50, 50 );

    } // end of createGUI

    /**
     *  React to the various GUI buttons:
     *  Update balloon or mode information as necessary and redraw the screen.
     *
     * @param  event  The event details
     */
    public void actionPerformed( ActionEvent event ) {

        if ( event.getSource() == grow )
            myBalloon.changeSize( 10 );

        if ( event.getSource() == shrink )
            myBalloon.changeSize( -10 );

        // Deal with movement buttons here

        if ( event.getSource() == mode )
            pictureMode = !pictureMode;   // Flip the mode
                                          // Note: ! is logical "not" (negation)
                                          
        if (event.getSource() == moveLeft)                                  
         myBalloon.move (-10,0);
         
        if (event.getSource() == moveRight)
         myBalloon.move(10,0);
        
         if (event.getSource() == moveUp)
         myBalloon.move(0,-10);
        
         if (event.getSource() == moveDown )
         myBalloon.move(0,10);
         
          
        paintScreen();

    } // end of actionPerformed

    /**
     *  React to colorSelector being adjusted:
     *  Convert the setting to a proper colour, update the balloon's details
     *  and redraw the screen
     *
     * @param  event  Event details (ignored)
     */
    public void stateChanged( ChangeEvent event ) {

        Color theColour = convertColour( colorSelector.getValue() );
        myBalloon.setBalloonColor( theColour );

        paintScreen();

    } // end of adjustmentValueChanged

    /** Redraw the graphics panel */
    private void paintScreen() {

        // Now redraw the screen
        Graphics g = panel.getGraphics();

        g.setColor( Color.white );
        g.fillRect( 0, 0, 300, 300 );
         if (pictureMode == true){
         myBalloon.display( g );
        }  
        else 
         myBalloon.describe( g );
        

    } // end of paintScreen

    /**
     *  A helper method to convert a number 0-6 to a Color.
     *
     * @param  colourNum  The number to be converted
     * @return            The corresponding Color
     */
    private Color convertColour( int colourNum ) {

        switch ( colourNum ) {
            case 0:
                return Color.black;
            case 1:
                return Color.red;
            case 2:
                return Color.orange;
            case 3:
                return Color.yellow;
            case 4:
                return Color.green;
            case 5:
                return Color.cyan;
            case 6:
                return Color.blue;
            default:
                return Color.black;
        }

    } // end of convertColour

} // end of class PlayBalloon





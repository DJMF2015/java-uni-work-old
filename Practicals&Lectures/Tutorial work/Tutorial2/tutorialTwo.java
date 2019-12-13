import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class tutorialTwo extends JFrame
    implements ActionListener {

    //
    /**
     * Constructor for objects of class tutorialTwo
    public class tutorialTwo extends JFrame
         implements ActionListener {

    /**
     *  This is the button that appears in the display.
     */
    private JButton button;
    private JPanel panel;
    /**
     *  This is the panel that is drawn on.
     */
    

     
    public static void main( String[] args ) {
        tutorialTwo frame = new tutorialTwo ();
        frame.setSize( 500, 400 );
        frame.createGUI();
        frame.setVisible( true );
    } // End of main

    /**
     *  The createGUI method is called by the main method
     *  to set up the graphical user interface.
     */
    private void createGUI() { //Creates GUI
        // Set up main window characteristics
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        // Create the panel for drawing on
        panel = new JPanel();
        panel.setPreferredSize( new Dimension( 450, 300 ) );
        panel.setBackground( Color.white );
        window.add( panel );

        // Create the button for clicking
        button = new JButton( "Press me" );
        window.add( button );
        button.addActionListener( this );
    } // End of createGUI

    public void actionPerformed(ActionEvent event){ //This is the actionPerformed method that inititiates constructor
      Graphics paper = panel.getGraphics();
      highlight(paper, 100, 100, 250, 150); //Actual parameters for rectangle shape
    
     
    } //This is the Header and constructor method
    private void highlight(Graphics drawingArea,   //these are the Formal parameters (ints) for use int the method 'call'
           int xPos, int yPos, int height, int width){
       drawingArea.setColor(Color.red); //method call to set color of rectangle
       drawingArea.fillRect(xPos, yPos, height, width);//method call to draw rectangle filled in with red pixels
       drawingArea.setColor(Color.white); //sets font colour to white
       drawingArea.drawString("Hello.I Am a string!", 160, 160);//calls method to draw a string in white on rectangle
         
    }
}

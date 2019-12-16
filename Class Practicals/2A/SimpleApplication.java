import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  This program is a simple template for Java applications.
 *
 *  It comprises a single panel and button, with an actionPerformed method.
 */
public class SimpleApplication extends JFrame
         implements ActionListener {

    /**
     *  This is the button that appears in the display.
     */
    private JButton button;

    /**
     *  This is the panel that is drawn on.
     */
    private JPanel panel;

    /**
     *  The main method is the main action for the SimpleApplication program.
     *
     * @param  args  The launch arguments (though none are required).
     */
    public static void main( String[] args ) {
        SimpleApplication frame = new SimpleApplication ();
        frame.setSize( 400, 300 );
        frame.createGUI();
        frame.setVisible( true );
    } // End of main

    /**
     *  The createGUI method is called by the main method
     *  to set up the graphical user interface.
     */
    private void createGUI() {
        // Set up main window characteristics
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        // Create the panel for drawing on
        panel = new JPanel();
        panel.setPreferredSize( new Dimension( 300, 200 ) );
        panel.setBackground( Color.white );
        window.add( panel );

        // Create the button for clicking
        button = new JButton( "Press me" );
        window.add( button );
        button.addActionListener( this );
    } // End of createGUI

    /**
     *  The actionPerformed method is called automatically
     *  when the button is pressed.
     *
     * @param  event  This brings information about the button
     *                press event. Ignored in this application.
     */

    public void actionPerformed(ActionEvent event) {

        Graphics paper = panel.getGraphics();
        //variables of triangle
        int bottomX = 80;
        int bottomY =  150;
        int base = 100;
        int height = 110;
        int rightX = bottomX+base;
        int topX = bottomX+base/2;
        int topY = bottomY-height;



        System.out.println("Value of rightX is " + rightX); //prints out value of rightX
        paper.drawLine(rightX,bottomY,topX,topY); // draws rightside of triangle
        System.out.println("Value of topX is " + topX);//prints out value of topX
        paper.drawLine(topX,topY,bottomX,bottomY); //draws leftside of triangle
        System.out.println("Value of topY is " + topY);//prints out value of topY
        paper.drawLine(bottomX,bottomY,rightX, bottomY); //draws base of triangle
      }
    }


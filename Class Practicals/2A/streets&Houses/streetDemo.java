import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  This program is a simple template for Java applications.
 *
 *  It comprises a single panel and button, with an actionPerformed method.
 */
public class streetDemo extends JFrame
implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

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
        streetDemo frame = new streetDemo ();
        frame.setSize( 500, 400 );
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
        panel.setPreferredSize( new Dimension( 400, 300 ) );
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

    public void actionPerformed(ActionEvent event) {//actual paramenters
        Graphics paper = panel.getGraphics();
        drawHouse(paper, 60, 90, 50, 50);
        drawHouse(paper, 10, 90, 50, 50);
        drawHouse(paper, 125, 90 ,50, 50);
        drawHouse(paper, 195, 90 ,50, 50);
        drawHouse(paper, 265, 90 ,50, 50);

    }

    private void drawHouse(Graphics drawingArea,//formal parameters
    int topRoofX,
    int topRoofY,
    int width,
    int height) {
        //formal parameters
        drawHouse (drawingArea, topRoofX, topRoofY, width, height);

        drawHouse (drawingArea,topRoofX, topRoofY, width,height);

    }

    private void drawTriangle(Graphics drawingArea,
    int xPlace,
    int yPlace,
    int width,
    int height) {
        //formal parameters
        drawingArea.drawLine(xPlace, yPlace,//formal parameters
            xPlace, yPlace + height);
        drawingArea.drawLine(xPlace, yPlace + height,
            xPlace + width, yPlace + height);
        drawingArea.drawLine(xPlace, yPlace,xPlace + width,
            yPlace + height);
        drawingArea.drawLine(xPlace, yPlace,xPlace + width,
            yPlace + height);
        drawingArea.drawLine(xPlace, yPlace,xPlace + width,
            yPlace + height);
         drawingArea.drawLine(xPlace, yPlace,xPlace + width,
            yPlace + height);
        //formal parameters
        drawingArea.setColor(Color.black);
        drawingArea.drawLine(0,250,400,250);
        drawingArea.setColor(Color.black);
        drawingArea.drawLine(0,200,400,200);
        drawingArea.setColor(Color.black);
        drawingArea.drawLine(0,220,10,220);
        drawingArea.setColor(Color.black);
        drawingArea.drawLine(50,220,0,220);
        drawingArea.setColor(Color.black);
        drawingArea.drawLine(100,220,0,220);
        drawingArea.setColor(Color.black);
        drawingArea.setColor(Color.yellow);
        drawingArea.fillOval(10, 20, 50, 50);
        drawingArea.setColor(Color.black);
        drawingArea.setColor(Color.blue);
        drawingArea.drawString("Street Demo-5 houses & sun", 100, 50);
        drawingArea.setColor(Color.black);

    }
}

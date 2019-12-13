import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/** Mouse handling practical
 *
 * This program displays a single filled circle, initially 20 pixels in radius.
 * The size is adjustable using two buttons, with radius increasing and
 * decreasing in steps of 5 pixels.
 *
 * Functionality to be added is:
 *  -  repositioning the circle by mouse click
 *  -  displaying the circle's details in a pop-up 'tool-tip'
 *           when the mouse is positioned over the circle
 *  -  changing the circle's colour by clicking on a colour palette
 *
*/
public class Move extends JFrame
                  implements ActionListener, MouseListener, MouseMotionListener {

    /** Circle adjustment buttons. */
    private JButton grow = new JButton("Grow");
    private JButton shrink = new JButton("Shrink");

    /** The drawing panel. */
    private JPanel panel;

    /** The circle details: size and colour. */
    private int radius = 20;
    private Color circleColour = Color.blue;

    /** This indicates whether the circle info is to be displayed (true), or not (false). */
    private boolean showCircleInfo = false;

    /** These always hold the current known mouse coordinates, assumed 0 initially. */
    private int currentMouseX = 0, currentMouseY = 0;

    /** These always hold the last known mouse click coordinates in centre zone.
     *  This is also where the circle will be drawn.
     */
    private int lastClickX = 0, lastClickY = 0;

    /** An initialized array used for choosing a colour for the circle. */
    private Color[] colourPalette = { Color.black, Color.pink, Color.red, Color.orange,
                                      Color.yellow, Color.green, Color.blue, Color.cyan };

    /**
     *  The main program launcher for the Move class.
     *
     * @param  args  The command line arguments (ignored here).
     */
    public static void main( String[] args ) {

        Move frame = new Move();
        frame.setSize( 500, 500 );
        frame.setLocation(100,100);
        frame.createGUI();
        frame.setVisible( true );

    } // End of main

    /** Sets up the graphical user interface. */
    private void createGUI() {

        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        window.add(grow);
        window.add(shrink);
        grow.addActionListener(this);
        shrink.addActionListener(this);

        panel = new JPanel();
        panel.setPreferredSize( new Dimension( 400, 400 ) );
        panel.setBackground( Color.white );
        window.add( panel );

        // The program wants notification of all mouse events in the drawing panel
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);

    } // End of createGUI

    /** Redraw the screen. */
    private void paintScreen(Graphics g) {

        // Draw the circle
        g.setColor(circleColour);
        g.fillOval(100-radius, 100-radius, 2*radius, 2*radius);

        // Draw the circle info if appropriate
        if (showCircleInfo) {
            g.setColor(Color.yellow);
            g.fillRect(lastClickX, lastClickY, 170, 20);
            g.setColor(Color.black);
            g.drawRect(lastClickX, lastClickY, 170, 20);
            g.drawString("Circle radius "+radius+" at ("+lastClickX+","+lastClickY+")", lastClickX+5, lastClickY+15);
        }

        // Draw the mouse info
        g.setColor(Color.black);
        g.drawString("Current mouse coordinates: ("+currentMouseX+","+currentMouseY+")", 20, 330);
        g.drawString("Last mouse click was at: ("+lastClickX+","+lastClickY+")", 20, 350);

        // Draw the colour palette in 40x40 pixel blocks at bottom of panel
        for (int i = 0; i < colourPalette.length; i++) {
            g.setColor(colourPalette[i]);
            g.fillRect(20+i*40, 360, 40, 40);
        }

    } // End of paintScreen

    /** Button clicked: determine which button, modify the circle's radius,
     * and enable/disable buttons as appropriate.
     */
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == grow)
            radius = radius+5;
        else if (e.getSource() == shrink)
            radius = radius-5;

        // Check whether circle is now at a size limit and enable/disable the buttons accordingly

        if (radius == 0)
            shrink.setEnabled(false);
        else
            shrink.setEnabled(true);

        if (radius == 100)
            grow.setEnabled(false);
        else
            grow.setEnabled(true);

        // Fetch, erase and then redraw the drawing panel
        Graphics g = panel.getGraphics();
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400 );
        paintScreen(g);

    } // End of actionPerformed

    /** Respond to a mouse button click. */
    public void mouseClicked(MouseEvent e) {

        int mouseX = e.getX();
        int mouseY = e.getY();

        // Check whether click is in main drawing zone, above colour palette
        if (mouseY < 360) {

            // Insert update of variables holding last known mouse click coordinates here

        }

        // Check whether click is in the colour palette
        if (mouseY >= 360 && 20 <= mouseX && mouseX < (20+colourPalette.length*40)) {

            // In place of 6, insert calculation of index of which colour was clicked on
            int colourIndex = 6;   // 6 is the index of Color.blue in colourPalette
            circleColour = colourPalette[colourIndex];

        }

        // Fetch, erase and then redraw the drawing panel
        Graphics g = panel.getGraphics();
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400 );
        paintScreen(g);

    } // End of mouseClicked

    /**  Respond to movement of the mouse. */
    public void mouseMoved(MouseEvent e) {

        int mouseX = e.getX();
        int mouseY = e.getY();

        // Insert update of variables holding current mouse coordinates here

        // Insert "Is mouse over circle?" check here

        // Fetch, erase and then redraw the drawing panel
        Graphics g = panel.getGraphics();
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400 );
        paintScreen(g);

    } // end mouseMoved

    // The following methods must be present but are not used

    public void mousePressed(MouseEvent e) { }

    public void mouseReleased(MouseEvent e) { }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }

    public void mouseDragged(MouseEvent e) { }

} // End of Move class


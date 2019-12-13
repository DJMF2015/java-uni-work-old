import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *  This program is a simple template for Java applications.
 *
 *  It comprises a single panel and button, with an actionPerformed method.
 */
public class Triangle extends JFrame
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
     *  The main method is the main action for the Triangle program.
     *
     * @param  args  The launch arguments (though none are required).
     */
    public static void main( String[] args ) {
        Triangle frame = new Triangle ();
        frame.setSize( 500, 400 );
        frame.createGUI();
        frame.setVisible( true );
    } // End of main

    /**
//      *  The createGUI method is called by the main method
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
        panel.setBackground( Color.white);
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
        drawTriangle(paper,125,100,30,70);
 
      }
  private void drawTriangle (Graphics paper, int bottomX, int bottomY,int base, int height) {
       
        bottomX = 80;
        bottomY =  150;
        base = 100;
        height = 110;
       
        int rightX = bottomX+base;
        int topX = bottomX+base/2;
        int topY = bottomY-height;

        
        paper.drawLine(rightX,bottomY,topX,topY); // draws rightside of triangle
        System.out.println("Value of topX is " + topX);//prints out value of topX
        paper.drawLine(topX,topY,bottomX,bottomY); //draws leftside of triangle
        System.out.println("Value of topY is " + topY);//prints out value of topY
        paper.drawLine(bottomX,bottomY,rightX, bottomY); //draws base of triangle
        System.out.println("Value of rightX is " + rightX); //prints out value of rightXbottomY+100);
       
        paper.drawLine(rightX+75,bottomY,topX+75,topY); 
        System.out.println("Value of topX is " + topX);//prints out value of topX 
        paper.drawLine(topX+75,topY,bottomX+75,bottomY);
        System.out.println("Value of topY is " + topY);////prints out value of topY
        paper.drawLine(bottomX+75,bottomY,rightX+75, bottomY);//draws base of triangle
        System.out.println("Value of rightX is " + rightX); //prints out value of rightXbottomY+100);

        paper.drawLine(rightX-75,bottomY,topX-75,topY); 
        paper.drawLine(topX-75,topY,bottomX-75,bottomY);//draws base of triangle
        paper.drawLine(bottomX-75,bottomY,rightX-75, bottomY);//draws base of triangle
      }
}

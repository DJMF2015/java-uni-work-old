import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  This program displays the sum of a range of numbers entered in text fields
 *  when a button is clicked.
 *
 *  This version is for practising with BlueJ's interactive debugging tool.
 *
 * @author     sbj
 * @version    16 October 2005
 */
public class SumUp extends JFrame
                   implements ActionListener {

    /** The textfield for entering the first number in the range
        to be summed */
    private JTextField start;

    /** The textfield for entering the final number in the range
        to be summed */
    private JTextField end;

    /** The textfield for displaying the resultant sum */
    private JTextField result;

    /** The button for triggering a calculation to be carried out */
    private JButton button;

    /** Holds the range start value.
     *  Set up in actionPerformed from the start textfield.
     *  Should preferably be a local variable in actionPerformed
     */
    private int rangeStart;

    /** Holds the range end value.
     *  Set up in actionPerformed from the end textfield.
     *  Should preferably be a local variable in actionPerformed
     */
    private int rangeEnd;

     /**
     *  The main launch program for the SumUp class
     *
     * @param  args  The command line arguments (ignored here)
     */
    public static void main( String[] args ) {

        SumUp demo = new SumUp();
        demo.setSize( 400, 150 );
        demo.createGUI();
        demo.setVisible( true );

    } // End of main

    /** Sets up the graphical user interface */
    private void createGUI() {

        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        window.add( new JLabel( "Range start:" ) );

        start = new JTextField( 5 );
        window.add( start );

        window.add( new JLabel( "Range end:" ) );

        end = new JTextField( 5 );
        window.add( end );

        button = new JButton( "Calculate" );
        window.add( button );
        button.addActionListener( this );

        window.add( new JLabel( "Sum:" ) );

        result = new JTextField( 5 );
        window.add( result );

    } // End of createGUI

    /**
     *  Responds to a button click by carrying out the requested
     *  calculation and displaying the result
     *
     * @param  event  Details of the event (ignored here)
     */
    public void actionPerformed( ActionEvent event ) {

        String startText = start.getText();
        rangeStart = Integer.parseInt( startText );
        String endText = end.getText();
        rangeEnd = Integer.parseInt( endText );
//         int total = 0;                   // X
//         int count = rangeStart;
//         while ( count <= rangeEnd ) {    // Preferably should be a for loop
//             total = total + count;
//             count++;
//         }                                // XX
        int total = sum( rangeStart, rangeEnd );
        result.setText( Integer.toString( total ) );

    } // End of actionPerformed

    /**
     * Returns the sum of integers from start up to end inclusive
     *
     * @param  start  The first value in the range
     * @param  end    The final value in the range
     * @return The sum from start up to end inclusive
     */
    private int sum( int start, int end ) {

        int total = 0;
        int count = start;
        while ( count <= end ) {    // Preferably should be a for loop
            total = total + count;
            count++;
        }
        return total;

    } // End of sum

} // End of SumUp


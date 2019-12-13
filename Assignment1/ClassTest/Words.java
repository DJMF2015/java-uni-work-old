/*
 *  ITNP001 class test    Autumn 2015
 *
 *  Student number: 2125379
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Words extends JFrame implements ActionListener {

    /**
     * Text field for entering a word
     */
    private JTextField wordField;
    private JTextField fontSizeField;
    private JTextField repetitionField;

    /**
     *  A control button to cause drawing
     */
    private JButton displayButton = new JButton( "Display Words!" );

    /**
     *  A panel for drawing
     */
    //private JPanel displayPanel;
    private JPanel displayPanel = new JPanel();

    /**
     *  Launches the application
     *
     *@param  args  The command line arguments (not used)
     */
    public static void main( String[] args ) {

        Words window = new Words();
        window.setSize( 525, 550 );
        window.createGUI();
        window.setVisible( true );
        window.setResizable(false);

    }  // End of main

    //Sets up the graphical user interface
    private void createGUI() {
        // Set up main window characteristics
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        // Set up the interface widgets
        JLabel enterWordLabel = new JLabel( "Enter a Word" );
        window.add( enterWordLabel );

        // Text field for entering a word
        wordField = new JTextField(10);
        window.add(wordField);

        // Label and text field for repetition entry
        JLabel repLabel = new JLabel("Number of repetitions: ");
        repetitionField = new JTextField( 5 );
        window.add( repLabel );
        window.add( repetitionField );

        // Label and text field for font size
        JLabel fontLabel = new JLabel("Font size:" );
        fontSizeField = new JTextField( 5 );
        window.add( fontLabel );
        window.add( fontSizeField );

        // Control button to prompt display
        displayButton = new JButton("Draw words");
        window.add(displayButton);
        displayButton.addActionListener(this);

        // Set up a display panel for drawing
        displayPanel = new JPanel();
        displayPanel.setPreferredSize( new Dimension(550, 350) );
        displayPanel.setBackground( Color.cyan );
        window.add(displayPanel);

    }  // End of createGUI
    
    /**
     * Responds to a button click
     *
     * @param  e  The action event data - which button was clicked
     */
    public void actionPerformed(ActionEvent e) {                    // this reacts to button presses

        String wordInput = wordField.getText();                         // sets wordInput to the String in wordField
        int ySpacing = 0;
        int repNumber = Integer.parseInt( repetitionField.getText() );  // initialises the variable repNumber to the converted int of the value in repetitionField.getText() 
        int fontSize = Integer.parseInt( fontSizeField.getText() );     // initialises the variable fonrSize to the converted int of the value of fontSizeField.getText()

        // Fetch graphics panel information
        Graphics g = displayPanel.getGraphics();                    // "Compiler, look at the Graphics class and make an object called "g" from that class; and store in "g" the values of displayPanel.getgraphics() method."
        g.setColor( Color.cyan );                                   // sets the Color variable to "cyan"
        g.fillRect( 0, 0, 550, 350 );                               // paints the panel cyan
        g.setColor( Color.red );                                    // sets the color variable to red
        g.drawRect( 1, 1, 548, 348 );                               // draws the outline of a rectangle from co-ordinate (1, 1) travelling 548 across, 348 down

        // Draw a word
        g.setColor( Color.black );                                          // sets the colour variable to black
        g.setFont( new Font("Times New Roman", Font.ITALIC, fontSize) );    // sets the font variable to the nex instance of Font set to "Times New Roman" in italics at font size 26
        for (int i = 0; i < repNumber; i++) {                               // starts a loop
            g.drawString(wordInput, 30, 30 + ySpacing);                     // tells "g" to draw a string with the value of the String variable "wordInput" (/null) @ x (30), y (30 + ySapcing)
            ySpacing = ySpacing + fontSize;
        }
    }
}


// RainGUI.java    Simon Jones (based on original by Kenneth J. Turner)

import java.awt.*;                              // include widget handling
import java.awt.event.*;                        // include event handling
import javax.swing.*;                           // include Swing handling

/**
Final GUI class to support the rainfall program. Maintain total
of rainfall for days numbered 0 (Mon) to 6 (Sun).

<ul>

<li>Enter: add rainfall to total for day</li>

<li>Wettest: report day with highest rainfall</li>

<li>Driest: report day with lowest rainfall</li>

<li>Average: report average daily rainfall</li>

<li>Clear: clear all rainfall totals.</li>

</ul>

@author       Simon Jones (based on original by Kenneth J. Turner)
@version      8/11/2015
 */

public class RainGUI extends JFrame implements ActionListener {

    /** Application window name and title */
    private String windowName;

    /** Day label */
    private JLabel dayLabel;

    /** Day field */
    private JTextField dayText;

    /** Rainfall label */
    private JLabel rainLabel;

    /** Rainfall field */
    private JTextField rainText;

    /** Buttons for enter, wettest, driest, average, clear */
    private JButton enterButton, wettestButton, driestButton, averageButton,
    clearButton;
    
    /** Drawing panel for histogram */
    private JPanel panel;

    /** Rainfall total object - holds all the rainfall data */
    private Total total;

    /**
    Constructor for rainfall application. 
    Create rainfall window and set up Total object to hold the rainfall data.
     */
    public RainGUI(String windowName) {
        this.windowName = windowName;
        setTitle(windowName);
        createGUI();  // initialise window
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);           
        total = new Total();                        // create new instance rainfall totals
    }

    /**
    Initialise rainfall application and set up on-screen display.
     */

    public void createGUI() {                       // initialise application
        Container contentPane = getContentPane();   // get content pane
        contentPane.setLayout(new FlowLayout());    // set border layout
        dayLabel = new JLabel("Day (0 to 6):");     // create day label
        contentPane.add(dayLabel);                  // add day label to layout
        dayText = new JTextField(2);                // create text field for day
        contentPane.add(dayText);                   // add day text to layout
        rainLabel = new JLabel("Rain (> 0.0):");    // create rain label
        contentPane.add(rainLabel);                 // add rain label to layout
        rainText = new JTextField(5);               // create text field for rain
        contentPane.add(rainText);                  // add rain text to layout
        enterButton = new JButton("Enter");         // create enter button
        contentPane.add(enterButton);               // add enter button to layout
        enterButton.addActionListener(this);        // listen for enter button
        wettestButton = new JButton("Wettest");     // create wettest button
        contentPane.add(wettestButton);             // add wettest button to layout
        wettestButton.addActionListener(this);      // listen for wettest button
        driestButton = new JButton("Driest");       // create driest button
        contentPane.add(driestButton);              // add driest button to layout
        driestButton.addActionListener(this);       // listen for driest button
        averageButton = new JButton("Average");     // create average button
        contentPane.add(averageButton);             // add average button to layout
        averageButton.addActionListener(this);      // listen for average button
        clearButton = new JButton("Clear");         // create clear button
        contentPane.add(clearButton);               // add clear button to layout
        clearButton.addActionListener(this);        // listen for clear button
        panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g); // Important!
                paintScreen(g); // Our drawing
            }
        };                       // Create the panel for drawing on
        panel.setPreferredSize( new Dimension( Total.histWidth, Total.baseline ) );
        panel.setBackground( Color.white );
        contentPane.add(panel);
    }
    /**
    Handle button clicks to enter day and rainfall, request the wettest or
    driest day, to compute the rainfall average, or to clear all totals.

    @param event        button click event
     */
    public void actionPerformed(ActionEvent event) {
        int day;                                    // day
        float rainfall;                             // rainfall
        String status = "";             // initialise status message

        if (event.getSource () == enterButton) {      // enter button clicked?
            try {                                     // try to get day and rainfall
                day = Integer.parseInt(dayText.getText());                
                rainfall = Float.parseFloat(rainText.getText());                
                if (total.addRain(day, rainfall))       // rain added?
                    status = "Rainfall added";          // note rain added
                else                                    // entry not added
                    status = "Day/rainfall is out of range"; // note rain incorrect
            }
            catch (NumberFormatException exception) {   // handle invalid day/rainfall
                status = "Day/rainfall format is wrong";// note day/rainfall incorrect
            }
            repaint();                                  // redraw window 
        }
        else if (event.getSource() == wettestButton) { // wettest button clicked?
            day = total.wettestDay();                 // find and dsiplay wettest day
            status =  "Wettest day is " + day + " with " + total.getRain(day) + " mm";
        }
        else if (event.getSource() == driestButton) { // driest button clicked?
            day = total.driestDay();                  // find and display driest day
            status =  "Driest day is " + day + " with " + total.getRain(day) + " mm";
        }
        else if (event.getSource() == averageButton) { // average button clicked?
            rainfall = total.averageRain();            // get average rainfall
            status = "Average daily rainfall is " + rainfall + " mm";            
        }
        else if (event.getSource() == clearButton) {  // clear button clicked?
            total.zeroTotals();                       // zero all totals
            status = "Totals cleared";                // note totals cleared
            repaint();                                  // redraw window 
        }
        setTitle(windowName + ": " + status);       // set window title with status            
    }


    /**
    Draw application objects on-screen.

    @param g            graphics object
     */
    public void paintScreen(Graphics g) {           // draw graphics
        total.showTotals(g);                        // display histogram of totals
    }

}

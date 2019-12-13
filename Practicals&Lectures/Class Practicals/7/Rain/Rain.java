// Rain.java    Simon Jones (based on original by Kenneth J. Turner)

/**
Final version of main class to support the rainfall program. Maintain total
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

public class Rain {

    /**
    Create rainfall application.

    @param args         command-line arguments (not used)
     */
    public static void main(String[] args) {
        RainGUI appWindow = new RainGUI("Rain");	// create rainfall window
        appWindow.pack();                           // pack widgets into window and set its size
        //appWindow.setSize(700, 250);		        // alternatively: adjust size of window
        appWindow.setLocation(100,200);             // adjust window position on screen
        appWindow.setVisible(true);                 // make window visible
    }

}

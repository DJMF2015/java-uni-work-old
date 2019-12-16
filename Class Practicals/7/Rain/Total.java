// Total.java   Simon Jones (based on original by Kenneth J. Turner)

import java.awt.*;                              // include window handling for graphics drawing

/**
Incomplete version of supplementary class to support the rainfall program by
maintaining rainfall totals.

@author       Simon Jones (based on original by Kenneth J. Turner)
@version      8/11/2015
 */

public class Total {                            // rainfall totals

    /** Histogram overall chart width */
    public final static int histWidth = 300;

    /** Histogram column base-line */
    public final static int baseline = 150;

    /** Histogram column height */
    private final static int height = 120;

    /** Histogram column width */
    private final static int width = 20;

    /** Number of days */
    private final int days = 7;

    /** Rainfall totals */
    private float rain[] = new float[days];

    /** Constructor for rainfall total. */
    public Total() {                                 // rainfall total constructor
        zeroTotals();                               // initialise rainfall totals
    }

    /**
    Add rainfall for specific day into array <var>rain</var>.

    @param day          day to be updated
    @param rainfall     rainfall in mm
    @return             true if day and rainfall valid
     */
    public boolean addRain(int day, float rainfall) {
        if ( day>=0  && day<days && rainfall>0){//boolean to check day range value 0-7
            rain[day] += rainfall;                      // add to rainfall for day
            return true ;
        }
        else  return false; 
    }

    // report rain added successfully
    /**
    Compute average rainfall from array <var>rain</var>.

    @return             average rainfall in mm
     */
    public float averageRain() {
        int d;                                      // day
        float total = 0.0f;                         // initialise total
        for (d = 0; d<days; d++){
            total = rain[d]+total;
        }
        return total / days ;                       // return average rainfall

    }

    /**
    Compute the driest day in array <var>rain</var>. If there are several
    candidates, chooser the later day.

    @return             day number of driest day
     */
    public int driestDay() {
        int d;                                      // day
        int driest = 0;                             // assume first day is driest
        for (d=0;d < days; d++)    //iterates through days by one to total number of days(6)
            if (rain [d] < rain[driest])  //rain array index records day of week & if less than driest day of that week..
                driest = d; // driest day(index) becomes d(day of week)
        return driest ;                             // return lowest rainfall day of week from array
    }

    /**
    Get rainfall for day from array <var>rain</var>.

    @param day          day to be checked
    @return             rainfall in mm
     */
    public float getRain(int day) {
        return rain[day] ;                          // return rainfall
    }

    /**
    Show rainfall totals from array <var>rain</var> in histogram form. The
    constants <var>baseline</var>, <var>height</var> and <var>width</var>
    define the layout of the histogram.

    @param g            graphics object
     */
    public void showTotals(Graphics g) {
        int d;                                      // day
        int x, y;                                   // column horiz/vert position
        int actualHeight;                           // column actual height
        float highest = rain[wettestDay()];         // get highest rainfall
        float rainfall;                             // rainfall for day

        for (d = 0; d < days; d++) {                // go through all days
            x = (2 * d + 1) * width;                  // set horizontal coordinate
            g.drawString(Integer.toString(d), x + 7, baseline + width); // show day number
            if (highest > 0.0f)                       // non-zero highest rainfall?
                actualHeight = (int) (height * rain[d] / highest); // set actual height as integer              
            else                                      // zero highest rainfall
                actualHeight = 0;                     // set default height 0
            if (actualHeight == 0)                    // actual height zero?
                actualHeight = 2;                     // set it to small value
            y = baseline - actualHeight;              // set vertical coordinate
            g.fillRect(x, y, width, actualHeight);    // draw histogram column
            rainfall = Math.round(rain[d] * 10.0f) / 10.0f;   // get rainfall to 1 dec. place            
            g.drawString(Float.toString(rainfall), x, baseline - actualHeight - width / 2);  // draw rainfall at top of column            
        }
    }

    /**
    Compute the wettest day in array <var>rain</var>. If there are several
    candidates, chooser the later day.

    @return             day number of driest day
     */
    public int wettestDay() {                     // return highest rainfall day
        int d;                                      // day
        int wettest = 0;                            // assume first day is wettest
        for (d = 0; d < days; d++)                  // go up through days
            if (rain[d] >= rain[wettest])           // current day is wetter?
                wettest = d;                        // set new highest rainfall day
        return wettest ;                            // return highest rainfall day
    }

    /**
    Zeroise all rainfall totals in array <var>rain</var>.
     */
    public void zeroTotals() {                    // set rainfall totals to zero
        int d;
        for (d = 0; d<days; d++)
            rain[d] = 0;

    }
}


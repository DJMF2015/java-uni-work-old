// A simple program that draws a circle, initially 20 pixels in diameter
// There are two buttons: one increases the circle's diameter by 10 pixels
// and the other decreases it by 10 pixels.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SmallerAndLarger extends JFrame
        implements ActionListener {

    private JButton smaller, larger, reset, black, red, green;

    /*7. Add buttons “Fill” and “Outline” which cause the value of the variable filled to be changed appropriately.*/
    private JButton fill, outline;

    private JPanel panel;
    private Color circleColor = Color.black;

    /*6. Add a global boolean variable, initially false: eg*/
    private boolean filled = false;

    // A global variable: it needs to be persistent
    private int diameter = 20;

    public static void main(String[] args) {

        SmallerAndLarger demo = new SmallerAndLarger();
        demo.setSize(350,400);
        demo.createGUI();
        demo.setVisible(true);
        System.out.println("demo.createGUI()");

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        smaller = new JButton("Smaller");
        smaller.addActionListener(this);
        window.add(smaller);

        larger = new JButton("Larger");
        larger.addActionListener(this);
        window.add(larger);

        reset = new JButton("reset");
        reset.addActionListener(this);
        window.add(reset);


        black = new JButton("Black");
        black.addActionListener(this);
        window.add(black);

        green = new JButton("Green");
        green.addActionListener(this);
        window.add(green);


        red = new JButton("Red");
        red.addActionListener(this);
        window.add(red);

        /*7. Add buttons “Fill” and “Outline” which cause the value of the variable filled to be changed appropriately.*/
        fill = new JButton("Fill");
        fill.addActionListener(this);
        window.add(fill);

        outline = new JButton("OutLine");
        outline.addActionListener(this);
        window.add(outline);


        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.white);
        window.add(panel);

    }

    public void actionPerformed(ActionEvent event) {

        Graphics g = panel.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, 250, 250);

        // First handle the button presses
        if (event.getSource() == smaller)
            diameter = diameter - 10;

        if (event.getSource() == larger)
            diameter = diameter + 10;

        if (event.getSource() == reset)
            diameter = 20;
            circleColor=Color.black;
            filled = false;

        if (event.getSource()== red)
            circleColor=Color.red;

        if (event.getSource()== green)
            circleColor=Color.green;

        if (event.getSource()==black)
            circleColor=Color.black;

        //7. Fill the Oval
        if (event.getSource()==fill){
            filled = true;

        }

        //7. Outline the Oval
        else if (event.getSource()==outline){
            filled = false;

        }
        // Now update the screen
        paintScreen(g);
    }


    private void paintScreen(Graphics g ) {

        g.setColor(circleColor);
        g.drawOval(25, 25, diameter, diameter);

        /*7. Buttons “Fill” and “Outline” which cause the value of the variable filled to be changed appropriately.*/
        if (filled){
            g.fillOval(25, 25, diameter, diameter);
          //  filled = true;
       
        }
        else{
            g.drawOval(25, 25, diameter, diameter);
           // filled = false;

        }
    }

}


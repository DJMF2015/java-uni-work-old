// Dice throws program: offers the user two sliders (range 1-6),
// and displays the current selected values, their total
// and whether it is a winning throw (when total is 6).

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Dice extends JFrame implements ChangeListener {

    private JSlider slider1, slider2, slider3;
    private JPanel panel;

    public static void main(String[] args) {

        Dice demo = new Dice();
        demo.setSize(350,350);
        demo.createGUI();
        demo.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        slider1 = new JSlider(1, 6, 3);
        slider1.addChangeListener(this);
        window.add(slider1);

        slider2 = new JSlider(1, 6, 3);
        slider2.addChangeListener(this);
        window.add(slider2);
        
        slider3 = new JSlider(1, 6, 4);
        slider3.addChangeListener(this);
        window.add(slider3);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 200));
        panel.setBackground(Color.white);
        window.add(panel);

    }

    public void stateChanged(ChangeEvent e) {

        Graphics g = panel.getGraphics();

        g.setColor(Color.white);
        g.fillRect(0, 0, 200, 150);

        g.setColor(Color.black);
        int value1 = slider1.getValue();
        int value2 = slider2.getValue();
        int value3 = slider3.getValue();
        int total = value1+value2+value3;
        
        g.drawString("Total is "+total, 50, 80);

        if (total==6 || total==12 || total==18){
            g.drawString ("You have won!", 50, 100);
        }
        else if (value1==value2 && value1==value3){
            g.drawString("Congratulation! You have won!", 50, 100);
           }
           else{
               g.drawString ("You have lost!", 50, 100);
            }
  }
} 

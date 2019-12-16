import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class WindowBlind extends JFrame
    implements ChangeListener {

    private JSlider slider;
    private JSlider slider2;
    private JPanel panel;

    public static void main (String[] args) {

        WindowBlind frame = new WindowBlind();
        frame.setSize(700,600);
        frame.createGUI();
        frame.setVisible(true);
    
    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );

        slider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        slider2 = new JSlider(JSlider.VERTICAL,0,100,50);
        window.add(slider);
        window.add(slider2);
        slider.addChangeListener(this);
        slider2.addChangeListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 600));
        panel.setBackground(Color.white);
        window.add(panel);
 
       
    }
       public void stateChanged(ChangeEvent e) {
        Graphics paper = panel.getGraphics();
        int sliderValue = slider.getValue();
        int level = slider2.getValue();
        drawWindow (paper, Color.red, 120, 80, sliderValue);
        drawWindow (paper, Color.red, 250,80, level);
          // First erase the drawing on the paper
     
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 400, 400);

        // Now draw the frame and the blind
        paper.setColor(Color.black);
        paper.drawRect(120, 80, 60, 100);
        paper.setColor(Color.green);
        paper.fillRect(120, 80, 60, sliderValue);
        
        paper.setColor(Color.black);
        paper.drawRect(200, 80, 60, 100);
        paper.setColor(Color.blue);
        paper.fillRect(200, 80, 60, level);
        System.out.println("Entering stateChanged method");
    } 
        private void drawWindow (Graphics paper, Color c, int x, int y, int sliderValue){
            
        paper.setColor(Color.black);
        paper.drawRect(x, y, 60, 100);
        paper.setColor(Color.green);
        paper.fillRect(x, y, 60, sliderValue);
            
        paper.setColor(Color.black);
        paper.drawRect(x, y, 60, 100);
        paper.setColor(Color.blue);
        paper.fillRect(x, y, 60,sliderValue);
        System.out.println("Returning from stateChanged method");
    }

    
}

    






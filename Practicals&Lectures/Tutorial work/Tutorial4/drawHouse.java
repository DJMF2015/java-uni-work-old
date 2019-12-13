import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class drawHouse extends JFrame
implements ChangeListener {

    private JLabel sliderLabel;
    private JSlider slider;    
    private JPanel panel;
    private int houses;
    public static void main (String[] args) {
        drawHouse frame = new drawHouse();
        frame.setSize(1000,1000);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );

        sliderLabel = new JLabel("Drag to adjust: ");
        window.add(sliderLabel);

        slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        window.add(slider);
        slider.addChangeListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 800));
        panel.setBackground(Color.white);
        window.add(panel);
    }

    public void stateChanged(ChangeEvent e) {
        Graphics paper = panel.getGraphics();
        int sliderValue = slider.getValue();
        
        paper.setColor(Color.white);
        paper.fillRect(0,0,600,600);
        paper.setColor(Color.black);
        int houses;
        int width = 100;
        int height = 150;
        int x, y;
        y = 20;
        houses = slider.getValue();
        for (int house = 1;house<=houses; house++){
            x = 15;
        
            paper.drawRect(x, y,width,height);
             
                paper.drawLine(x, yPlace,
                    x, yPlace + height);
                paper.drawLine(x, yPlace + height,
                    x + width, yPlace + height);
                paper.drawLine(x, yPlace,x + width,
                    yPlace + height);
                    x = x+15;
                  //houses++;
                }
        
            }
        }
              
   

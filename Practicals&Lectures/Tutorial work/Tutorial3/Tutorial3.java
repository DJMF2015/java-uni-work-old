import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tutorial3 extends JFrame implements ActionListener {

    private JTextField start, end, outcome, number; //text fields
    private JButton button;
    private JPanel panel;
  
    public static void main(String[] args) {
        Tutorial3 frame = new Tutorial3 ();
        frame.setSize(300,300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension (200,250));
        panel.setBackground(Color.white);
        window.add(panel);
        
        window.add(new JLabel("Please enter a whole number"));
        number = new JTextField(10);
        window.add(number);
        
        
        button = new JButton("Calculate");
        window.add(button);
        button.addActionListener(this);
        
        window.add(new JLabel("Output"));
        outcome = new JTextField(20);
        window.add(outcome);
        
      
       
    }

    public void actionPerformed(ActionEvent event) {
         Graphics g = panel.getGraphics();
         g.setColor(Color.white);
         g.fillRect(0,0,200,250);
         int num = Integer.parseInt(number.getText());//local var stres temp int from global number
      
         if (num ==0)
        {
         g.setColor(Color.black);
         g.drawString("number is zero", 50, 50);
         g.setColor(Color.black);
         outcome.setText("number is zero");
        }
         else if (num <0)
        {
         g.setColor(Color.black);  
         g.drawString("number is negative", 50, 50);
          outcome.setText("number is negative");
      }
         else if (num >0)
         {
          g.setColor(Color.black);
          g.drawString("number is positive", 50, 50);
           outcome.setText("number is positive");
          }    
      //  else 
        {
     //   g.setColor(Color.black);
     //   g.drawString("Error: Please enter an integer!", 50, 70);
    }
        }                                   
     
    } 
  
  

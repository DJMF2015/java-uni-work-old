import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GradientsPaint extends JPanel {

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gp1 = new GradientPaint(5, 5, Color.blue, 20, 20, Color.green, true);

        g2d.setPaint(gp1);
        g2d.fillRect(20, 20, 300, 250);
        g2d.setColor(Color.red);
        g2d.drawString("Here is the sun", 110,130);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("GradientsRedYellow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GradientsPaint());
        frame.setSize(350, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // public class boilingPoint
    
        
            double temp;
            double alt = 0;
            Scanner scan = new Scanner(System.in);

            System.out.println ("What's the current altitude?");
            alt = scan.nextFloat();
            System.out.println("Altitude is " + alt + "metres");

            alt = 0.0333*alt;//computes temperature drop of 1 celsius for 300m
            System.out.println ("What's the current temperature?");
            temp = scan.nextInt();
            System.out.println("Temperature is " + temp + "degrees celsius");

            temp = temp-alt;//subtracts altitude drop in temp from curent temp

            if (temp > 1 || temp <= 100) 
                System.out.println ("water is liquid");
           
            // end if
            if (temp >=100){

                System.out.println ("water is gas");
          
            }    //end if
            if (temp <=0){
                System.out.println ("water is solid/ice");

                System.out.println ("end");
           

                //end if
            }
        }
    }

        

    


       

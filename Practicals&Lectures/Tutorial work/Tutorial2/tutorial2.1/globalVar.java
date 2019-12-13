import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

  
/**
/**
 * Write a description of class globalVar here.
 *

 */
public class globalVar extends JFrame
         implements ActionListener {

    private JButton button;

   
    private JPanel panel;  
    
    
   public static void main( String[] args ) {
  
   globalVar frame = new globalVar ();
        frame.setSize( 500, 400 );
        frame.createGUI();
        frame.setVisible( true );
    } // End of main

    /**
     *  The createGUI method is called by the main method
     *  to set up the graphical user interface.
     */
    private void createGUI() {
        // Set up main window characteristics
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container window = getContentPane();
        window.setLayout( new FlowLayout() );

        // Create the panel for drawing on
        panel = new JPanel();
        panel.setPreferredSize( new Dimension( 400, 300 ) );
        panel.setBackground( Color.white );
        window.add( panel );

        // Create the button for clicking
        button = new JButton( "Press me" );
        window.add( button );
        button.addActionListener( this );
    } // End of createGUI
    
    public void actionPerformed(ActionEvent event){
        Graphics paper = panel.getGraphics();
        i=0;
        r(paper);
        s(paper);
        r(paper);
    }
    
    private int i;
    
    private void r(Graphics g){
        Graphics paper = panel.getGraphics();
        i++;
        g.drawString("*",20,10*i);
    }
    
    private void s(Graphics g){
    Graphics paper = panel.getGraphics();
    r(g);
    i++;
    g.drawString("**",20,10*i);
    r(g);
     }
   
   }

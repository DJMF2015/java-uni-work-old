package Rectangle2D;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JFrame;

public class MyCanvas extends Canvas { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static void main(String[] args) { 
JFrame frame = new JFrame(); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Canvas canvas = new MyCanvas(); 
canvas.setSize(400, 400); 
frame.getContentPane().add(canvas); 
frame.pack(); 
frame.setVisible(true); 
} public void paint(Graphics g) { 
g.setColor(Color.black);
g.fillOval(100, 100, 200, 200);
g.fillOval(100, 70, 90, 80);
g.fillOval(220, 70, 90, 80);
g.setColor(Color.white);
g.fillOval(125, 150, 40, 40);
g.fillOval(225, 150, 40, 40);
g.setColor(Color.red);
g.fillOval(175, 180, 40, 40);
g.fillArc(125, 225, 180, 20, 180, 90);
g.fillArc(200, 235, 80, 10, 90, 225);




}
}


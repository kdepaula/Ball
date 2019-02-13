import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent
{
	private Ellipse2D.Double ball;
	//you inherit x and y fields from JComponent
	
	public Ball()
	{
		ball = new Ellipse2D.Double(20, 20, 10, 10);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		//do not use both draw and fill, use one or the other
		g2.draw(ball);
	}
}

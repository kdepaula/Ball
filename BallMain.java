import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class BallMain {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(100, 100, 600, 600);
		myFrame.setLayout(null);
		
		Ball myBall = new Ball();
		myBall.setLocation(250, 50);
		myFrame.add(myBall);
		
		Timer t1 = new Timer(100, new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					myBall.setLocation((int) myBall.getX() + 1, (int) myBall.getY() + 1);
					myFrame.repaint();
					//every time you move things you need to do this.
				}
			});
		t1.start();
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

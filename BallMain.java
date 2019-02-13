import javax.swing.JFrame;

public class BallMain {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(100, 100, 600, 600);
		Ball myBall = new Ball();
		myBall.setBounds(20, 40, 60, 60);
		myFrame.add(myBall);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

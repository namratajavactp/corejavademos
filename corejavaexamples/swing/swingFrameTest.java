import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingFrameTest 
{
	public static void main(String[] args) 
	{
		swingFrame sf=new swingFrame();
		sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sf.setVisible(true);
	}

}

class swingFrame extends JFrame
{
	swingFrame()
	{
		//get screen dimensions

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		//center frame in screen

		setSize(screenWidth/2, screenHeight/2);
		setLocation(screenWidth/4,screenHeight/4);

		//set frame icon and title
		Image img = toolkit.getImage("z:/dist4.gif");
		setIconImage(img);
		setTitle("CenteredFrame");
	//	setExtendedState(Frame.ICONIFIED);
	}


}

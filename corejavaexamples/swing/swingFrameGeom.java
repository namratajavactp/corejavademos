import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
public class swingFrameGeom 
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

	    showPanel p=new showPanel();
		add(p);
	}

	

}


class showPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2=new (Graphics2D)g;

		//draw a rectangle
		double leftx = 100;
		double topy=100;
		double width=200;
		double height=150;

		Rectangle2D rect=new Rectangle2D.Double(leftx,topy,width,height);
		g2.draw(rect);
	}

}

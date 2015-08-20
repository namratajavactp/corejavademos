import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
public class Controller extends Applet implements ActionListener

{
	Button b = null;
	public void init()
	{
		b= new Button("Click");
		b.addActionListener(this);
		add(b);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Applet app = this.getAppletContext().getApplet("controlled");
		Controlled con = (Controlled)app;
		Random r = new Random();
		int red =  r.nextInt(255);
		int green = r.nextInt(255);
		int blue = r.nextInt(255);
		con.setBackground(red,green,blue);

	}
}

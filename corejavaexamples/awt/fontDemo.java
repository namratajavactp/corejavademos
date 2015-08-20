import java.awt.*;
import java.awt.event.*;

class fontDemo extends Frame
{
	fontDemo(String name)
	{
		super(name);
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false); System.exit(0); }});
	}

	public void paint(Graphics g)
	{
		Font f=new Font("TimesRoman",Font.BOLD,14);
		g.setFont(f);
		g.setColor(Color.red);
		setBackground(Color.blue);
		g.drawString("Hello Java",30,100);
	}
	    

	public static void main(String[] args) 
	{
		fontDemo fd=new fontDemo("Font Demo");
	
	}
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<APPLET
CODE = ColorChooser.class
WIDTH = 200
HEIGHT = 200 >
</APPLET>
*/
public class ColorChooser extends JApplet implements ActionListener
{
JPanel jpanel = new JPanel();
JButton jbutton;
public void init()
{
jbutton = new JButton("Click here to change colors.");
jbutton.addActionListener(this);
jpanel.add(jbutton);
getContentPane().add(jpanel);
}
public void actionPerformed(ActionEvent e)
{
	try
	{
		Thread.sleep(7000);
	}
	catch(Exception ee)
	{
		ee.printStackTrace();

	}
Color color = JColorChooser.showDialog(null,
"Select a new color...", Color.white);
jpanel.setBackground(color);
}
}

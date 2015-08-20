import java.awt.*;
import java.awt.event.*;
class SampleFrame extends Frame 
{
	SampleFrame(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false); } }

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

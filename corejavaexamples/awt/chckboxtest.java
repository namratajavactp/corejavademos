import java.awt.*;
import java.awt.event.*;
class chckboxtest extends Frame implements ItemListener
{
	Checkbox a1,a2,a3;
	String msg="";
    TextField text;
	chckboxtest(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		a1=new Checkbox("JAVA",true);
		a2=new Checkbox("Perl");
		a3=new Checkbox("Python");
		add(a1);
		add(a2);
		add(a3);
		a1.addItemListener(this);
		a2.addItemListener(this);
		a3.addItemListener(this);
		setSize(300,300);
		setVisible(true);
};  
public void itemStateChanged(ItemEvent e)
	{
	repaint();
}
public void paint(Graphics g)
	{
	if(a1.getState()==true)
		{
		g.drawString("JAVA: Selected",40,200);
		}
if(a2.getState()==true)
		{
		g.drawString("Perl: Selected",40,220);
		}
if(a3.getState()==true)
		{
		g.drawString("Python: Selected",40,240);
		}
	}
	public static void main(String args[])
	{
chckboxtest val=new chckboxtest("CHECK BOX");
	}
}
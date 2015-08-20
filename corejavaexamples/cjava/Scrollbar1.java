import java.awt.*;
import java.awt.event.*;
class  Scrollbar1 extends Frame 
{
	
	Scrollbar s;
	
	Scrollbar1()
	{  setLayout(null);
		s=new Scrollbar(Scrollbar.HORIZONTAL,0,30,0,300);
		s.setBounds(40,40,100,100);
		add(s);
		setVisible(true);
		setSize(300,300);

		
	}


	public static void main(String[] args) 
	{
		Scrollbar1 s = new Scrollbar1();
		//System.out.println("Hello World!");
	}
}

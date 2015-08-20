import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Jborder1 extends JApplet
{
	
    JTextArea t=new JTextArea(5,10);
	JScrollPane j=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


	public void init()
	{
        jpanel j=new jpanel();
		j.setBorder(BorderFactory.createRaisedBevelBorder());
	    add(j);
	}

  class jpanel extends JPanel 
  {
	jpanel()
	{
		t.setLineWrap(true);
		t.setWrapStyleWord(true);
		add(t);
	}
  }
/*
 	public void paintComponent(Graphics g)
	{
		g.drawString("swing with border!",
			getBorder().getBorderInsets(this).left,50);
	}
*/


 }
 
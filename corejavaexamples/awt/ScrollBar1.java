import java.awt.*;
import java.awt.event.*;

class  ScrollBar1 extends Frame 
{

	 Scrollbar s1,s2,s3;
	 TextField r,g,b;
	 Panel p,p1;
	 String msg="";
	 String msg1="";

	ScrollBar1(String name)
	{
		super(name);
      setLayout(null);
	//	setLayout(new FlowLayout());
		
		
		r=new TextField(5);
		g=new TextField(5);
		b=new TextField(5);

		s1=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		s2=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		s3=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);

		 p=new classPanel();
		 p1=new classPanell();

		add(p);
	    add(p1);

		
		
		
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){ setVisible(false);}});
		setSize(500,300);
		setVisible(true);

	}


	

class classPanel extends Panel
{
    classPanel()
	{
		setBounds(10,40,100,100);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
		g.drawString(msg,30,200);
		g.drawString(msg1,30,240);

	}
}

class classPanell extends Panel implements AdjustmentListener
{
    classPanell()
	{

		setBounds(120,40,250,250);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		add(s1); add(r);
		add(s2); add(g);
		add(s3); add(b);
	

	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{  
		if((ae.getValueIsAdjusting()==true)&&(ae.getAdjustable()==s1))
		{ 
		    msg="Value of r is adjusting";
     	  	r.setText(Integer.toString(ae.getValue()));
		    p.repaint();
			setTitle(msg);
		}
		if((ae.getValueIsAdjusting()==true)&&(ae.getAdjustable()==s2))
		{ 
		    msg="Value of g is adjusting";
		  	g.setText(Integer.toString(ae.getValue()));
		    p.repaint();
			setTitle(msg);
		}
		if((ae.getValueIsAdjusting()==true)&&(ae.getAdjustable()==s3))
		{ 
		    msg="Value of b is adjusting";
		  	b.setText(Integer.toString(ae.getValue()));
		    p.repaint();
			setTitle(msg);
		}

        if(ae.getAdjustmentType()==AdjustmentEvent.UNIT_INCREMENT)
		{
			msg1="unit increment";
			p.repaint();
			setTitle(msg1);
		}
		if(ae.getAdjustmentType()==AdjustmentEvent.UNIT_DECREMENT)
		{
			msg1=" unit decremnt";
			p.repaint();
			setTitle(msg1);
		}
		if(ae.getAdjustmentType()==AdjustmentEvent.BLOCK_DECREMENT)
		{
			msg1=" block decrement";
			p.repaint();
			setTitle(msg1);
		}
		if(ae.getAdjustmentType()==AdjustmentEvent.BLOCK_INCREMENT)
		{
			msg1=" block increment";
			p.repaint();
			setTitle(msg1);
		}
		if(ae.getAdjustmentType()==AdjustmentEvent.TRACK)
		{
			msg1=" tracking";
			p.repaint();
			setTitle(msg1);
		}



           
        if(s1==ae.getAdjustable())
			r.setText(Integer.toString(ae.getValue()));
		if(s2==ae.getAdjustable())
			g.setText(Integer.toString(ae.getValue()));
		if(s3==ae.getAdjustable())
			b.setText(Integer.toString(ae.getValue()));
		//repaint();

		
	}

	
}

	public static void main(String[] args) 
	{
		ScrollBar1 sb=new ScrollBar1("ScrollBar Demo");

	}
}



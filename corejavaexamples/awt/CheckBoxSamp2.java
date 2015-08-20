import java.awt.*;
import java.awt.event.*;
class CheckBoxSamp2 extends Frame implements ItemListener 
{
	Checkbox c1,c2,c3;
	String msg="";
	TextField t;
	CheckBoxSamp2(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		c1=new Checkbox("C",true);
		c2=new Checkbox("C++");
		c3=new Checkbox("Java");
		add(c1);
		add(c2);
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
//		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we){setVisible(false);}});
		setSize(300,300);
		setVisible(true);
	}
   
    public void itemStateChanged(ItemEvent ie)
	{ 
		
		repaint();
	}

     public void paint(Graphics g)
	{
		super.paint(g);
	  /* g.drawString("C    :"+(c1.getState()?"Selected":"NotSelected"),40,200);
		 g.drawString("C++  :"+(c2.getState()?"Selected":"NotSelected"),40,230);
 		 g.drawString("java :"+(c3.getState()?"Selected":"NotSelected"),40,250); */
		 
		
		 if(c1.getState()==true)
			 g.drawString("C   : Selected",40,200);
		 if(c2.getState()==true)
			 g.drawString("C++ : Selected",40,220);
		 if(c3.getState()==true)
			 g.drawString("JAVA: Selected",40,240);
			

	}

	public static void main(String[] args) 
	{
		CheckBoxSamp2 chk=new CheckBoxSamp2("ChekBoxExample1 with ItemListener");
	}
}

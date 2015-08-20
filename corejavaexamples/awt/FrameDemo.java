
import java.awt.*;
import java.awt.event.*;
class SampleFrame extends Frame implements ItemListener
{
	Checkbox fo,fr;
	CheckboxGroup cg=new CheckboxGroup();
	List Lfl,Lfr;
	Panel fruits,flowers,Select,Collections;
	CardLayout cl;

	SampleFrame(String title)
	{
		super(title);
				
		fruits = new Panel();
		flowers = new Panel();
        
		fo=new Checkbox("Flower",cg,true);
		fo.addItemListener(this);
		fr=new Checkbox("Fruit",cg,false);
		fr.addItemListener(this);

		Select=new Panel();
		Select.setBackground(Color.PINK);
		Select.add(fo);
		Select.add(fr);

		Lfl=new List(3,false);
		Lfl.add("Rose");
		Lfl.add("Lily");
		Lfl.add("Jasmin");

		Lfr=new List(3,false);
		Lfr.add("Apple");
		Lfr.add("Orange");
		Lfr.add("Mango");

		flowers.add(Lfl);
		fruits.add(Lfr);
		
		cl=new CardLayout();
		Collections =new Panel();
		Collections.setBackground(Color.RED);
		Collections.setLayout(cl);
		Collections.add("Flowers",flowers);
		Collections.add("Fruits",fruits);

		add(Select);
		add(Collections);

		setLayout(new GridLayout(1,2,40,40));
        pack();
        setVisible(true);



		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false); dispose(); System.exit(0);} });
		
	}
	
	/*
	public void paint(Graphics g)
	{
		Font f1=g.getFont();
		String fontName=f1.getName();
		String fontFamily=f1.getFamily();
		int fontSize=f1.getSize();
		int fontStyle=f1.getStyle();
		 msg="FontName="+fontName+" fontFamily="+fontFamily+" ,fontSize="+fontSize+" ,fontStyle=";
		 if((fontStyle & Font.BOLD)== Font.BOLD)
			 msg+=" Bold";
		 else if((fontStyle & Font.ITALIC)== Font.ITALIC)
			 msg+=" Italic";
		 else if((fontStyle & Font.PLAIN)==Font.PLAIN)
			 msg+=" plain";


		 g.drawString(msg,10,40);
	}*/


	public void itemStateChanged(ItemEvent e)
	{try
		{
		if(cg.getSelectedCheckbox()==fo)
		{
			Thread.sleep(5000);
		cl.show(Collections,"Flowers");
		}
		else if (cg.getSelectedCheckbox()==fr)
		{
			Thread.sleep(5000);
		cl.show(Collections,"Fruits");
		}
		}catch(Exception ee){}
	}
}

class FrameDemo
{

	public static void main(String[] args)throws Exception 
	{
		SampleFrame samp=new SampleFrame("namrata Frame");

	}
}

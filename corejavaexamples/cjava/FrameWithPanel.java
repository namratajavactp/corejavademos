
import java.awt.*;
import java.awt.event.*;

class FrameWithPanel extends Frame implements ItemListener
{  CheckboxGroup cg,cg1; 
	Checkbox a1,a2,a3;
	Checkbox a11,a22,a33;
	TextField tf;

	Panel p,p1,p2;
	
	FrameWithPanel(String title)
	{   super(title);
		
		 p=new Panel();
		cg=new CheckboxGroup();
		a1=new Checkbox("C",cg,true);
		a2=new Checkbox("C++",cg,false);
		a3=new Checkbox("Java",cg,false);
		p.add(a1);
		p.add(a2);
		p.add(a3);

		 p1=new Panel();
		cg1=new CheckboxGroup();
		a11=new Checkbox("Morning",cg1,true);
		a22=new Checkbox("AfterNoon",cg1,false);
		a33=new Checkbox("Evening",cg1,false);
		
		p1.add(a11);
		p1.add(a22);
		p1.add(a33);
		p2=new Panel();
		tf=new TextField(70);
		p2.add(tf);
		a11.addItemListener(this);
		a22.addItemListener(this);
		a33.addItemListener(this);
		a1.addItemListener(this);
		a2.addItemListener(this);
		a3.addItemListener(this);
		//setLayout(new FlowLayout());
		add(p,"East");
		add(p1,"Center");
		add(p2,"South");

		setVisible(true);
		pack();


	}

	public void itemStateChanged(ItemEvent ie)
	{ 
		Checkbox cx=cg.getSelectedCheckbox();
		Checkbox cx1=cg1.getSelectedCheckbox();
		tf.setText(cx.getLabel()+" Selected  "+cx1.getLabel()+" selected");
			System.out.println(cx.getLabel()+" Selected  "+cx1.getLabel()+" selected");
	}

	
	public static void main(String[] args) 
	{FrameWithPanel fp=new FrameWithPanel("Example of grouping using panel");
	  
		
	}
}

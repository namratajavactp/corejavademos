import java.awt.*;
import java.awt.event.*;

class  TextFieldDemo extends Frame implements ItemListener//,ActionListener 
{
	 Checkbox c1,c2;
	 CheckboxGroup cg;

	 Label l;
	 TextField name,greet;

	 
	TextFieldDemo(String name1)
	{
		super(name1);
		setLayout(new FlowLayout());
		l=new Label("Name:");

        cg=new CheckboxGroup();

		name=new TextField(20);
		greet=new TextField(25);


		c1=new Checkbox("M",cg,false);
		c2=new Checkbox("F",cg,false);

		greet.setEditable(false);

		add(l);
		add(name);
		add(c1);
		add(c2);
		add(greet);

		c1.addItemListener(this);
		c2.addItemListener(this);

		
		addWindowListener(new Wa());
		setSize(300,300);
		setVisible(true);

	}


	public void itemStateChanged(ItemEvent ae)
	{  
		String s=name.getText();
		if(ae.getItemSelectable()==c1)
		{
			String s1="Hello Mr "+s;
			greet.setText(s1);
		}
		if(ae.getItemSelectable()==c2)
		{
			String s2="Hello Ms " +s;
			greet.setText(s2);
		}
	}





	
	
	
	public static void main(String[] args) 
	{
		TextFieldDemo td=new TextFieldDemo("TextField Demo");

	}



	class Wa extends WindowAdapter
	{
			
			
		public void windowClosing(WindowEvent we)
		{
			setVisible(false); 
			System.exit(0);
		}
   }

}




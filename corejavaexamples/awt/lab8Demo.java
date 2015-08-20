import java.awt.*;
import java.awt.event .*;

public class lab8Demo extends Frame implements ActionListener
{
	Button bl;
	TextField f4,f2,f3;

	lab8Demo(String name)
	{
		super(name);
		setLayout(new FlowLayout());
		f4=new TextField(20);
		f2=new TextField(20);
		f3=new TextField(20);
		bl=new Button("Add");
		f3.setEditable(false);

        add(f4);
		add(f2);
		add(f3);
		add(bl);
		
		bl.addActionListener(this);
		f2.addActionListener(this);
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we){setVisible(false);}});
		setSize(300,300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bl)
		{
			int i1=Integer.parseInt(f4.getText().trim());
			int i2=Integer.parseInt(f2.getText().trim());
			f3.setText(Integer.toString(i1+i2));
		}
		else if(ae.getSource()==f2)
		{
			System.out.println("f2 clicked");
			int i1=Integer.parseInt(f4.getText().trim());
			int i2=Integer.parseInt(f2.getText().trim());
			f3.setText(Integer.toString(i1+i2));
		}
		
	}

	
	  
	public static void main(String[] args) 
	{
		lab8Demo demo=new lab8Demo("Button Click Demo");
	}
}

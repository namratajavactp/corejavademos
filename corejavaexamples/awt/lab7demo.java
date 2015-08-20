import java.awt.*;
import java.awt.event .*;

public class lab7demo extends Frame implements ActionListener
{
	Button bl,b2;
	TextField fl;

	lab7demo(String name)
	{
		super(name);
		setLayout(new FlowLayout());
		fl=new TextField(20);
		bl=new Button("Ok");
		b2=new Button("Cancel");
		fl.setEditable(false);
        add(fl);
		add(bl);
		add(b2);
		bl.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we){setVisible(false); dispose(); System.exit(0);}});
	//	setSize(300,300);
		setVisible(true);
		pack();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bl)
		{
			fl.setText("Ok Button Clicked");
			//Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		//	setLocation(d.width/2,d.height/2);

		   // setCursor(Cursor.getDefaultCursor());

			setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
	
		}
		else if(ae.getSource()==b2)
		{
			fl.setText("Cancel Button Clicked");
			/*setVisible(false);
			 */

			 Toolkit tk=Toolkit.getDefaultToolkit();
			 Image img=tk.getImage("cursor.gif");
			 Cursor newCursor = tk.createCustomCursor(img,new Point(10,10),"newCursor");
		     setCursor(newCursor);
		}
		
	}

	
	  
	public static void main(String[] args) 
	{
		lab7demo demo=new lab7demo("Button Click Demo");
	//	demo.setSize(100,100);
		demo.setVisible(true);
	}
}

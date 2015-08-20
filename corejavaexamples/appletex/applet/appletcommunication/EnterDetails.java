import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class EnterDetails extends Applet implements ActionListener 
{
	Label name,address;
	TextField tName,tAddress;
	Button submit,reset;

	public void init()
	{
		name = new Label("Name");
		address = new Label("Address");
		tName = new TextField(20);
		tAddress =new TextField(20);
		submit=new Button("Submit");
		reset=new Button("Reset");
		submit.addActionListener(this);
		reset.addActionListener(this);
		setLayout(new GridLayout(3,2));
		add(name);
		add(tName);
		add(address);
		add(tAddress);
		add(submit);
		add(reset);


	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== submit)
		{
			DisplayDetails displayDetails =(DisplayDetails)this.getAppletContext().getApplet("displayDetails");
			displayDetails.setDetails("Name  "+tName.getText().trim() , "Address "+tAddress.getText().trim());
		}
		if(ae.getSource()==reset)
		{
			tName.setText("");
			tAddress.setText("");
			DisplayDetails displayDetails =(DisplayDetails)this.getAppletContext().getApplet("displayDetails");
			displayDetails.resetDetails();
		
		}
	}

}

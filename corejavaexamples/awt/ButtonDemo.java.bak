import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener,WindowListener
{TextField name;
 Button okBut;

 
   ButtonDemo(String title)
   {   super(title);
       setLayout(new FlowLayout());
	   name=new TextField("hello");
	   okBut=new Button("click me");

	   add(name);
	   add(okBut);
	   okBut.addActionListener(this);
	   addWindowListener(this);
	   setVisible(true);

   }


    public void actionPerformed(ActionEvent e)
	{
		try
		{

			Thread.sleep(5000);
		}
		catch(Exception e)
		{
		}
		name.setText("clicked");
      
	}


	public static void main(String[] args) 
	{
		ButtonDemo b=new ButtonDemo("ButtonDemo");

	}

	public void windowActivated(WindowEvent e) 
	{
	
	}

	public void windowClosed(WindowEvent e) 
	{
	
	}

	public void windowClosing(WindowEvent e) 
	{
		setVisible(false);
		System.exit(0);
	
	}

	public void windowDeactivated(WindowEvent e) 
	{
	
	}
	public void windowDeiconified(WindowEvent e) 
	{
	
	}

	public void windowIconified(WindowEvent e) 
	{
	
	}

	public void windowOpened(WindowEvent e) 
	{
	
	}

}

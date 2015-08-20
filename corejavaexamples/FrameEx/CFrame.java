import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class CFrame extends JFrame implements ActionListener
{ JButton b; 
	CFrame(String n)
	{
		super(n);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b=new JButton("OK");

		add(b);
		b.addActionListener(this);
		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{    try
		{
			Thread.sleep(5000);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		JFrame f=new JFrame("new Frame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(50,50,300,300);
		f.setVisible(true);
		 
	}

	
	public static void main(String[] args) {
      JFrame.setDefaultLookAndFeelDecorated(true);
       CFrame obj=new CFrame("CheckBoxButtonDemo");
	}
}
     

    

  


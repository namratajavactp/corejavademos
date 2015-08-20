import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * CheckBoxDemo.java is a 1.4 application that requires 16 image files
 * in the images/geek directory: 
 * geek-----.gif, geek-c---.gif, geek--g--.gif, geek---h-.gif, geek----t.gif,
 * geek-cg--.gif, ..., geek-cght.gif.
 */

public class CFrame extends JFrame
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
	{
		Frame f=new Frame("new Frame");
		f.setSize(300,300);
		f.setVisisble(true);
		 
	}

	
	public static void main(String[] args) {
      JFrame.setDefaultLookAndFeelDecorated(true);
       CFrame obj=new CFrame("CheckBoxButtonDemo");
     

    

  
}

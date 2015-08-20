import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

 public class OptionDialogTest3
 {
    public static void main(String[] args)
    {
       OptionDialogFramee frame = new OptionDialogFramee();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
 }

 class OptionDialogFramee extends JFrame
 {
	 JPanel p;
	 JButton b,b1;
    public OptionDialogFramee()
    {
       setTitle("OptionDialogTest");
       setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		   

		   
	   
	   b=new JButton("ConfirmDialog");
	   b.addActionListener(new ActionListener()
		{
		   public void actionPerformed(ActionEvent e)
		  {
       
			   JOptionPane.showConfirmDialog(
                OptionDialogFramee.this,
                new Date(), //message
                "Title",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.WARNING_MESSAGE);
		 }});

		  b1=new JButton("InputDialog");
		    b1.addActionListener(new ActionListener()
		{
		   public void actionPerformed(ActionEvent e)
		  {
       
			   JOptionPane.showInputDialog(
                OptionDialogFramee.this,
                new Date(), //message
                "Title",
               JOptionPane.WARNING_MESSAGE,
				new ImageIcon("z:\\images\\docs.gif"),
                new String[] {"hi","abc"},
				new Object[0]		
               );
		 }});

         p=new JPanel();  
		 p.add(b);
		  p.add(b1);
		 add(p);

		

	}


	public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 400;

 }
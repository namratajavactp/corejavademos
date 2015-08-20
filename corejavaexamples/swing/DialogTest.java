import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

 public class DialogTest
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
			   JDialog dialog = new AboutDialog(OptionDialogFramee.this);
				dialog.setVisible(true);

			  
		 }});

		 

         p=new JPanel();  
		 p.add(b);
		 add(p);

		

	}


	public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 400;

 }

class AboutDialog extends JDialog
{
   public AboutDialog(JFrame owner)
   {
      super(owner, "About DialogTest", true);
      add(new JLabel(
         "<html><h1><i>Core Java</i></h1><hr>By Cay Horstmann and Gary Cornell</html>"),
         BorderLayout.CENTER);

      JPanel panel = new JPanel();
      JButton ok = new JButton("Ok");

      ok.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               setVisible(false);
            }
         });

      panel.add(ok);
      add(panel, BorderLayout.SOUTH);

      setSize(250, 150);
   }
}



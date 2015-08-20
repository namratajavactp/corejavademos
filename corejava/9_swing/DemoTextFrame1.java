import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DemoTextFrame1 
{
	public static void main(String[] args) 
	{
		 TextFrame tf=new TextFrame("TextDemo");
		 tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 tf.setVisible(true);
 
	}
}

class TextFrame extends JFrame
{
	TextFrame(String title)
	{
		super(title);
		TextPanel tf=new TextPanel();
		add(tf);
		pack();
	}
}



class TextPanel extends JPanel 
{
   JTextField t1;
   JTextField t2;
   JTextField t3;
   JButton b;

   TextPanel()
	{
	   t1=new JTextField(20);
	   t2=new JTextField(20);
	   t3=new JTextField(20);
	   t3.setEditable(false);
	   b=new JButton("ok");

	   add(t1);
	   add(t2);
	   add(t3);
	   add(b);

	   b.addActionListener(new ActionListener()	{

		   						public void actionPerformed(ActionEvent e)
								{
									int a,b,c;
									a=Integer.parseInt(t1.getText());
									b=Integer.parseInt(t2.getText());
									t3.setText((Integer.toString(a+b)));
								}
								});  



	}



	}


	





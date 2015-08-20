import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DemoTextFramePassword 
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



class TextPanel extends JPanel implements ActionListener
{
   JTextField userName;
   JTextField passwordval;
   JPasswordField password;
   JLabel l1;
   JLabel l2;
   JLabel l3;
   JButton b;

   TextPanel()
	{
	   userName=new JTextField(20);
	   password=new JPasswordField(20);
	   password.setEchoChar('*');
	 //  passwordval=new JTextField(20);
	 //  passwordval.setEditable(false);

	   l1=new JLabel("UserName");
	   l2=new JLabel("Password");
	   l3=new JLabel("Password Value");

	   b=new JButton("ok");

	   add(l1);
	   add(userName);
	   add(l2);
	   add(password);
	   add(b);
	   add(l3);
	//   add(passwordval);

	   b.addActionListener(this);  
	}

	public void actionPerformed(ActionEvent e)
	{
		char[] arr=password.getPassword();
		l3.setText(new String(arr));
		
			System.out.println(arr);
	}


	}


	





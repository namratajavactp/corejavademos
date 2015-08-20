import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class ButtonDemoo 
{
	public static void main(String[] args) 
	{
        ButtonFrame bf=new ButtonFrame("Button Demo");
		bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bf.setVisible(true);
	}
}

class ButtonFrame extends JFrame
{
	
	CPanel cp;
    
	ButtonFrame(String title)
	{
		super(title);
		cp=new CPanel();
		add(cp);
		pack();
		
	}

	

	
}


class CPanel extends JPanel implements ActionListener
{
	JButton b;
	JButton b1;
	boolean flag=false;

	CPanel()
	{
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("z:/cuisine.jpg");
        b=new JButton("ok");
		b.setActionCommand("ok");
		b1=new JButton("cancel");
		b1.setActionCommand("cancel");

		b.addActionListener(this);
		b1.addActionListener(this);

		add(b);
		add(b1);
	}

	public void actionPerformed(ActionEvent ae)
	{
		flag=true;
		if(ae.getActionCommand().equals("ok"))
			b.setEnabled(false);

		repaint();
		

	}



	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

       if(flag==true)
		setBackground(Color.PINK);


	}





};

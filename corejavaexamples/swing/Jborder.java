import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Jborder extends JApplet
{
	JRadioButton b1 =new JRadioButton("Metal"),
		b2=new JRadioButton("Motif"),
	    b3=new JRadioButton("Windows");




	public void init()
	{
        jpanel j=new jpanel();
		j.setBorder(BorderFactory.createRaisedBevelBorder());
	    add(j);
	}

  class jpanel extends JPanel implements ActionListener
  {
	jpanel()
	{
		add(new JButton("JButton"));
		add(new JTextField("nama"));
		add (new JLabel("JLabel"));
		add(new JList(new String[]
		{ "nama","nama1","nama2"}));
		add(new JRadioButton("JRadioButton"));
		add(new JCheckBox("JCheckBox"));
		add(new JScrollBar(SwingConstants.HORIZONTAL));
		
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		add(b1);add(b2);add(b3);
	}
/*
 	public void paintComponent(Graphics g)
	{
		g.drawString("swing with border!",
			getBorder().getBorderInsets(this).left,50);
	}
*/


    public void actionPerformed(ActionEvent e)
	{
		JRadioButton src=(JRadioButton)e.getSource();
		try
		{
			if(src==b1)
			UIManager.setLookAndFeel(
			"javax.swing.plaf.metal.MetalLookAndFeel");
			else if(src==b2)
			UIManager.setLookAndFeel(
			"com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			else if(src==b3)
			UIManager.setLookAndFeel(
			"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception ex)
		{
			System.out.println("Exception");
		}

		SwingUtilities.updateComponentTreeUI(getContentPane());
	}





	}//jpanel
 }
 
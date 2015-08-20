import java.awt.*;
import java.awt.event.*;
import java.awt.color.ColorSpace;

 interface Info
{
	void back(Dialog source,Color cc);
}

class colorDemo extends Frame implements ActionListener,Info
{
	Canvas c;
	Button click;
	Color col;
	MyDialog md;

    colorDemo(String Str)
	{
		super(Str);
		setLayout(new FlowLayout());
		c=new Canvas();
		click=new Button("choose color ");
		click.addActionListener(this);
		add(c);
		add(click);
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false); System.exit(0); }});
		setSize(300,300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==click)
		{
			md=new MyDialog(this,false);
			md.show();
		}
	}

	public void back(Dialog source,Color res)
	{
		if(source instanceof MyDialog)
		{
			setBackground(res);
			//repaint();
		}
		col=res;
	}

	



	public static void main(String[] args) 
	{
		colorDemo cd=new colorDemo("color demo");
		
	}
}


class MyDialog extends Dialog implements ActionListener
	{
        Panel p;
		Color c;
		Button ok,cancel;
		final Dialog md;

		MyDialog(Frame parent,boolean mode)
		{
			super(parent,mode);
			md=this;
			
			setLayout(null);
			p=new Panel();
			ok=new Button("OK");
			cancel=new Button("Cancel");
			p.setLayout(new GridLayout(3,3,5,5));
			
			cCanvas can=null;
			
			p.add(can=new cCanvas());
			can.setSize(40,40);
			can.setBackground(Color.black);

			p.add(can=new cCanvas());
			can.setSize(40,40);
			can.setBackground(Color.red);

			p.add(can=new cCanvas());
			can.setBackground(Color.blue);
			can.setSize(40,40);
	
			p.add(can=new cCanvas());
			can.setBackground(Color.orange);
			can.setSize(40,40);
	
			p.add(can=new cCanvas());
			can.setBackground(Color.MAGENTA);
			can.setSize(40,40);
	
			p.add(can=new cCanvas());
			can.setBackground(Color.white);
			can.setSize(40,40);
	
			
			p.add(can=new cCanvas());
			can.setBackground(Color.yellow);
			can.setSize(40,40);
	
			p.add(can=new cCanvas());
			can.setBackground(Color.pink);
			can.setSize(40,40);
	
			p.add(can=new cCanvas());
			can.setBackground(Color.gray);
			can.setSize(40,40);
           
			p.setBounds(10,10,200,200);
			ok.setBounds(15,250,130,50);
			cancel.setBounds(200,250,130,50);
			
			add(p);
			add(ok);
			add(cancel);
			
			
			ok.addActionListener(this);
			cancel.addActionListener(this);
			setBounds(60,60,350,370);
		}


		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()== ok)
			{ 
				dispose();
			}
			else if(ae.getSource()==cancel)
			{
				dispose();
			}

		}

		class cCanvas extends Canvas
		{
			cCanvas()
			{
			  super();
			  addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent me) { c=((Canvas)me.getSource()).getBackground();
			  ((Info)md.getParent()).back(md,c); }});
              
			 }
		}

	}

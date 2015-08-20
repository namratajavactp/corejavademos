import java.awt.*;
import java.awt.event.*;
public class  MyFrame2 extends Frame implements Runnable
{

   int x1=10,x2=10,x3=10,y1=100,y2=200,y3=300;
	Color col=null;

    MyFrame2(String title)
	{
		super(title);
		setBackground(Color.white);
	
		setSize(600,600);
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false); } });
		setVisible(true);
		 
	}

	public void run()
	{
	
  
		for(;;)
 		{
			//System.out.println("ball1/"+Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("ball1"))
		{
		 
		  try
		  {
				
				x1=x1+10;
				synchronized(this)
			    {
					if(x1>=500)
						wait();
				}
			}
			catch(Exception e)
			{
			}
		  
		
	
		}
		if(Thread.currentThread().getName().equals("ball2"))
		{
		//  System.out.println("Ball2");
		 	  
		  try
			{
			  synchronized(this)
			  {
				if(x2>=500)
					wait();
			  }
		  
			}
			catch(Exception e)
			{
			}

		  x2=x2+5;
		
		}
	  if(Thread.currentThread().getName().equals("ball3"))
	 {
		 // System.out.println("Ball3");
		  
		 
		  try
			{
			  synchronized(this)
			  {
				if(x3>=500)
				{
				  notifyAll();
				  x1=x2=x3=0;
				}
			  }
		  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

			x3=x3+2;
		
		}
	 
 

		repaint();
		try
		{
			Thread.currentThread().sleep(30);
		}
		catch(Exception er)
		{
		}


  }//for 
	
}

  public void paint(Graphics g)
  {
	  g.setColor(Color.red);
	  g.fillOval(x1,y1,60,60);
	  g.setColor(Color.green);
	  g.fillOval(x2,y2,60,60);
	  g.setColor(Color.magenta);
	  g.fillOval(x3,y3,60,60);
  }

   


			

	public static void main(String[] args) 
	{   
		MyFrame2 t1=new MyFrame2("Ball Demo");
		Thread th1=new Thread(t1,"ball1");
		th1.start();
		Thread th2=new Thread(t1,"ball2");
		th2.start();
		Thread th3=new Thread(t1,"ball3");
		th3.start();
	}
}

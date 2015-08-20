
public class Exx {

	public static void main(String[] args)
	{
		Bx o=new Bx();
		
		ShowSum r=new ShowSum(o);
		
		Thread t=new Thread(r);
		t.start();
		
		synchronized(o)
		{
		for(int i=0;i<100;i++)
		{
			o.sum=o.sum+i;
			
			try
			{
				
				Thread.sleep(2000);
			}
			catch(Exception e){}
			
		}
		o.notify();
		}
		
		
		
	}
}


class Bx
{
	int sum=0;
}


class ShowSum implements Runnable
{
	Bx o;
	
	ShowSum(Bx o)
	{
		this.o=o;
		
	}
	
	public void run()
	{
		
		synchronized(o)
		{
			try
			{
				o.wait();
			}
			catch(Exception e){}
			
			System.out.println(o.sum);
		}
		
	}
}

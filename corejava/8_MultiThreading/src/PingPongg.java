class PingPong extends Thread 
{
	String s;

	public PingPong(String w)
	{
		s=w;
	}

	public void run()
	{
		try
		{
			for(;;)
			{
				System.out.println(getName()+":"+s);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
	   PingPong p1=new PingPong("SEED");
	   p1.start();

   	   PingPong p2=new PingPong("NAMA");
	   p2.start();

	   for(int i=0;i< 30;i++)
		{try
			{
		   System.out.println(Thread.currentThread().getName()+":"+i);
		   sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

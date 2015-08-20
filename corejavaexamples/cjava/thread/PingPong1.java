class PingPong1 implements Runnable
{
	String s;

	public PingPong1(String w)
	{
		s=w;
	}

	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName()+":"+s);
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

		
	   Runnable p1=new PingPong1("SEED");
	   Runnable p2=new PingPong1("NAMA");
       
		  
		  Thread t2=new Thread(p2,"Thread2");
	     t2.setPriority(2);
	   t2.start();
 
	   Thread t1=new Thread(p1,"Thread1");
	    t1.setPriority(10);
	   t1.start();
	  

	  


	   for(int i=0;i<6;i++)
		{try
			{
		   System.out.println(Thread.currentThread().getName()+":"+i);
		   Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

			//System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

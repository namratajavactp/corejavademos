class ThreadA
{
	public static void main(String[] args) throws Exception
	{
		ThreadB b=new ThreadB();
	//	Thread t=new Thread(b,"thread b");
		b.start();
		//Thread.sleep(5000);
		synchronized(b)
		{
			System.out.println("Waiting for thread B");
			b.wait();
			System.out.println("total is:"+b.total);

		}

	//	System.out.println("Hello World!");
	}
}
class ThreadB extends Thread//implements Runnable
{
	 int total;
	//private boolean flag;
	
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<30;i++)
			{ 
				
				try
				{			
					
				Thread.sleep(100);
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
				total+=i;
			}
			//notify();
		}

	}
}

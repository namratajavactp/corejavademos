class ThreadDemoo
{

	public static void main(String[] args) 
	{

		Count c=new Count();
		Thread aa=new Thread(c,"another");
		aa.start();
/*
		try
		{

			aa.join();
		}catch(Exception e)
		{
			System.out.println(e);
		}
         
*/		
			
		for(int i=0;i<10;i++)
			System.out.println("hello");

		System.out.println("Thread"+Thread.currentThread().getName()+":ends");

		
	}
}

class Count implements Runnable
{
	public void run()
	{int ii=0;
		while(ii<60)
		{
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<5;i++)
			System.out.println(i);
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			ii++;
		}
	}

}


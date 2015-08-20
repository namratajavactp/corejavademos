class ThreadDemo 
{

	public static void main(String[] args) 
	{

		Count c=new Count();
		Count c1=new Count();
		Count c2=new Count();

		ThreadGroup tg=new ThreadGroup("seed");

		Thread t1=new Thread(tg,c,"t1");
		Thread t2=new Thread(tg,c1,"t2");
		Thread t3=new Thread(tg,c2,"t3");
		t1.start();
		t2.start();
		t3.start();

		tg.interrupt();



		System.out.println("Thread"+Thread.currentThread().getName()+":ends");
			
			

		
	}
}

class Count implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<5;i++)
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

}


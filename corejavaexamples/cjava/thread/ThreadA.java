class ThreadA
{
	public static void main(String[] args) 
	{
		ThreadB b=new ThreadB();
		b.start();
		Thread.sleep(5000);
		synchronized(b)
		{
			System.out.println("Waiting for thread B");
			b.wait();
			System.out.println("total is:"+b.getTotal());

		}

	//	System.out.println("Hello World!");
	}
}
class ThreadB extends Thread
{
	private int total;
	//private boolean flag;
	public int getTotal()
	{
		return total;
	}
	public void run()
	{
		synchronized(this)
		{
			for(i=0;i<30;i++)
			{ // Thread.sleep(4000);
				total+=i;
			}
			notify();
		}

	}
}

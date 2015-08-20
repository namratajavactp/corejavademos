
class WorkerThread implements Runnable
{

	public void run()
	{
		while(true)
		{
		
		try
			{
		System.out.println("I am the demon thread"+Thread.currentThread().getName());
		Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}  


public class DemonThread
{
	public static void main(String arhs[])throws Exception
	{
		Thread t1=new Thread(new WorkerThread());
		t1.setDaemon(true);
	//	Thread t2=new Thread(new WorkerThread());
		t1.start();

	//	t2.start();

		System.out.println(t1.isDaemon());
		for(int i=0;i<20;i++)
		{
			System.out.println("I am the main thread"+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}
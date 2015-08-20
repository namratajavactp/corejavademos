class MultiEx1 
{


	public static void main(String[] args) throws Exception
	{
		Ar o=new Ar();
		
		Thread t=new Thread(o,"namrata");
		t.start();
		
		Thread t1=new Thread(o,"arjun");
		t1.start();  
		

		for(int i=0;i<100;i++)
		{	
			System.out.println("main thraed"+": "+i);
			Thread.sleep(5000);
		}



	}
}


class Ar implements Runnable
{ 
	int i=1;

	public void run()
	{
		synchronized(this)
		{
		for(i=1;i<10;i++)
		{
			try
			{
			System.out.println(Thread.currentThread().getName()+": "+i);
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		}//
	}



};



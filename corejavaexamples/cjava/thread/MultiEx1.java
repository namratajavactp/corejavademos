class MultiEx1 
{


	public static void main(String[] args) throws Exception
	{
		Thread t=new Thread(new A(),"namrata");
		t.start();

		for(int i=0;i<100;i++)
		{	
			System.out.println("main thraed"+": "+i);
			Thread.sleep(5000);
		}



	}
}


class A implements Runnable
{ 

	public void run()
	{
		for(int i=0;i<100;i++)
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

	}



};



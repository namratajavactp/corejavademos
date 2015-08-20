class MultiEx11 
{


	public static void main(String[] args) throws Exception
	{
		   A aa=new A();
		Thread t=new Thr        ead(aa,"namrata");
		t.start();
		Thread t1=new Thread(aa,"arjun");
		t1.start();

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
}
/*class B implements Runnable
{ 

	public void run()
	{
		for(int i=100;i>=0;i--)
		{
			try
			{
			System.out.println(Thread.currentThread().getName()+": "+i);
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
}*/





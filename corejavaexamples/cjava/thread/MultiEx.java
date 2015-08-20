class MultiEx 
{


	public static void main(String[] args) throws Exception
	{
		A t=new A("namrata");
		t.start();

		for(int i=0;i<100;i++)
		{	
			System.out.println("main thraed"+": "+i);
			Thread.sleep(5000);
		}



	}
}


class A extends Thread
{  A(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try
			{
			System.out.println(this+": "+i);
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}



};



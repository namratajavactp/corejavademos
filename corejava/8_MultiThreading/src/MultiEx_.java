class MultiEx 
{


	public static void main(String[] args) throws Exception
	{
		Ab t=new Ab("namrata");
		t.start();
		
		Ab t1=new Ab("arjun");
		t1.start();

		for(int i=0;i<100;i++)
		{	
			System.out.println("main thraed"+": "+i);
			Thread.sleep(5000);
		}



	}
}


class Ab extends Thread
{  Ab(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try
			{
			System.out.println(this.getName()+": "+i);
			//System.out.println(this+": "+i);
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}



};



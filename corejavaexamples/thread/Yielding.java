class Data implements Runnable
{
	public void run()
	{
		int i=0;
		try
		{
			while(i++<30)
			{

				if(((i%3)==0) && Thread.currentThread().getName().equals("jadu"))
				{
					System.out.println(Thread.currentThread().getName()+" yielding:");
					Thread.currentThread().yield();
				}
				
				  System.out.println(Thread.currentThread().getName()+i);
				//  System.out.println("\n"+Thread.currentThread().getName()+i+":if not yielded then hello");
				


				
			}
		}
		catch(Exception e)
		{
		}
	}
}

class Yielding 
{
	
	
	public static void main(String args[])
	{
		try
		{
			Thread t1,t2,t3;
			
			t1=new Thread(new Data(),"ram");
			t2=new Thread(new Data(),"shyam");
			t3=new Thread(new Data(),"jadu");

			t1.start();
			t2.start();
			t3.start();
			
		/**	for(int i=0;i<100;i++)
			{
				if(i==20)
					t1.stop();
				if(i==40)
					t1.start();
			}*/
		}
		catch(Exception e)
		{
		}
	}
}
			

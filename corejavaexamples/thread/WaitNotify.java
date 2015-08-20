class MyThread extends Thread 
{Calculator c;


     MyThread(Calculator c)
	{ 
		 this.c=c;

	}
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		MyThread t=new MyThread(c);
			t.start();


		Thread t1=new Thread(new MyThread1(c));
		t1.start();
		
	}



	public void run() 
	{
		synchronized(c)
		{
			try
			{
			
			
			
			if(c.flag!=true)
				{
				System.out.println(Thread.currentThread().getName()+" is waiting.");
				c.wait();
				System.out.println(Thread.currentThread().getName()+" is out of waiting.");
				}


			
				System.out.println(c.total);
			}
			catch(Exception e)
			{
				e.printStackTrace();

			}


		}

	}

}


class MyThread1 implements Runnable
{
	Calculator c;

	MyThread1(Calculator c)
	{
		this.c=c;
		
	}


	public void run()
	{
		synchronized(c)
		{
			for(int i=0;i<10;i++)
				c.total+=i;
			c.flag=true;
			c.notify();
		}


	}
}

class Calculator
{
	int total=0;
	boolean flag=false;


}

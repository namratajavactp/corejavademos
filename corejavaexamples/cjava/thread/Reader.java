class myread extends Thread 
{
	Calculator c;

	public myread(Calculator calc)
	{
		c=calc;
	}


	public void run() {
	  while(true)
	  {
		synchronized(c)
		{
			try
			{
				System.out.println("waiting for calcu..."+this.getName());
				c.wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupted");
			}

            System.out.println("Thread"+this.getName()+"woke up");
			System.out.println("Total is:"+c.total);
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupted");
			}
		}
	  }
	 }


	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		new myread(c).start();
		new myread(c).start();
		new myread(c).start();
		c.start();
	}
}


class Calculator extends Thread
{
	int total;

	public void run()
	{
	  while(true)
	  {
		synchronized(this)
		{ total=0;
			for(int i=0;i<=100;i++)
				total+=i;

			notifyAll();
		}
	  }
	}
}
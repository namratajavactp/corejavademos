class  JoinDemo extends Thread
{
	static Thread t1 ;
	static Thread t2;
		
	
	public static void main(String[] args) 
	{
		t1 = new JoinDemo();
		t2 = new JoinDemo();
		t1.setName("Hello");
		t2.setName("hi");
		t1.start();
		t2.start();
		
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try
			{
			
					System.out.println(Thread.currentThread().getName());
					
					
					System.out.println(i);
					if(i==25)
					{
						if(this.getName().equals("Hello"))
							t2.join();
						
					}
					Thread.sleep(500);
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

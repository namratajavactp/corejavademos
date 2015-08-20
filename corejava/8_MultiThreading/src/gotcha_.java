class Aa
{
	public static void main(String[] args) throws Exception
	{
		Thread t=new Thread();
		//t.start();
		
		synchronized(t)
		{
			t.wait();
			System.out.println("came out");
          
			
		}
		
		
	}

	


}


class B
{


	public static void main(String[] args) throws Exception
	{
       w w1=new w();
		Thread t=new Thread(w1,"avi");
		t.start();
		synchronized (w1)
		{
			System.out.println("waiting");
			w1.wait();
      		System.out.println(w1.sum);
		}
	}
}






class w implements Runnable
{
  int sum;
  public void run()
	{
	  synchronized(this)
		{

		   try{
	 // Thread.sleep(400);
      for(int i=0;i<=50;i++)
		{
		  sum=sum+i;
		 }
	//	 return sum;
	 
	  }
	  catch(Exception e)
			{
		  System.out.println(e);
			}

     // notify();
		}
    }
	

}


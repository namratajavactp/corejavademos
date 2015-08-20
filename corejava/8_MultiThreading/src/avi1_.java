
class B
{


	public static void main(String[] args) throws Exception
	{
		X ob=new X();
		
       w w1=new w(ob);
       
		Thread t=new Thread(w1,"avi");
		t.start();
		synchronized (ob)
		{
			System.out.println("waiting");
			if(ob.flag!=true)
			ob.wait();
      		System.out.println(ob.sum);
		}
	}
}


class X
{
	int sum=0;
	boolean flag=false;
}



class w implements Runnable
{
   X ob;
  
  w(X ob)
  {
	  this.ob=ob;
  }
  
  
  public void run()
	{
	  synchronized(this)
		{

		   try{
	 // Thread.sleep(400);
      for(int i=0;i<=50;i++)
		{
		  ob.sum=ob.sum+i;
		 }
       ob.flag=true;
	
	 
	  }
	  catch(Exception e)
			{
		  System.out.println(e);
			}

     notify();
		}
    }
	

}


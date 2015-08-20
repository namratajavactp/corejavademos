class z1 //using wait() notify()
{
	public static void main(String[] args) throws Exception
	{
		z2 o=new z2();
		o.start();
        
		 synchronized(o)
		{
			 System.out.println(Thread.currentThread().getName()+"     waiting for thread z2 ;" );
		    o.wait();
			System.out.println(Thread.currentThread().getName()+"      got the lock");
			System.out.println("the sum:"+o.sum);
		}

		
	}
}

class z2 extends Thread
{
	int sum=0;

   public void run()
	{
		 synchronized(this)
		{

	      	try{
			           for(int i =0;i<50;i++)
			                {  System.out.println(Thread.currentThread().getName()+"  processing");
						       sum =sum +i;
					          }
					   System.out.println(Thread.currentThread().getName()+"  sleepin");
					   Thread.sleep(4000);
					   notify();
		              }
		        catch(Exception e)
		                {
			                e.printStackTrace();
		              }
		         
       }
	}
}


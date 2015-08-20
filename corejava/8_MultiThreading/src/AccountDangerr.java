class Accountt {
   private int balance = 5000;
   public int getBalance() {
      return balance;
   }
   public void withdraw(int amount) {
      balance = balance - amount;
      System.out.println(balance+ "after withdrawing");
   }
}
public class AccountDangerr {
   public static void main(String[] args)
   {
	   Accountt ob=new Accountt();
	   AccountWrapper w=new AccountWrapper(ob);
	   Thread t1=new Thread(w,"fred");
	   Thread t2=new Thread(w,"lucy");
	   t1.start();
	   t2.start();
	   
	   
   }
	
	
}

 class AccountWrapper implements Runnable
{
	Accountt r;
	AccountWrapper(Accountt r)
	{
		this.r=r;
	}
	
	
	
	
	public void run()
	{
//	synchronized(r)
//		{
		if(r.getBalance()>3000)
		{
			try
			{
			Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		r.withdraw(3000);
		}
		else
			System.out.println("insufficient balance");
	   }
 //  }//synchronized block got over so lock on account object released
}



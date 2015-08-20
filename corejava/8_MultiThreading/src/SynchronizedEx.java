
public class SynchronizedEx {

	
	public static void main(String[] args)
	{
		A ob=new A("xyz123");
		Thread t=new Thread(ob,"fred");
		Thread t1=new Thread(ob,"lucy");
		t.start();
		t1.start();
	}
}


class A implements Runnable
{
	
	String name;
	
	A(String s)
	{
		name=s;
	}
	
	public void run()
	{
		abc();
	}
	//synchronized
	void abc()
	{
		for(int i=0;i<10;i++)
		{int j=0;
		if(j<name.length())
		{
			
			name=name.charAt(name.length()-1)+name.substring(j,name.length()-1);
			j++;
			System.out.println(name);
			
			try
			{
			Thread.sleep(2000);
			}catch(Exception e){}
			
		}
	  }
	}
}
import java.io.*;

class ExceptionEx 
{
	public static void main(String[] args) 
	{
       //follow handle or declare rule
		
		try
		{
		abc();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("rethrown and caught here again");
		}

	}
	
	
	static void abc() throws Exception
	{
		try
		{
			FileReader f=new FileReader("abc.java");
			f.read();
			
			System.out.println("will this be executed?");
		}
		catch(Exception e)
		{
			System.out.println("partial handling of exception:"+e);
             throw e;
		}
		System.out.println("hi kkkkk");

	}
}




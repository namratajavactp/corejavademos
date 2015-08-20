
public class ExceptionEx1 {
	
	
	
	
	public static void main(String[] args)
	{   
		try
		{
		abc();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("remaining program");
		
	}

	
	static void abc()
	{
		
			String s=null;
			s.concat("ggg");
			System.out.println(s);
			
		  System.out.println("never printed");
	}
}









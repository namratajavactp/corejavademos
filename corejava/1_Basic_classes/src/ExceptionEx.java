
public class ExceptionEx {
	
	
	
	
	public static void main(String[] args)
	{
		try
		{
			String s=null;
			s.concat("ggg");
			System.out.println(s);
			
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	  System.out.println("never printed");
	}

}









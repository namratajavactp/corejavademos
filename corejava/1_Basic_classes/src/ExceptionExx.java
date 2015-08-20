import java.io.*;
public class ExceptionExx {
	
	
	
	
	public static void main(String[] args) 
	{
		/*
			String s=null;
			s.concat("ggg");
			System.out.println(s);
			
		*/
		try
		{
	  abc();
		}
		catch(Exception e){}
		
	  System.out.println("never printed");
	}
	
	static void abc() throws IOException
	{
//		try
		//	{
			FileReader fr=new FileReader("abc.java");
			fr.read();
		//	}
		//	catch(Exception e){}
			
			
	}

}









import java.io.*;
import java.util.*;

class  UseScanner
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
			System.out.println(s.next());
		s.close();
/*
		s=new Scanner(System.in);

		while(s.hasNext())
		{
			if(s.hasNextInt())
			{
				System.out.println(" int:"+s.nextInt());
			}
			else if(s.hasNextDouble())
			{
				System.out.println(" double:"+s.nextDouble());
			}
			
			else if(s.hasNextBoolean())
			{
					System.out.println(" Boolean:"+s.nextBoolean());
			}
			else
			{
					System.out.println(" String:"+s.next());
			}
		}
		s.close();	
*/
		
	}
}

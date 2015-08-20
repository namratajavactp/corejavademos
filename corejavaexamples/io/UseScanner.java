import java.io.*;
import java.util.*;

class  UseScanner
{
	public static void main(String[] args) 
	{
	/*	Scanner s=new Scanner(System.in);
		while(s.hasNext())
			System.out.println(s.next());
		s.close();*/

		Scanner s=new Scanner(System.in);

		while(s.hasNext())
		{
			if(s.hasNextInt())
			{
				int i=s.nextInt();
				i++;
				System.out.println(" int:"+i);
			}
			else if(s.hasNextDouble())
			{
				double sal=s.nextDouble();
				System.out.println(" double:"+sal);
			}
			
			else if(s.hasNextBoolean())
			{
				boolean isRed=s.nextBoolean();
					System.out.println(" Boolean:"+isRed);
			}
			else
			{
					System.out.println(" String:"+s.next());
			}
		}
		s.close();	

		
	}
}

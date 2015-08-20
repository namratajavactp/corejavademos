
import java.io.*;
import java.util.*;
public class input1 
{
	public static void main(String[] args) 
	{Scanner sc=null;
	  try
	  {
		
		File f=new File("data.txt");

		PrintWriter pw=new PrintWriter(f);

		int no=123;
		double no1=23.33;
		boolean val=true;

		pw.println("hello everybody");
		pw.println(no);
		pw.println(no1);
		pw.println(val);

        pw.flush(); 
		pw.close();


        System.out.println("USING SCANNER:");
		 sc=new Scanner(f);
		while(sc.hasNext())
			System.out.println(sc.next());
		sc.close();

		System.out.println("************************");

		sc=new Scanner(f);
		int k;
		double d;

		while(sc.hasNext())
	  {
		if(sc.hasNextInt())
		  {
			k=sc.nextInt();
			System.out.println("int:"+k);
		  }
		else if(sc.hasNextDouble())
		  {
			d=sc.nextDouble();
			System.out.println("d:"+d);
		  }
		else if(sc.hasNextBoolean())
			System.out.println(sc.nextBoolean());
		else
			System.out.println(sc.next());
	  }

//		sc.close();

		

   }
	  catch(IOException e)
		{
		  sc.close();
		  e.printStackTrace();
		}
	
	}
}

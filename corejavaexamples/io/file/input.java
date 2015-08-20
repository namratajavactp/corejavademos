
import java.io.*;
import java.util.*;
public class input 
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

		BufferedReader br = new BufferedReader(new FileReader(f));
		String s=null;
		while((s=br.readLine())!=null)
		  {
			System.out.println(s);
		  }
		 br.close();

		 
		 br = new BufferedReader(new FileReader(f));
		 s=br.readLine();
		 s=br.readLine().trim();

         double tot=0;
		 int noo=new Integer(s);
		 tot+=no;

		 int nnn=Integer.parseInt(s);
		 System.out.println("jdk 1.4:int:"+nnn);

		 s=br.readLine().trim();
		 double noo1=new Double(s);
		 tot+=no1;
         
		 System.out.println("Total is:"+tot);

		 Double obj=new Double(s);
		 double vall=obj.doubleValue();
 		 System.out.println("jdk 1.4 double:"+vall);

		 s=br.readLine().trim();
		 boolean torf=new Boolean(s);
		 System.out.println("boolean val:"+torf);
    		br.close();	

        System.out.println("USING SCANNER:");
		 sc=new Scanner(f);
		while(sc.hasNext())
			System.out.println(sc.next());
		sc.close();

		sc=new Scanner(f);
		tot=0;
	  while(true)
	  {
		if(sc.hasNextInt())
			tot+=sc.nextInt();
		else if(sc.hasNextDouble())
		  {
			tot+=sc.nextDouble();
			System.out.println("TOTAL IS:"+tot);
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

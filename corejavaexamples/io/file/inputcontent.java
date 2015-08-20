import java.io.*;
import java.util.*;
class inputcontent 
{
	public static void main(String[] args) throws Exception
	{   
/* InputStreamReader in=new InputStreamReader(System.in);

BufferedReader br=new BufferedReader(in); */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File f=new File("c:/nama.java");
		PrintWriter pw=new PrintWriter(f);
		String temp="";
		while(true)
		{
			temp= br.readLine();
			if(!(temp.equals("end")))
				pw.println(temp);
			else
				break;
		}

		br.close();
		pw.close();


/*
		Scanner s=new Scanner(new BufferedReader (new FileReader(f)));
		while(s.hasNext())
			System.out.println(s.next());
		s.close();

		s=new Scanner(new BufferedReader (new FileReader(f)));

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

		 br=new BufferedReader(new FileReader(f));
		String str="";
		while((str=br.readLine())!=null)
				System.out.println(str);
		br.close();

		FileReader fr=new FileReader(f);
		int i;
		while((i=fr.read())!= -1)
			System.out.print((char)i);
		fr.close();

*/

		
 }
}
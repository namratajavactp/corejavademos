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
		int i=4;
		pw.println(i);


		br.close();
		pw.close();



		



		
 }
}
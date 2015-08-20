import java.io.*;
class FileIO1 
{
	public static void main(String[] args) 
	{

		try
		{
			File file = new File("namaWrite.txt");
			 
			PrintWriter pw=new PrintWriter(file);
			pw.println("Namrata Marathe");
			
			boolean istrue=true;
			pw.println(istrue);
			double sal =12.3;
			pw.println(sal);
			pw.flush();   
			pw.close();

			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String d=null;
			while((d=br.readLine())!=null)
			{
				System.out.println(d);
			}

			br.close();
			
			

		}
		catch(IOException e) {}
	  }

	
	
}

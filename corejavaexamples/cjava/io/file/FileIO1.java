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
			pw.println("Hello how are u?");
			pw.println("i am fine thank you");
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

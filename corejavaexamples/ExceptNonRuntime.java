import java.io.*;

class FileEx 
{
	public static void main(String[] args) //throws IOException
	{try
		{
		new FileEx().abc();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("continued");
	}


	void abc() throws IOException
	{
		File f=new File("Z:\\abc.java");
		FileReader fr=new FileReader(f);
		fr.read();
		System.out.println("fgfkgjfg");
		

	}
}

import java.io.*;

class FileEx 
{
	public static void main(String[] args) 
	{


    try
		{
     aaa();

		}
		catch(IOException e)
		{
			System.out.println(e);

		}
	 System.out.println("hhhhhh");
	


	}

	static void aaa()throws IOException
	{
		File f=new File("Z:\\abc.java");
		FileReader fr=new FileReader(f);
		fr.read();
		System.out.println("fgfkgjfg");

	}
}

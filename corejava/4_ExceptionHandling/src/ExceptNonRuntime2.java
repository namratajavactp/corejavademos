import java.io.*;

class FileExx 
{
	public static void main(String[] args) 
	{

         bbb();
    System.out.println("this is executed");
	


	}


     static void bbb()
	{try
		{
     aaa();

		}
		catch(IOException e)
		{
			e.printStackTrace();
			return;

		}
		finally
		{
			System.out.println("hit");
		
		//System.out.println("miss");
		}
	}
	static void aaa()throws IOException
	{
		File f=new File("Z:\\abc.java");
		FileReader fr=new FileReader(f);
		fr.read();
		System.out.println("fgfkgjfg");

	}
}

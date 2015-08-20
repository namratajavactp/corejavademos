import java.io.*;
class UseFile 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("c:\\abc.java");

	System.out.println(f.exists());
		if(!f.exists())
			f.createNewFile();

		System.out.println(f.isFile());

		File f1=new File("c:\\def");
		System.out.println(f1.exists());
		if(!f1.exists())
			f1.mkdir();
		System.out.println(f1.isDirectory());


		File f2=new File(f1,"abc1.java");
			if(!f2.exists())
			f2.createNewFile();

		System.out.println(f2.isFile());


	}
}

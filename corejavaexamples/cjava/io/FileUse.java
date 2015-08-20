
import java.io.*;
class FileUse 
{
	public static void main(String[] args) throws IOException
	{
		File o=new File("abc.txt");
		if(o.exists()!=true)
			o.createNewFile();
		System.out.println(o.exists());

		File mydir=new File("mydir");
		if((mydir.exists())!=true)
			mydir.mkdir();

		System.out.println(mydir.exists()+" / "+mydir.isDirectory());
			
			File f2=null;
			File f=new File(mydir,"abc.txt");
			f.createNewFile();
			f=new File(mydir,"def.txt");
			f.createNewFile();
			f2=f;
			
			f=new File(mydir,"mydir1");
			f.mkdir();
			f=new File("mydir//mydir1","ggg.txt");
			f.createNewFile();

			String[] l =new String[10];
			File[] ll =new File[10];
			
			
		
			l=mydir.list();
	
			for(String s:l)
			{
				System.out.println(s);
				
			}

			ff=new File(mydir,"eef.txt");
			System.out.println("renameing:"+f2.renameTo(ff));

			System.out.println("****list files using listFiles function****");

			ll=mydir.listFiles();
	
			for(File s:ll)
			{
				System.out.println(s);
				if(s.isDirectory()==true)
				{
					File[] e=new File[10];
					e=s.listFiles();
					for(File ee:e)
						System.out.println(ee);
					
				}

			}

			

				
		}


}

  

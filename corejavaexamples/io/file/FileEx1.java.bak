import java.io.*;
class FileEx 
{
	public static void main(String[] args) 
	{
	  try
	  {
		File file = new File("nama.txt");    //There is no file yet.it's only an object
		boolean newFile=false;

		System.out.println("file exists before create file:"+file.exists());
		newFile=file.createNewFile();
		System.out.println(newFile);
		System.out.println("file exists:"+file.exists());


		File myDir = new File("myDir");
		myDir.mkdir();   //exception if no mkdir

		File myFile = new File(myDir,"in1.txt");
		myFile.createNewFile();

		PrintWriter pw=new PrintWriter(myFile);
		pw.println("newstuff\nbfjkd\nfgfg");
		pw.flush();
		pw.close();

		
		System.out.println("isDirectory:"+myDir.isDirectory());
		FileReader fr=new FileReader(myFile);
		BufferedReader br=new BufferedReader(fr);

		String s;
		while((s=br.readLine())!=null)
			System.out.println(s);

		br.close();

		//add one more file
		File myFile1 = new File(myDir,"in2.txt");
		myFile1.createNewFile();

		String[] files = new String[4];
		File search = new File("myDir");

		files = search.list();

		for(String fn:files)
			System.out.println("found :"+fn);

		myFile1.delete();  //delete file

		System.out.println("after deleting:");

		files = new String[3];

		files = search.list();

		for(String fn:files)
			System.out.println("found :"+fn);


		System.out.println("myDir is:"+myDir.delete());

		File newName = new File(myDir,"newFile.txt");
		myFile.renameTo(newName);
    
	    System.out.println("after renaming:");

		files = new String[3];

		files = search.list();

		for(String fn:files)
			System.out.println("found :"+fn);

       
		File newDir=new File("newDir");
		myDir.renameTo(newDir);

		 System.out.println("after renaming DIR:");

		files = new String[4];
		search = new File("newDir");

		files = search.list();

		for(String fn:files)
			System.out.println("found :"+fn);












  }
	  catch(IOException e)
		{}





		

	}
}

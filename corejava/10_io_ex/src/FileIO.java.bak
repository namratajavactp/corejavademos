import java.io.*;
class FileIO 
{
	public static void main(String[] args) 
	{
		char[] in=new char[10];    //; //to store input
		int size=0;

		try
		{
			File file = new File("namaWrite.txt");
			FileWriter fw = new FileWriter(file);  //create an actual file and a file writer object
			fw.write("howdy\nfolks\ncxvvc zxm,nznc.\ncnkccnk");
			fw.flush();   
			fw.close();

			FileReader fr=new FileReader(file);
			while((size=fr.read(in))!=-1)
			{
				System.out.println("\n size:"+size+"\n");
				for(char c:in)
					System.out.print(c);

				in=new char[10]; 
			}

			System.out.println("\n size:"+size);
			fr.close();

		}
		catch(IOException e) {}
	  }

	
	
}

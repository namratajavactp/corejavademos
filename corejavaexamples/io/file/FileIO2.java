import java.io.*;
class FileIO2
{
	public static void main(String[] args) 
	{

		try
		{
			File file = new File("namaWrite.txt");
			FileWriter fw = new FileWriter(file);  //create an actual file and a file writer object
			PrintWriter pw=new PrintWriter(fw);
			pw.println("Namrata Marathe");
			

			int no=234;

			pw.println(no);
			float x=12.22f;
			pw.println(x);

			pw.flush();   
			pw.close();

			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String d=null;
			d=br.readLine();
			System.out.println(d);
			d=br.readLine().trim();
		
			//after jdk 1.5 ..unboxing

			int no1=new Integer(d);
			System.out.println("no1:"+no1);

            //before

			int na1=Integer.parseInt(d);
			System.out.println("before no1:"+na1);

			d=br.readLine().trim();
			
			//after
			float no2=new Float(d);
			System.out.println("no2:"+no2);

			//before
			float na2=Float.parseFloat(d);
			System.out.println("before no2:"+na2);

			br.close();

		}
		catch(IOException e) 
			{
				System.out.println(e);

			}
	  }

	
	
}

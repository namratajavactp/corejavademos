import java.io.*;

class dataipop 
{
	public static void main(String[] args) 
	{
		try
		{
			DataOutputStream dos1=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("c:/data.txt")));
			dos1.writeDouble(1.234);
			dos1.writeBytes("Here's my input");
			dos1.writeChars("Hello");
			
		
			dos1.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			DataInputStream dos=new DataInputStream(new BufferedInputStream(new FileInputStream("c:/data.txt")));
			BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream("c:/data.txt")));
			String str;
			System.out.println(dos.readDouble());
			bf.skip(8);
			while((str=bf.readLine())!=null)
				System.out.println(str);
				dos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

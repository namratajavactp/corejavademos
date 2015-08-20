import java.net.*;
import java.io.*;

public class IamServer 
{
	
	public static void main(String[] args) 
	{  
		Socket ss=null;
		ServerSocket s=null;
		BufferedReader br=null;
		DataInputStream ds=null;
		InputStream get=null;
		try
		{
		s=new ServerSocket(2002);
		ss=s.accept();
		br=new BufferedReader(new InputStreamReader(ss.getInputStream())); 
		//ds=new DataInputStream(get);
		
		
		System.out.println("recv:"+br.readLine());
//		int no=ds.readInt();
//		System.out.println("recv:no"+no);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        try
		{
			ss.close();
			s.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}


	}
}

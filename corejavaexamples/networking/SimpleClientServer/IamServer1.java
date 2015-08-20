import java.net.*;
import java.io.*;

public class IamServer1 
{
	
	public static void main(String[] args) throws IOException
	{  
		
		ServerSocket s=null;
		Socket ss=null;

		s=new ServerSocket(2002);
		while(true)
		{
			try
			{
				
				ss=s.accept();
				Thread t=new CThread(ss);
				t.start();
			}
			catch(Exception e)
			{
				s.close();
				e.printStackTrace();
				break;
			}

		} //end of while
	}//end of main
} //end of class

	class CThread extends Thread
	{   
		BufferedReader br=null;
	
		InputStream get=null;
		Socket ss=null;

		CThread(Socket s)
		{
			ss=s;
		}

public void run()
		{
	try
		{
		br=new BufferedReader(new InputStreamReader(ss.getInputStream())); 
				
		System.out.println("recv:"+br.readLine());
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
        try
		{
		
			ss.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}


	}

}
import java.net.*;
import java.io.*;

public class contactServer 
{
	
	public static void main(String[] args) 
	{
		PrintWriter pw=null;
		BufferedReader br=null;
		DataOutputStream ds=null;
		OutputStream opt=null;
		try
		{
			Socket s=new Socket("lab4-1",2002);
		   pw=new PrintWriter(s.getOutputStream(),true);
		   String str="hello how are u";

		   
		   pw.println(str);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}

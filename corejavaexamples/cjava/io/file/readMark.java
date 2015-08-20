import java.io.*;
import java.net.*;

class readMark 
{
	public static void main(String[] args) throws Exception
	{
//		URL u = new URL("http://www.yahoo.com");
		URL u = new URL("http://localhost:8080/logServlet/");
		InputStream s=u.openStream();
		BufferedInputStream bs=new BufferedInputStream (s);
		if(bs.markSupported())
		{
			byte[] readAhead = new byte[256];
			bs.mark(512);
			//mark the current position buffering 512 bytes.
			bs.read(readAhead);
			System.out.println("readAhead:"+new String(readAhead));
			
			bs.reset();
			System.out.println("after reset:"+new String(readAhead));
			
		}

	}
}

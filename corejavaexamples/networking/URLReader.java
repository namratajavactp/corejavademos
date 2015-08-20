import java.net.*;
import java.io.*;

public class URLReader {
     public static void main(String[] args)  {
		 try
		 {
	URL yahoo = new URL("http://www.yahoo.com/");
	
	BufferedReader in = new BufferedReader(
				new InputStreamReader(
				yahoo.openStream()));

	String inputLine;

	while ((inputLine = in.readLine()) != null)
	    System.out.println(inputLine);
	  

	in.close();
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
    }
	
}


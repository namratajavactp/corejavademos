import java.io.*;
import java.util.*;


class  seqipstream
{
	public static void main(String[] args) 
	{
		try
		{
			Vector streams=new Vector(args.length);
			for(int i=0;i<args.length;i++)
				streams.addElement(new FileInputStream(args[i]));
			SequenceInputStream in=new SequenceInputStream(streams.elements());
			byte [] b=new byte[256];
			int howmany;
			while((howmany=in.read(b))>0)
				System.out.println(new String(b));
		//	System.out.flush();
			in.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

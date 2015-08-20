import java.io.*;
import java.util.*;

class runningavg extends Thread
{
	private DataInputStream in;
	double total=0;
	long count=0;

	 runningavg(InputStream i)
	{
		in=new DataInputStream(i);
	}

	public void run()
	{
		while(true)
		{
			try
			{
				double num=in.readDouble();
				total+=num;
				count++;
				System.out.println("Number added: "+num+"New Average:"+total/count);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}//run

 }


class numbgen extends Thread
{
	private DataOutputStream out;
	private Random gen=new Random();

	 numbgen(OutputStream o)
	{
		out=new DataOutputStream(o);
	}


	public void run()
	{
		while(true)
		{
			try
			{
				double num=gen.nextFloat()*1000;
				out.writeDouble(num);
				out.flush();
				sleep(500);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}

class piped
{

	public static void main(String[] args) 
	{
		try	
		{
			PipedOutputStream producer = new PipedOutputStream();
			PipedInputStream consumer = new PipedInputStream(producer);
			numbgen gen= new numbgen(producer);
			runningavg avg=new runningavg(consumer);
			gen.start();
			avg.start();
		}
		catch(IOException e)
		{
			e.printStackTrace();
    	}
	
	}
}

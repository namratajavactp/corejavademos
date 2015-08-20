import java.io.*;
class  BRRead1
{
	public static void main(String[] args) throws IOException
	{
		char c;

	/*	System.out.println("Enetr charactes , 'q' to quit");
		InputStreamReader i=new InputStreamReader(System.in);
		System.out.println("encoding scheme:"+i.getEncoding());

		//read characters
     System.out.println("inputstreamReader");
		do
		{
	
			c = (char)i.read();
			System.out.print(c);
		}while(c!='q');

        System.out.println("inputstream");
		do
		{

			c = (char)System.in.read();
			System.out.print(c);
		}while(c!='Q'); */


		FileInputStream fin=new FileInputStream("c:/nama.txt");
		FileOutputStream fout=new FileOutputStream("c:/nama2.dat");
		FileOutputStream fout1=new FileOutputStream("c:/nama12.txt");
	/*	byte[] b;
		int n=fin.available();
		b=new byte[n];
		System.out.println("Bytes available:"+n);
	
		fin.read(b);
		fin.close();
		System.out.write(b);
		*/
		int no=258;
		fout1.write(no);
		fout1.close();
		try
		{
		fin=new FileInputStream("c:/nama12.txt");
		int nu;
		while((nu=fin.read()) != -1)
			System.out.print((char)nu);
		fin.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeDouble(12.345);
		dout.writeInt(no);
		dout.close();

	/*	while((nu=fin.read())!=-1)
			System.out.print((char)nu);
		fin.close();
		try
		{
		fin=new FileInputStream("c:/nama12.dat");
		}
		catch(Exception e)
		{
			System.out.println("inside fin"+e);
		}

*/
        FileInputStream fi=new FileInputStream("c:/nama2.dat");
		DataInputStream din=null;
		
		 din=new DataInputStream(fi);
		
		try
		{
		System.out.println(din.readDouble());	
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}
		System.out.println(din.readInt());
		

         din.close();
		
		
			}
}

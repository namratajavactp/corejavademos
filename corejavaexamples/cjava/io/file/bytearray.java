//ByteArrayInputStream and ByteArrayOutputStream
import java.io.*;

class bytearray
{
	byte [] byteArr;
	byte [] copyArr;
	public static void main(String[] args) 
	{
		     		
       bytearray ba=new bytearray();
		try
		{
			ByteArrayOutputStream dos1=new ByteArrayOutputStream();
			 ba.byteArr = new String("gshgkag hgdjkasdghashd jksdgjksh"+
				"hello how are u \n i am fine thanku \n"+
				"sbjslkadks").getBytes();
			dos1.write(ba.byteArr);
			ba.copyArr=dos1.toByteArray();
			System.out.println(new String(ba.copyArr));
			dos1.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}



		try
		{

			ByteArrayInputStream dos=new ByteArrayInputStream(ba.copyArr);
			byte [] arr=new byte[80];
			String str;
			while(dos.read(arr)!= -1)
				System.out.println(new String(arr));
				dos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}


import java.io.*;

class Dog implements Serializable
{
	private Collar theCollar;
	private int dogSize;

	public Dog(Collar collar, int size)
	{
		theCollar = collar;
		dogSize = size;
	}


	public Collar getCollar()
	{
		return theCollar;
	}



}

class Collar implements Serializable
{
	private int collarSize;
	public Collar(int size) { collarSize = size;}
	public int getCollarSize() { return collarSize; }
	public void setCollarSize(int collarS) { collarSize=collarS; }
	
}

public class SerializeDog
{

	public static void main(String[] args) 
	{
		Collar c = new Collar(3);
		Dog d= new Dog(c,8);

		System.out.println("creation:collar size is:"+d.getCollar().getCollarSize());

		d.getCollar().setCollarSize(8);
		System.out.println("before serializing:collar size is:"+d.getCollar().getCollarSize());
		try
		{
			FileOutputStream fs=new FileOutputStream("testSer.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}




		try
		{
			FileInputStream fin=new FileInputStream("testSer.ser");
			ObjectInputStream ois=new ObjectInputStream(fin);
			d = (Dog)ois.readObject();
			
			ois.close();
		}
		catch(Exception e)
		{  e.printStackTrace(); }

		System.out.println("after deserializing:collar size is:"+d.getCollar().getCollarSize());

	}
}

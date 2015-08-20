
import java.io.*;


class Dog implements Serializable
{
	transient private Collar theCollar;
	private int dogSize;

	public Dog(Collar collar, int size)
	{
		theCollar = collar;

        theCollar.setCollarSize(5); 
		dogSize = size;
	}


	public Collar getCollar()
	{
		return theCollar;
	}


	private void writeObject(ObjectOutputStream os) 
	{
		try
		{
			os.defaultWriteObject();
			System.out.println("before:"+theCollar.getCollarSize());
			os.writeInt(theCollar.getCollarSize());
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	private void readObject(ObjectInputStream is)
	{
		try
		{
			is.defaultReadObject();
			theCollar = new Collar(is.readInt());
			System.out.println("after:"+theCollar.getCollarSize());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Collar //implements Serializable
{
	private int collarSize;
	public Collar(int size) { collarSize = size;}
	public int getCollarSize() { return collarSize; }
	public void setCollarSize(int no) {collarSize=no;}
	
}

public class SerializeDog1
{

	public static void main(String[] args) 
	{
		Collar c = new Collar(13);
		Dog d= new Dog(c,8);

		System.out.println("before:collar size is:"+d.getCollar().getCollarSize());
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

		System.out.println("after:collar size is:"+d.getCollar().getCollarSize());

	}
}

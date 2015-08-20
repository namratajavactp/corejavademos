import java.util.*;
import java.io.*;
class Operator extends Thread
{
	Machine machine;
	Operator(Machine m)
	{
		machine=m;
	}
	

	public void run()
	{
		while(true)
		{
		//	System.out.println("inside opeartor run");
			String shape=getShapeFromUser();
		//	System.out.println("shape is:"+shape);
			
			Area A=calcArea(shape);
	//		System.out.println("Area is:"+A.area);

			machine.addJob(A);
		}
	}


	String getShapeFromUser()
	{
		byte b[]=new byte[80];

        try
		{
	//		System.out.print("\n Enter shape:");

			System.in.read(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 String name=new String(b);
	//	 System.out.println(name);
		return name;
	}



    class Area
    {
		double area;



		Area(double area)
		{
			this.area=area;
		}

		double getArea()
		{
			return area;
		}
	}

   Area calcArea(String s)
	{double area;

    //  System.out.println("insise calcArea "+s);
		if(s.trim().equals("square"))
			area = 3.142*2*2;
		else if(s.trim().equals("sphere"))
			area= 4*3.142*2*2;
		else if(s.trim().equals("triangle"))
			area=0.5*2*2;
		else
			area=0;

         System.out.println("area is"+area);
		return new Area(area);
	}
	
 
	public static void main(String[] args) 
	{  Machine machine=new Machine();
    	machine.start();
		Operator o=new Operator(machine);
		o.start();

	//	System.out.println("both threads started");
	}
}

class Machine extends Thread
{
List<Operator.Area> jobs=new ArrayList<Operator.Area>();

    public void addJob(Operator.Area A)
	{
		synchronized(jobs)
		{
			jobs.add(A);
			jobs.notify();
			System.out.println("element added");
		}
	}
	

	public void run()
	{
		while(true)
		{
			synchronized(jobs)
			{
				//wait until atleat one job is avail
				while(jobs.isEmpty())
				{
					try
					{
						System.out.println("waiting...");
						  jobs.wait();
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}

				Operator.Area a=jobs.remove(0);
				System.out.println("Area is "+a.getArea());
			}
		}
	}
}




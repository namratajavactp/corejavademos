import java.util.*;

class Empp
{
	int id;
	String name;

	Empp(int id,String name)
	{
		this.id=id;
		this.name=name;

	}
	public String toString()
	{
		return id+"  "+name;
	}
	public boolean equals(Object o)
	{return this.id==((Empp)o).id;
	}
};

class UseArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new Empp(1,"Ram"));
	
		System.out.println(al.size());
  System.out.println(al.get(0));

	System.out.println(al.contains(new Empp(1,"Ram")));
	//	System.out.println(al.remove(2));
	//	System.out.println(al.contains(18));


/*

Object[] bl;
  bl=al.toArray();
  for(Object i:bl)
	  System.out.println(i);


  */
	}
}

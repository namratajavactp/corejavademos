import java.util.*;

class Emp
{
	int id;
	String name;

	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;

	}
	public String toString()
	{
		return id+"  "+name;
	}
	public boolean(Object o)
	{return this.id==((Emp)o).id;
	}
};

class UseArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new Emp(1,"Ram"));
	
		System.out.println(al.size());
  System.out.println(al.get(0));

	System.out.println(al.contains(new Emp(1,"Ram")));
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

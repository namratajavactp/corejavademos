import java.util.*;
class UseHashMap1 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(new Emp(3,"bbb"),"OA");
		h.put(new Emp(2,"abb"),"LB");
		h.put(new Emp(7,"sss"),"YC");
		h.put(new Emp(1,"ffg"),"BNB");
		System.out.println(h.get(new Emp(7,"sss")));



		 Set s= h.keySet();
		 Iterator it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		Collection s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());


		 h.put(new Emp(7,"sss"),"RRR");

		   s= h.keySet();
		  it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 System.out.println(h.containsKey(new Emp(7,"sss")));
		System.out.println(h.containsValue("RRR"));

		

	}
}
class Emp implements Comparable
{
	int id;
	String name;

	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;

	}

	public int compareTo(Object o)
	{

		Emp e=(Emp)o;
		//return id - e.id;

		return e.id-id;

	}


	public boolean equals(Object o)
	{
		return id==((Emp)o).id;

	}

	public int hashCode()
	{
		return id;

	}


	public String toString()
	{	
		return "id = "+id+"  name = "+name;

	}
}
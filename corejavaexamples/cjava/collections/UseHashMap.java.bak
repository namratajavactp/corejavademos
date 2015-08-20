import java.util.*;
class UseHashMap 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put("a1",new Emp(3,"bbb"));
		h.put("a3",new Emp(2,"abb"));
		h.put("a2",new Emp(7,"sss"));
		h.put("a8",new Emp(1,"ffg"));
		System.out.println(h.get("a2"));



		 Set s= h.keySet();
		 Iterator it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		Collection s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());


		 h.put("a2",new Emp(17,"mmm"));

		   s= h.keySet();
		  it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 System.out.println(h.containsKey("a8"));
		System.out.println(h.containsValue(new Emp(17,"mmm")));

		

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

	/*public int hashCode()
	{
		return id;

	}*/


	public String toString()
	{	
		return "id = "+id+"  name = "+name;

	}
}
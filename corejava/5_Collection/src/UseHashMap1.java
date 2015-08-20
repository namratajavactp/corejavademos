import java.util.*;
class UseHashMap1 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(new Emp__(3,"bbb"),"OA");
		h.put(new Emp__(2,"abb"),"LB");
		h.put(new Emp__(7,"sss"),"YC");
		h.put(new Emp__(1,"ffg"),"BNB");
		System.out.println(h.get(new Emp__(7,"sss")));



		 Set s= h.keySet();
		 Iterator it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		Collection s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());


		 h.put(new Emp__(7,"sss"),"RRR");

		   s= h.keySet();
		  it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 System.out.println(h.containsKey(new Emp__(7,"sss")));
		System.out.println(h.containsValue("RRR"));

		

	}
}
class Emp__ implements Comparable
{
	int id;
	String name;

	Emp__(int id,String name)
	{
		this.id=id;
		this.name=name;

	}

	public int compareTo(Object o)
	{

		Emp__ e=(Emp__)o;
		//return id - e.id;

		return e.id-id;

	}


	public boolean equals(Object o)
	{
		return id==((Emp__)o).id;

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
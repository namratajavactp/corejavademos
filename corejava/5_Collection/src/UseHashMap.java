import java.util.*;
class UseHashMap 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put("a1",new Empl(3,"bbb"));
		h.put("a3",new Empl(2,"abb"));
		h.put("a2",new Empl(7,"sss"));
		h.put("a8",new Empl(1,"ffg"));
		System.out.println(h.get("a2"));



		 Set s= h.keySet();
		 Iterator it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		Collection s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());


		 h.put("a2",new Empl(17,"mmm"));

		   s= h.keySet();
		  it=s.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 s1= h.values();
		  it=s1.iterator();
		 while(it.hasNext())
			System.out.println(it.next());

		 System.out.println(h.containsKey("a8"));
		System.out.println(h.containsValue(new Empl(17,"mmm")));

		

	}
}
class Empl implements Comparable
{
	int id;
	String name;

	Empl(int id,String name)
	{
		this.id=id;
		this.name=name;

	}

	public int compareTo(Object o)
	{

		Empl e=(Empl)o;
		//return id - e.id;

		return e.id-id;

	}


	public boolean equals(Object o)
	{
		return id==((Empl)o).id;

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
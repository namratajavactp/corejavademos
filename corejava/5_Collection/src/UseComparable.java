
import java.util.*;
class UseComparable implements Comparator 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new UseComparable());
		t.add(new Emp(11,"nama"));
		t.add(new Emp(3,"shyam"));
		t.add(new Emp(1,"sheetal"));
		t.add(new Emp(8,"geeta"));
		Iterator it=t.iterator();
		while(it.hasNext())
		System.out.println(it.next());

	}

public int	compare(Object o,Object o1)
	{
	   return ((Emp)o).id-((Emp)o1).id;

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
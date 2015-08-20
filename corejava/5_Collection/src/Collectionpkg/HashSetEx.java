package Collectionpkg;
import java.util.*;

public class HashSetEx {
	
	public static void main(String[] args)
	{/*
		HashSet<Empdata> hs=new HashSet<Empdata>();
		
		hs.add(new Empdata(1,"ram",34000));
		hs.add(new Empdata(5,"sita",45000));
		hs.add(new Empdata(5,"sima",45000));
		hs.add(new Empdata(1,"Ram",34000));
		System.out.println(hs);
		
		
		System.out.println(hs.contains(new Empdata(5,"sima",85000)));
		
		System.out.println(hs.contains(new Empdata(5,"sheetal",45000)));
		
		
		System.out.println(hs.contains(new Empdata(6,"SRam",56000)));
		
		hs.add(new Empdata(1,"Ram",56000));
		System.out.println(hs);
		*/
		
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("def");
		t1.add("abc");
		t1.add("Abc");
		System.out.println(t1);
		
		
		TreeSet<Empdata> t=new TreeSet<Empdata>();
		t.add(new Empdata(1,"ram",34000));
		t.add(new Empdata(3,"fff",444));
		t.add(new Empdata(2,"abc",5666));
		System.out.println(t);
		
		
		TreeSet<Empdata> t11=new TreeSet<Empdata>(new xyz());
		t11.add(new Empdata(1,"ram",35000));
		t11.add(new Empdata(3,"fff",34000));
		t11.add(new Empdata(2,"abc",5666));
		System.out.println(t11);
		
		
		
	}
}
	class xyz implements Comparator<Empdata>
	{
		public int compare(Empdata t,Empdata t1)
		{
			
			return (int)(t1.salary - t.salary);
		}
		
	}





	



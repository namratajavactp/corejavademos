package Collectionpkg;
import java.util.*;

public class ArrayListEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empdata> s=new ArrayList<Empdata>();
		s.add(new Empdata(1,"nama",23000f));
		s.add(new Empdata(2,"sita",1200f));
		
/*		Empdata d=new Empdata(1,"nama",23000f);
		System.out.println(s.contains(d));
		System.out.println(s);   */
		
		Iterator<Empdata> i=s.iterator();    //
		while(i.hasNext())
		{
		  Empdata f=i.next();
		  System.out.println(f.computsalary());
		
		}
		
		
	}	

}

package Collectionpkg;
import java.util.*;

public class ArrayListEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList ob=new ArrayList();
		ob.add(4);
		ob.add(5);
		ob.add(2);
		System.out.println(ob);
		System.out.println(ob.contains(5));
		ob.remove(1);
		System.out.println(ob);
		
		int a=(Integer)ob.get(1);
		
		/* since you are not using generics your collections are
		unsafe i.e. compiler will not prohibit you from adding a wrong type */
		ob.add(new String("abc"));
		
		func(ob);
		
		
		//redo using generics and show how it is typesafe
		ArrayList<Integer> ob1=new ArrayList<Integer>();
		ob1.add(4);
		ob1.add(8);
	//	ob1.add(new String("hhh")); //  compiler will not allow you to add wrong type
		func1(ob1);

	}
	
	
	static void func(ArrayList o)
	{
	   int a=(Integer)o.get(2);
	   System.out.println(a);
	   
	   for(Object oo:o)
	   {
		   
		 Integer f=(Integer)oo;
		 f++;
		 System.out.println(f);
	   }
	}
	
	static void func1(ArrayList<Integer> o1)
	{
		int j=o1.get(1);  //no need of cast as return type will not be object but Integer type that you specified
		System.out.println(j);
		for(Integer i:o1)
		{
			i++;
			System.out.println(i);
		}
	}
	

}

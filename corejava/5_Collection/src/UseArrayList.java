import java.util.*;
class UseArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(4);
		al.add(7);
		al.add(18);
		al.add(7);
		System.out.println(al.size());
  System.out.println(al.get(2));

	System.out.println(al.contains(18));
		System.out.println(al.remove(2));
		System.out.println(al.contains(18));




Object[] bl;
  bl=al.toArray();
  for(Object i:bl)
	  System.out.println(i);


  
	}
}

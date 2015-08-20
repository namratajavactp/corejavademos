package Collectionpkg;
import java.util.*;

 class PriorityQueueEx {

	
	    public static void main(String[] args)
	    {
	   /* 	PriorityQueue<Empdata> e=new PriorityQueue<Empdata>();
	    	e.offer(new Empdata(4,"sita",5000));
	    	e.offer(new Empdata(1,"miata",2000));
	    	e.offer(new Empdata(3,"mina",1000));
	    	
	    	Empdata t=e.peek();
	    	
	    	System.out.println(t);
	    	System.out.println(e.size());
	    	
	    	e.offer(new Empdata(2,"nina",1500));
	    	
	    	System.out.println(e.size());
	    	
	    	do
	    	{
	    		Empdata h=e.poll();
	    		if(h==null)
	    			break;
	    		System.out.println(h);
	    	}while(true);
	    	
	    	
	    	
	    	System.out.println(e.size());
	    	
	    */
	    	
	    	PriorityQueue<Integer> e=new PriorityQueue<Integer>();
	    	e.offer(2);
	    	e.offer(5);
	    	e.offer(3)
	    	;
	    	
	    	Empdata t=e.peek();
	    	
	    	System.out.println(t);
	    	System.out.println(e.size());
	    	
	    	e.offer(new Empdata(2,"nina",1500));
	    	
	    	System.out.println(e.size());
	    	
	    	do
	    	{
	    		Empdata h=e.poll();
	    		if(h==null)
	    			break;
	    		System.out.println(h);
	    	}while(true);
	    	
	    	
	    	
	    	System.out.println(e.size());
	    	
	    	
	    	
	    	
	    }
}
 
 class IInteger implements Comparator<Integer>
 {
	 public int compare(Integer i,Integer j)
	 {
		 return -1;
	 }
	 
 }

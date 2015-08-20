package Collectionpkg;
import java.util.*;

public class MapEx {
	
	public static void main(String[] args)
	{/*
       HashMap<Integer,String> ob=new HashMap<Integer,String>();
       ob.put(1, "abc");
       ob.put(2,"nita");
       ob.put(12,"hjh");

        String s=ob.get(2);
        System.out.println(s);
        System.out.println(ob);
       
         ob.remove(2);
         System.out.println(ob);
         
         System.out.println(ob.containsKey(2));
         ob.put(12,"sita");
         System.out.println(ob);
         
         */
         
         HashMap<Empdata,Integer> ob1=new HashMap<Empdata,Integer>();
         ob1.put(new Empdata(1,"Ram",2000), 11);
         ob1.put(new Empdata(1,"Rita",2000),45);
         ob1.put(new Empdata(12,"hjh",8000),89);
         System.out.println(ob1);

          Integer b=ob1.get(new Empdata(1,"Ram",2000));
          System.out.println(b);
          System.out.println(ob1);
         
           ob1.remove(new Empdata(1,"Rama",6777));
           System.out.println(ob1);
           
           System.out.println(ob1.containsKey(new Empdata(12,"hkk",4999)));
           ob1.put(new Empdata(1,"Ram",2000),12);           
           System.out.println(ob1);
           
         
	}

}

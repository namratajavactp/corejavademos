import java.util.*;
class treeset{
public static void main(String args[]){
TreeSet<String> t1 = new TreeSet<String>();	//create  a Treeset object

t1.add("One");
t1.add("Two");
t1.add("Three");
t1.add("Four");
t1.add("Five");

System.out.println("Contents of treeset");

Iterator it1 = t1.iterator();  		//obtaining iterator object
      while(it1.hasNext()){		// to iterate thru collection.
      Object o1=it1.next();
      System.out.print(o1+"\t");       }   } }

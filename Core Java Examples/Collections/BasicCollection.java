import java.util.*;
   
   public class BasicCollection {
     public static void main(String args[]) {
       ArrayList list = new ArrayList();
       list.add( new String("One") );
       list.add( new String("Two") );
       list.add( new String("Three") );
       
   
       
       Iterator itr = list.iterator();
       while( itr.hasNext() ) {
         String str = (String)itr.next();
         System.out.println( str );
       }
     }
   }

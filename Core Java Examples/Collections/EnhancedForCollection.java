import java.util.*;
   
   public class EnhancedForCollection {
     public static void main(String args[]) {
       ArrayList<String> list = new ArrayList<String>();
   
       list.add( new String("One") );
       list.add( new String("Two") );
       list.add( new String("Three") );
  
       //list.add( new StringBuffer() );
   
       for( String str : list  ) {
         System.out.println( str );
       }
     }
   }
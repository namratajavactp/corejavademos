
public class Miscellaneous {
  public static void main(String[] args)
  {
	  Integer a=5;  //auto boxing
	  double d=a.doubleValue();
	  
	  System.out.println(d);
	  
	  a++;  //its unboxing first then incrementing it and then boxing it
	  
	  
	  System.out.println(a);
	  
	  
	  int[] arr={5,3,4,6};
	  
	  for(int b:arr)
	  {
		  System.out.println(b);
		  
	  }
	  
  }
}

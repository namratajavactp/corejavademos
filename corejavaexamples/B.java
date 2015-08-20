
package def;
import abc.*;
class B extends A1
{int b;
   B()
	{b=7;}


   int calc()
	{
      
	   return b*a;
   
     }
	public static void main(String[] args) 
	{B oo=new B();
		System.out.println(oo.calc());
	}
}

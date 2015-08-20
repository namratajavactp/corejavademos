
public class A {
protected int a=5;
}
class B extends A
{
	 int a=3;
	void def()
	{
		System.out.println(a);
	}
}

class C extends B
{
	void fff()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		
	}
}

interface abc
{
	void ff();
}
interface def
{
   void fg();
   void ff();
}

class V implements abc,def
{
	public void fg(){}
	public void ff(){}
}
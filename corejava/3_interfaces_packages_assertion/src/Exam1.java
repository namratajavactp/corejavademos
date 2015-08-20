
	class A
	{
	int a=5;

	void abc()
	{
	   System.out.println("a");
	}
		      }

			class C extends A {}

	                  class B extends A
	                 {
			void abc()
	{
	System.out.println(“a”);

	}

	void def()
	{
	          System.out.println(“b”);
	}

	public static void main(String[] args)
	{
	     A ob=new C();
	   ((B) ob).def();
	    ob.abc();
	}
		     }




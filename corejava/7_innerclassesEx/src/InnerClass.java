class Outer 
{
	private int i;
	Outer()
	{
		i=5;
	}
	class Inner
	{
		int j;
		Inner()
		{
			j=7;
		}

		void abc()
		{
			System.out.println(i+j);

		}

	}

	public static void main(String[] args) 
	{

		Outer o=new Outer();
		o.j;
		Outer.Inner oi= o.new Inner();
		oi.abc(); 

		Outer.Inner oii=new Outer().new Inner();
		oii.abc();



	}

	
}

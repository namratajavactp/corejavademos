class ExceptionEx 
{
	public static void main(String[] args) 
	{

		try
		{
		A s=null;
		s.abc();
		System.out.println("will this be executed?");
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
		System.out.println("hi kkkkk");


	}
}
class A
{
	void abc()
	{
		System.out.println("Hello");
	}
};

class NewForArray
{
	public static void main(String args[])
	{
		int j=0;
		int[] squares={0,1,4,9,16,25};
		for(int i:squares)
		{
			System.out.println("The square of "+(j++)+" is "+i);
		}
	}
}
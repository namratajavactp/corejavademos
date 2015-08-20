
public class AssertionEx { 
	public static void main(String[] args)
	{
		//some logic generating a value say i=some value
		int i=31;
		
		abc(i);
	}
	
	private static void abc(int i)
	{   //according to you i's value will always be between 0 to 4 
		assert(i>0&&i<4):"mistake the calculation is generating i value outside 0 to 4 range";
		
		i=i-1;
		switch(i)
		{
		case 0:
		    i++;
		    System.out.println(i);
		    break;
		case 1:
			break;
		case 2:
			break;
		default:
			assert false;
			i=i++;
			System.out.println("i="+i);
		
		}
		
	}

}

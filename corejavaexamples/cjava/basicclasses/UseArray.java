class UseArrays 
{
	public static void main(String[] args) 
	{
		int[] x=new int[5];
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);


		int[] y=new int[]{2,3,4,7};
		for(int i:
			y)
			System.out.println(i);

		int[] t={5,8,9,4};


		int[][] ob=new int[3][];
		ob[0]=new int[2];
		ob[1]=new int[3];
		ob[2]=new int[4];

		for(int i=0;i<ob.length;i++)
			for(int j=0;j<ob[i].length;j++)
			  System.out.println(ob[i][j]);

		for(int[] a:ob)
			for(int b:a)
			  System.out.println(b);

	}
}

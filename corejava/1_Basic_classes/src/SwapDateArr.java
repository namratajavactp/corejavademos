class SwapDate 
{
	
	public static void main(String[] args) 
	{
	
	Mydate[] arr=new Mydate[2];
	Mydate d1=new Mydate(1,2,3);
	Mydate d2=new Mydate(4,5,6);
	arr[0]=d1;
	arr[1]=d2;

	for(int i=0;i<arr.length;i++)
		arr[i].display();
	swap(arr);
	System.out.println("after swapping through array");
	for(int i=0;i<arr.length;i++)
		arr[i].display();
	}

	public static void swap(Mydate[] arr)
	{
		Mydate temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;

	}
}



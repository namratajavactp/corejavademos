class Swap 
{
	public static void main(String[] args) 
	{  
	 Mydate d1=new Mydate(1,2,3);
	 Mydate d2=new Mydate(4,5,6);


d1.display();
	     

d2.display();
	swap(d1,d2);
	System.out.println(" after swapping");
	d1.display();
	d2.display();
}
public static void swap(Mydate a,Mydate b)
	{
	Mydate temp=a;
	a=b;
	b=temp;
	}
}


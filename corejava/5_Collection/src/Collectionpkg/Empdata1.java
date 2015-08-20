package Collectionpkg;
class  Empdata implements Comparable<Empdata>
{
	int empid;
	String name;
	float salary;
	
		
	 Empdata(int e, String n, float s)
	{
		 this.empid=e;
		 this.name=n;
		 this.salary=s;
	}
	float computsalary()
	{
		return(salary);
	}
	
	public int compareTo(Empdata o)
	{
		return (int)(this.salary - o.salary);
		
	}

	 public String toString()
	 {
		return "name:"+name+",empid:"+empid+",Salary:"+salary;
		 
	 }
	 
	 public boolean equals(Object o)
	 {
		 
		 Empdata e=(Empdata)o;
		 return (this.empid==e.empid) && (this.name.equals(e.name));
		 
	 }
	 
	 public int hashCode()
	 {
		 return empid + name.charAt(0);
	 }
	

	public static void main(String[] args) 
	{
		Empdata a1=new Empdata(2,"sam",2000);
		
		System.out.println(a1);   //s.o.p(a1.toString())
		
		Empdata a2=new Empdata(3,"namrata",2000);
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	    
		Empdata a3=new Empdata(2,"sam",2000);
		System.out.println(a1.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a1.hashCode()==a3.hashCode());
		
		System.out.println(a1.hashCode()==a2.hashCode());
		
	}
}

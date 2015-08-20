class  Empdata
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
	
	
	 
	 public String toString()
	 {
		return "oveeriden toString meth:name:"+name+",empid:"+empid+",Salary:"+salary;
		 
	 }
	 
	 public boolean equals(Object o)
	 {
		 
		 Empdata e=(Empdata)o;
		 return (this.empid==e.empid) && (this.name.equals(e.name));
		 
	 }
	 
	

	public static void main(String[] args) 
	{
		Empdata a1=new Empdata(2,"sam",2000);
		
		System.out.println(a1);   //s.o.p(a1.toString())
		
		Empdata a2=new Empdata(2,"namrata",2000);
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		
	}
}

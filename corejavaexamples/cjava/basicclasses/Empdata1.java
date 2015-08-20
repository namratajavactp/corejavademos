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
	 void display()
	{
		 System.out.println("name:"+name+",empid:"+empid+",Salary:"+salary);
		
	}

	public static void main(String[] args) 
	{
		Empdata a1=new Empdata(2,"sam",2000);
		a1.display();
		
	}
}

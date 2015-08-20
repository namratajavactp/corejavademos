class  Emp
{
	int empid;
	String name;
	double salary;


	Emp(){}
	 Emp(Emp e)
	{
		 this.empid=e.empid;
		 this.name=e.name;
		 this.salary=e.salary;
	}
		
	 Emp(int e, String n, double s)
	{
		 this.empid=e;
		 this.name=n;
		 this.salary=s;
	}
	double computsalary()
	{
		return(salary);
	}
	 void display()
	{
		 System.out.println("name:"+name+",empid:"+empid+",Salary:"+salary);
		
	}

double computsalary(int noofmonths)
	{
		return(salary*noofmonths);
	}
	public static void main(String[] args) 
	{
		Emp a1=new Emp(2,"sam",2000);
		a1.display();


		Emp a2=new Emp(a1);
		a2.display();
		double s=a2.computsalary(6);
		System.out.println("salary for 6 months is:"+s);
		s=a2.computsalary();
		System.out.println("salary for 1 month is:"+s);


		Manager m=new Manager(2,"Ram",50000,12000,80000);
		m.display();
		m.delegate();
		
	}

}

class Manager extends Emp
{

   double incentive;
   double target;

   Manager(int id,String n,double s,double i,double tar)
	{
	   super(id,n,s);
		incentive=i;
		target=tar;

	}

   void delegate()
   {
	   System.out.println("delegate the work to subbordinates"); 
	}

void display()
	{
		 
		super.display();
		System.out.println("incentive:"+incentive+" Target:"+target);
	}

}

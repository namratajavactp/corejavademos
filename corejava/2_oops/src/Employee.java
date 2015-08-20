
public class Employee {
     private  int empId;
      private String empName;
      private String empSurname;
      private double empSal;
      
      Employee(int idd,String n,String su,double s)
      { empId=idd;
        empName=n;
        empSurname=su;
        empSal=s;
    	  
      }
      
    /*  Employee()
      {
    	  
      }
      */
      
      
      
      
      
      public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSurname() {
		return empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		
		if(empSal>0)
		this.empSal = empSal;
		else
			System.out.println("enter valid sal");
	}

	public int getEmpId() {
		return empId;
	}

	void signIn()
      {
    	  System.out.println("emp"+empName+"has signed in");
      }
      
      double computeAnnualSal()
      {
    	  return empSal*12;
      }
      
      double computeAnnualSal(double bonus)
      {
    	 return empSal*12+bonus; 
      }
      
      
      void displayEmp()
      {
    	  System.out.println("Emp name:"+empName
    			  			+"Emp Surname:"+empSurname
    			  			+"Emp id:"+empId
    			  			+"Emp Sal:"+empSal);
    			  				
    	  
      }
}
class UseEmp
{
	public static void main(String[] args)
	{
/*		
		Employee e=new Employee();
		e.signIn();
		double s=e.computeAnnualSal();
		System.out.println("ann sal="+s);
	
		Employee e1=new Employee(1,"Ram","Sharma",40000);
		e1.displayEmp();
		
		e1.signIn();
		
		Employee e2=new Employee(2,"lata","Sharma",60000);
		
		
		double s1=e1.computeAnnualSal();
		System.out.println("ann sal of "+(e1.getEmpName())+"is="+s1);
		
		e1.setEmpSal(60000);
		e1.displayEmp();
		
		e1.setEmpSal(-300);
		e1.displayEmp();
		System.out.println("company decided to give bonus:");
		double ss=e1.computeAnnualSal(3000);
		System.out.println("Ann sal with bonus:"+ss);
		
		*/
		
		Manager m=new Manager(2,"Shyam"," Gupta",60000,"Sales",10,5000);
		m.signIn();
		m.delegate();
		System.out.println(m.getEmpSal()+m.getComm());
		m.displayEmp();
		
		
		Employee em=new Manager(3,"Nitin"," Gupta",60000,"Marketing",10,5000);
		em.displayEmp();
		((Manager)em).delegate(); //change the compile  time type of ref em
		

		
	}
}
      


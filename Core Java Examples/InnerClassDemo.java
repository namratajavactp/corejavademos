public class Employee {
    public Employee()
    { }

    // Variable of the Employee class
    int emp_code = 58170;

   // Define an inner class
    class DOB{
        int day = 12;
        int month =2;
        int year = 9;

        void display() {
		//Variable of Employee class
        	  	System.out.println("Employee Code :"+emp_code);                          
		System.out.println("Date of Birth : " +day+"/"+month+"/"+year);

        }
    }

}
public class InnerClassDemo {
    public InnerClassDemo()
    { }
    public static void main(String[] args) {

       Employee emp = new Employee();

        // Create an object instance of an inner class.
        Employee.DOB date = emp.new DOB();

       System.out.println("Employee Code : " + emp.emp_code);
        System.out.println("Year of Birth : " + date.year);

        // Method of Inner Class
        date.display();
    }

}

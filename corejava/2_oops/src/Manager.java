
public class Manager extends Employee{
	private String type;
	private int noOfSub;
	private double comm;
	
	
	Manager(int idd,String n,String su,double s,String type,int noOfSub,double comm)
	{
		super(idd,n,su,s);
		this.type=type;
		this.noOfSub=noOfSub;
		this.comm=comm;
	}
	
	
	
	
	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public int getNoOfSub() {
		return noOfSub;
	}




	public void setNoOfSub(int noOfSub) {
		this.noOfSub = noOfSub;
	}




	public double getComm() {
		return comm;
	}




	public void setComm(double comm) {
		this.comm = comm;
	}




	void delegate()
	{
     System.out.println("Employee "+getEmpName()
    +" delegates to"+noOfSub+" subbordinates");		
		
	}
	
	//function overriding
	void displayEmp()
	{   super.displayEmp();
		System.out.println("type"+type+
							"noofsub:"+noOfSub+
							"comm:"+comm);
	}
}

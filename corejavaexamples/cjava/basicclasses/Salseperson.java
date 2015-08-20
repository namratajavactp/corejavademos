class Salseperson extends  Empdata
{
	float msalse;
	float mcomm;
	Salseperson(int salse,int comm,int e, String n, float s )
	{
		super(e,n,s);
		msalse=salse;
		mcomm=comm;
	}
	float computsalary()
	{
		return(super.computsalary()+msalse*mcomm);
	}
	public static void main(String[] args) 
	{
		Salseperson sp=new Salseperson(200,20,3,"abc",2);
		float cs;
		cs=sp.computsalary();
		System.out.println(cs);
	}
}

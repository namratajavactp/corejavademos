class Wageemployee extends Empdata 
{
	int mhrs;
		int mrate;
		Wageemployee(int hr,int rate,int e, String n, float s)
	{
			super(e,n,s);
         mhrs=hr;
		 mrate=rate;
	}
		float computsalary()
	{
			return(super.computsalary()+(mhrs*mrate));
	}
	public static void main(String[] args) 
	{
		float d,d1;
		Wageemployee w=new Wageemployee(10,100,20,"abc",2000);
		d=w.computsalary();
		System.out.println(d);
		Empdata e1= w;
		d1=e1.computsalary();
		System.out.println(d1);
		Salseperson s=new Salseperson(200,20,3,"abc",2);
         d=s.computsalary();
	     System.out.println(s);
		 e1=s;
		 d1=e1.computsalary();
	     System.out.println(d1);
	}
}

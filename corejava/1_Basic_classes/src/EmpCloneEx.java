
class Datee
{
  int dd,mm,yy;
   Datee(int dd,int mm,int yy)
   {
	   this.dd=dd;
	   this.mm=mm;
	   this.yy=yy;
	   
   }
   
   
   public Object clone() throws CloneNotSupportedException
	{
	   Datee d=new Datee(dd,mm,yy);
		return d;
	}
   
   public String toString()
   {
	   return dd+"/"+mm+"/"+yy;
   }
}
class Emp
{
	int id;
	Datee joindate;
	
	Emp(int id,Datee d)
	{
		this.id=id;
		joindate=new Datee(d.dd,d.mm,d.yy);
		
	}
	public String toString()
	{
		return "id:"+id+"joindate"+super.toString();
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return new Emp(id,(Datee)joindate.clone());
	}
	
}
public class EmpCloneEx {

	
	public static void main(String[] args) throws Exception
	{
		Emp e=new Emp(1,new Datee(1,1,1));
			System.out.println(e);
		
			Emp e1=(Emp)e.clone();
			System.out.println(e1);
			
			e1.joindate.dd=9;
			
				System.out.println(e1);
				
				System.out.println(e);
				
				Emp ee=e;
				
				
				
	}
	
}

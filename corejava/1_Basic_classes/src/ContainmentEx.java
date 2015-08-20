class Date1
{
	int dd,mm,yy;
	   Date1(int dd,int mm,int yy)
	   {
		   this.dd=dd;
		   this.mm=mm;
		   this.yy=yy;
		   
	   }
	   
	   void addMonth(int i)
	   {
		   mm+=i;
		   
	   }
	  
	   
	   public String toString()
	   {
		   return dd+"/"+mm+"/"+yy;
	   }
}
class Empp
{
	private int id;
	private Date1 joindate;
	
	Empp(int id,Date1 d)
	{
		this.id=id;
		joindate=new Date1(d.dd,d.mm,d.yy);
		//joindate=d;
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date1 getJoindate() {
		return joindate;
	}


	public void setJoindate(Date1 joindate) {
		this.joindate = joindate;
	}


	public String toString()
	{
		return "id:"+id+"\n joindate:"+joindate.toString();
		
	}
}
public class ContainmentEx {
  public static void main(String[] args)
  {
	    Date1 d1=new Date1(24,8,2010);
	  Empp e=new Empp(1,d1);
	  System.out.println(e);
	  
	  e.getJoindate().addMonth(2);
	  
	  System.out.println(e);

/*
	  System.out.println("d1="+d1);
	  
	  d1.addMonth(3);
	  System.out.println(d1);
	  
	  System.out.println(e);
*/	  
  }
  
}

abstract class Shape
{
	int side1,side2;
	
	Shape(int side1)
	{
		this.side1=side1;
	}
	
	Shape(int side1,int side2)
	{
		this.side1=side1;
		this.side2=side2;
	}
	abstract long pm();
	
	abstract long area();

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}
	
	
}
class Square extends Shape
{int diag1;



    Square(int side1,int diag1)
    {
    	super(side1);
    	this.diag1=diag1;
    }
	long pm()
	{
		return 4*side1;
	}
	
	long area()
	{
		return side1*side1;
	}

	public int getDiag1() {
		return diag1;
	}

	public void setDiag1(int diag1) {
		this.diag1 = diag1;
	}

		
}	

public class AbstractClasses {
   public static void main(String[] args)
   {
	  // Shape ob=new Shape();
	   
	   Square s=new Square(4,3);
	   System.out.println(s.area());
	   System.out.println(s.pm());
	   
	   Shape sh=new Square(5,3);
	   System.out.println(sh.area());
	   
	   //sh=new Rectangle(3,3);
	   
	   
   }
}

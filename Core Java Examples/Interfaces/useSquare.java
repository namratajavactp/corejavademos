
public class useSquare {
	public static void main(String args[]){
		Square s1=new Square();
		s1.area(10, 10);
		Square s2=new Square();
		
		//Reference variable of an interface
		Shape sh1;
		sh1=s2;
		sh1.circumference(10,10);		
	}
}

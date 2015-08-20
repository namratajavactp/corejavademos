
public class Square implements Shape {
	public void area(int l,int b){
		System.out.println("Area:"+(l*b));
	}
	public void circumference(int l, int b) {
		System.out.println("circumference:"+(2*(l+b)));
		
	}	
}
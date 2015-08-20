
public class StaticCode {
	static int counter=0;
	static{
		counter++;
		System.out.println("Static Block - counter ="+counter);	
	}
	StaticCode(){
		System.out.println("counter ="+counter);
	}	
}

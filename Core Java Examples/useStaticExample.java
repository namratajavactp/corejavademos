
public class useStaticExample {
	public static void main(String[] args){
		StaticExample s1=new StaticExample();
		StaticExample s2=new StaticExample();
		System.out.println("Counter:"+s1.counter);
		System.out.println("Counter:"+s2.counter);
		System.out.println("Count:"+s1.count);
		System.out.println("Count:"+s2.count);
		StaticExample.counter=10;
		System.out.println("Counter:"+s2.counter);
	}
}

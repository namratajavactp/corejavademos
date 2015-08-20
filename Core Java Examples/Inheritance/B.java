class A {
  int x;
  int y;
  int get(int p, int q){
    x=p; y=q; return(0);
    }
    void Show(){
      System.out.println(x);
      }
}
class subclass extends A{
	void display(){
	      Show();
	      System.out.println("B");
	      }
}
class B {
  public static void main(String args[]){
	  subclass sb=new subclass();
	  sb.get(10,20);
	  sb.display();
    }
    
} 


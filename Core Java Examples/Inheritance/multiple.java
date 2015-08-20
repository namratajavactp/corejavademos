class A {
  int x;
  int y;
  A(){
	  x=10;
	  y=20;
  }
  A(int p,int q){
	  x=p;
	  y=q;
  }
  int get(int p, int q){
    x=p; y=q; return(0);
    }
  int getX(){
	  return x;
  }
  int getY(){
	  return y;
  }
    void Show(){
      System.out.println("x="+x+"  y="+y);
      }
}
class subclass extends A{
	subclass(int v1,int v2){
		super(v1, v2);
	}
	int area(){
		return getX()*getY();
	}
	void display(){
		  Show();
	      System.out.println("Area :"+area());
	}
}
class C extends subclass{
	C(int v1,int v2){
		super(v1,v2);
	}
	void display(){
		super.display();
	}
}
class multiple {
  public static void main(String args[]){
	  C c =new C(10,20);
	//  c.get(10,20);
	  c.display();
    }
    
} 


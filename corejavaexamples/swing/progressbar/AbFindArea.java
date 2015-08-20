//Dynamic Method Dispatch :- Run-time Polymorphism
//Overriden methods in java are similar to virtual functions in C++ 
//Abstrac class and abstract method   :same as pure virtual functions in C++
abstract class Figure {

   double dim1;
   double dim2;


   Figure(double a,double b)
   {
       dim1=a;
       dim2=b;
    }

  abstract double area(); 

  }//end of class Figure

class Rectangle extends Figure {

  Rectangle(double a,double b)
  {
      super(a,b);
   }

//has to overid area for rectangle
  double area() {
       
       System.out.println("Inside Area of Rectangle");
       return dim1 * dim2;
    }
  }//end of class Rectangle

class Triangle extends Figure {

  Triangle(double a,double b)
  {
      super(a,b);
   }

 //override area for triangle
  double area()
  {
     System.out.println("Inside Area of Triangle");
     return dim1 * dim2 / 2;
  }

}

class AbFindArea {
public static void main(String args[])
{
   // Figure f=new Figure(10,10);              being abstract class it cannot be instantiated
    Rectangle r=new Rectangle(9,5);
    Triangle t=new Triangle(10,8);
    
    Figure figref;             //Obtain a refrence of type Figure
    figref = r;                  //figref refers to an object of type Rectangle
    System.out.println("Area of Rectangle is : " + figref.area());             //calls Rectangle's version of area
    
    figref = t;                 //figref refers to an object of type Triangle
    System.out.println("Area of Triangle is : " + figref.area());             //calls Triangle's version of area

 }
}




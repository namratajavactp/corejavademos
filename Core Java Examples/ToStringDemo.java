// Override toString() for Box class.
class Box1 {
  double width;
  double height;
  double depth;

  Box1(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
 
  public String toString() {
    return "Dimensions are " + width + " by " + 
            depth + " by " + height + ".";
   }
}

class ToStringDemo {
   public static void main(String args[]) {
         Box1 b = new Box1(10, 12, 14);
      // concatenate Box object by calling toString() method on box object.
      String s = "Box b: " + b; 

      // concatenate Box object by calling toString() method on box object.
      System.out.println(b); // convert Box to string
      System.out.println(s);
   }
}

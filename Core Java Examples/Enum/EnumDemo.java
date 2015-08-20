enum Apple { 
  A(10), B(9), C, D(15), E(8) ; 
 
  private int price; // price of each apple 
 
  // Constructor 
  Apple(int p) { price = p; } 
 
  // Overloaded constructor 
  Apple() { price = -1; } 
 
  int getPrice() { return price; } 
}
 
public class EnumDemo { 
  public static void main(String args[])  
  { 
    Apple ap; 
 
    ap = Apple.C; 
 
    // Output an enum value. 
    System.out.println("Value of ap: " + ap.getPrice()); 
    System.out.println(); 
 
    ap = Apple.B;
    
 
    // Compare two enum values. 
    if(ap == Apple.B)  
      System.out.println("ap conatins :"+ap.getPrice()); 
 
    // Use an enum to control a switch statement. 
    switch(ap) { 
      case A: 
        System.out.println("A is 10."); 
        break; 
      case B: 
        System.out.println("B is 9."); 
        break; 
      case C:  
        System.out.println("C is 0."); 
        break; 
      case D: 
        System.out.println("D is 15."); 
        break; 
      case E: 
        System.out.println("E is 8."); 
        break; 
    }
    
    System.out.println("Here are all Apple constants"); 
    
    // use values() 
    Apple allapples[] = Apple.values(); 
    for(Apple a : allapples) 
      System.out.println(a); 
 
    System.out.println("All apple prices:");
    for (Apple a : Apple.values())
      System.out.println(a + " costs " + a.getPrice() + " cents.- Ordinal Value:"+a.ordinal());
  
    Apple ap1, ap2, ap3;
    ap1 =  Apple.A; 
    ap2 = Apple.B; 
    ap3 = Apple.C; 
 
    System.out.println(); 
 
    // Demonstrate compareTo() and equals() 
    if(ap1.compareTo(ap2) < 0) 
      System.out.println(ap1 + " comes before " + ap2); 
 
    if(ap1.compareTo(ap2) > 0) 
      System.out.println(ap2 + " comes before " + ap); 
 
    if(ap1.compareTo(ap3) == 0) 
      System.out.println(ap1 + " equals " + ap3); 
   
    System.out.println(); 
 
    if(ap1.equals(ap2)) 
      System.out.println(ap1 + " equals " + ap2); 
 
    if(ap1.equals(ap3)) 
      System.out.println(ap1 + " equals " + ap3); 
 
    if(ap1 == ap3) 
      System.out.println(ap1 + " == " + ap3); 

  } 
}

import java.util.Scanner;


public class ScannerInput {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your name");
System.out.println("Your name is "+s.nextLine());
System.out.println("Enter your age");
System.out.println("Your age is "+s.nextInt());
System.out.println("Enter your Salary");
System.out.println("Your Salary is "+s.nextDouble());

}
}
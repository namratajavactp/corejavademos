import java.util.*; 

class Printer{
  public void print(String s){
   for(int i = 0; i < s.length(); i++){
    System.out.print(s.charAt(i)); 
  }
 }
}
class ReversePrinter extends Printer{
  public void print(String s){
   for(int i = s.length() - 1 ; i >= 0; i--){
    System.out.print(s.charAt(i)); 
  }
 }
}
public class G{
 public static void main(String[] args){
   String s = "Nothing like a good cup of Java in the morning!"; 
   List<Printer> l = new ArrayList<Printer>();
   l.add(new Printer());
   printElements(l,s); 
   List<ReversePrinter> rl = new ArrayList<ReversePrinter>(); 
   rl.add(new ReversePrinter()); 
   printElements(rl,s);
  }
  public static void printElements(List<? extends Printer> l, String s){
    Printer printer = l.get(0); 
    printer.print(s); 
    System.out.println();
 }
}


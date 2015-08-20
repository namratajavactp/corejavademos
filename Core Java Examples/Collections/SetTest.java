
import java.util.*;
class SetTest {
public static void main(String[] args) {
boolean[] ba = new boolean[5];
Set<Integer> s = new HashSet<Integer>();
ba[0] = s.add(1);
ba[1] = s.add(2);
ba[2] = s.add(3);
ba[3] = s.add(4);
ba[4] = s.add(5);

for(Integer o : s)
System.out.print(o + " ");
}
}
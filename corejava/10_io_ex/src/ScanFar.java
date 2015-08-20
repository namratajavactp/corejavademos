import java.io.*;
import java.util.*;

public class ScanFar {
    public static void main(String[] args) throws IOException {
        Scanner s = 
            new Scanner(new BufferedReader(new FileReader("farrago.txt")));

        while (s.hasNext()) {
            System.out.println(s.next());
        }
        s.close();
    }
}


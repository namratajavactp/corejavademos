import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
//        File inputFile = new File("farrago.txt");
  //      File outputFile = new File("outagain.txt");

        FileInputStream in = new FileInputStream("input.java");
        FileOutputStream out = new FileOutputStream("out.java");
        int c;

        while ((c = in.read()) != -1)
           out.write(c);

        in.close();
        out.close();
		
        
		in = new FileInputStream("out.java");
        while ((c = in.read()) != -1)
          System.out.print((char)c);

        in.close();
       
		
    }
}



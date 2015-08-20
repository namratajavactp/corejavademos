import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
//        File inputFile = new File("farrago.txt");
  //      File outputFile = new File("outagain.txt");

        FileInputStream in = new FileInputStream("nama.java");
        FileOutputStream out = new FileOutputStream("namaout.java");
        int c;

        while ((c = in.read()) != -1)
           out.write(c);

        in.close();
        out.close();
		
        
		in = new FileInputStream("namaout.java");
        while ((c = in.read()) != -1)
          System.out.print((char)c);

        in.close();
       
		
    }
}



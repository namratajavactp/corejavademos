import java.io.*;

public class FileTest {
  public static void main(String args[]) {
    File f = new File("MyFile.txt");
    System.out.println
      (f + (f.exists()? " is found " : " is missing "));
    System.out.println
    (f + "is physically located at "+f.getAbsoluteFile());
    System.out.println
    (f + "was last modified at "+f.lastModified());
    System.out.println
    (f + "is "+f.length()+" bytes long");
    System.out.println
    (f + (f.canRead()? " is readable " : " is not readable "));
  }
}







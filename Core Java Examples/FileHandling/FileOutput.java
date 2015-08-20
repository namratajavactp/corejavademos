
import java.io.*;

public class FileOutput {

  public static void main(String[] args) {

    FileOutputStream fos; 
    DataOutputStream dos;

    try {

      File file= new File("MyFileout.txt");
      fos = new FileOutputStream(file);
      dos=new DataOutputStream(fos);
      dos.writeInt(2333);
      dos.writeChars("Hello");

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

} 

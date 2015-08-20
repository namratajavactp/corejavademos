import java.io.*;
public class SerilizationEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
        Empdata e=new Empdata(1,"ram",3000);
        
        e.salary+=1000;
        System.out.println("Emplyee before serializing:"+e);
        
        File f=new File("abc.ser");
        //f.createNewFile();
        FileOutputStream fo=new FileOutputStream(f);
        ObjectOutputStream o=new ObjectOutputStream(fo );
        o.writeObject(e);
        
        e.name="shyam";
        e.salary=0;
        System.out.println(e);
        
        
        FileInputStream fi=new FileInputStream(f);
        ObjectInputStream oi=new ObjectInputStream(fi);
             Empdata e1=(Empdata)oi.readObject();
             System.out.println(e1);
                     
        
        
	}

}

import java.sql.*;
import java.io.*;
class BlobDemo 
{
	public static void main(String[] args) 
	{
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@saraswati:1521:oracle10g","scott","tiger");
			  
			 System.out.println("Driver Loaded");
			 
			 System.out.println("Connection received");

			 FileInputStream fin = new FileInputStream(new File("web.GIF"));
			 FileOutputStream fout = new FileOutputStream(new File("world.GIF"));
			 InputStream dout=null;
			 
			 PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
			 System.out.println(pstmt);
			 pstmt.setInt(1,113);
			 pstmt.setString(2,"Sonali");
			 pstmt.setBinaryStream(3,fin,fin.available());
			int rs1= pstmt.executeUpdate();
			 System.out.println(rs1);
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from employee");
			 while(rs.next())
				{
				 int no=rs.getInt(1);
				 System.out.println(rs.getInt(1)+"  "+rs.getString(2));
				 if(no==113)
					{
						dout = rs.getBinaryStream(3);
					}
				}
			int i=1;
			i=dout.read();
			while(i!=-1)
			{
				fout.write(i);
				i=dout.read();

			}

			  rs.close();
			  con.close();
 		 }
		 catch(Exception ce)
		  {
			 ce.printStackTrace();
			 System.out.println(ce);
		  }
		   
	}
}

import java.sql.*;
import javax.sql.*;
import java.io.*;
class SResultsetDemo
{
	public static void main(String[] args) 
	{Connection con=null;
		 try{

			 
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		 con=DriverManager.getConnection("jdbc:odbc:nama");
		
		
		
		

		System.out.println("The connection is successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			try
		{
			 Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			 System.out.println(stmt);
			 
		 ResultSet rs= stmt.executeQuery("select * from scrollex");
		 while(rs.next())
				 		
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getInt(3));

			
     		 rs.first(); 
			 rs.updateString(1,"yogibear");
			 System.out.println("after update string");
			 rs.updateRow();
			 System.out.println("after update row"); 

			 rs.moveToInsertRow();
			 rs.updateString(1,"pallavi");
			 rs.updateString(2,"Training");
			 rs.updateInt(3,998);
			 rs.insertRow();
			  System.out.println("after insert row");  
				
              rs.close();

            rs= stmt.executeQuery("select * from scrollex");

	          rs.first();
			 while(rs.next())
				 		
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getInt(3));
				

		 }
		 catch(Exception ce)
		  {
			 ce.printStackTrace();
			 			 System.out.println(ce);
		  }
		  
		
	}
}

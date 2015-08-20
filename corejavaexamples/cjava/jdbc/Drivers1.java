import java.util.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;

public class  Drivers1
{


	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stat=null;
		String s;
		try
		{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		
	      con=DriverManager.getConnection("jdbc:oracle:oci8:@oracle9i","scott","tiger");

		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@saraswati:1521:oracle9i","scott","tiger");
		
		
		
		/*Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");*/

		//Driver d=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
		
		//Connection con=d.connect("jdbc:odbc:oradsn",p);

		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Connection con=DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");

		System.out.println("The connection is successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		


        try
		{
		 stat=con.createStatement();
		 s="create table student(Rollno int,Name varchar2(50),serName varchar2(50))";
         stat.executeUpdate(s);
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		

         try
		{
 		 s="insert into student values(?,?,?)";	
		 PreparedStatement stat1=con.prepareStatement(s);
         stat1.setInt(1,1);
		 stat1.setString(2,"Namrata");
		 stat1.setString(3,"Marathe");
         int no=stat1.executeUpdate();
		 System.out.println("no of rows inserted:"+no);
		 stat1.setInt(1,2);
		 stat1.setString(2,"Rahul");
		 stat1.setString(3,"Marathe");
         int no=stat1.executeUpdate();
		 System.out.println("no of rows inserted:"+no);


		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		


        try
		{
		  stat.close();
		}
		catch(SQLException e)
		{}

		System.out.println("create is successful:");

        try
		{
		 stat=con.createStatement();
         s= "select * from student";
		ResultSet rset=stat.executeQuery(s);
		
		while(rset.next())
			System.out.println(rset.getInt(1)+" "+rset.getString(2)+"    "+rset.getString(3));
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		
        try
		{
		  stat.close();
		}
		catch(SQLException se)
		{
			
		}


	}
}

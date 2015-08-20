import java.util.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;

public class  Drivers
{


	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stat=null;
		String s;
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost/namadb","root","namrata");
		
		System.out.println("The connection is successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		try
		{
		 stat=con.createStatement();
		// s="create table student(Rollno int,Name varchar2(50),serName varchar2(50))";
		 s="create table student(Rollno int,Name Text,serName Text)";
         stat.executeUpdate(s);
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		

         try
		{
		 stat=con.createStatement();
		 s="insert into student values(1,'Namrata','Marathe')";
         stat.executeUpdate(s);
 		 s="insert into student values(2,'Arjun','Marathe')";
         stat.executeUpdate(s);
 		 s="insert into student values(3,'Rahul','Marathe')";
         stat.executeUpdate(s);

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

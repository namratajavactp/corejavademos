import java.sql.*;

class Ex4
{
          public static void main(String args[]) throws Exception 
          {
		//load driver Type I
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.println("class loaded");
Connection con = DriverManager.getConnection("jdbc:odbc:mydsn" ,"scott","tiger");
		System.out.println("connected to db");
       CallableStatement cs = con.prepareCall("{call incr_sal_of_emp(?,?,?) } ");
	   cs.setInt(1,1);
	   cs.setInt(2,5000);
	   cs.registerOutParameter(3, Types.INTEGER);
	   cs.execute();
        System.out.println("new sal = " + cs.getInt(3));
con.commit();

con.close();
	   }//end of main

}//

import javax.sql.*;
import java.sql.*;
import java.lang.System.*;
import java.util.*;
import javax.naming.*;
public class  ConnectIII_
{
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		Context ctx = new InitialContext(p);
		DataSource d =(DataSource) ctx.lookup("hello");
		Connection con = d.getConnection();
		Statement stat = con.createStatement();
		ResultSet rs = stat.executeQuery("Select * from login");
		System.out.println("Printing emp information");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		con.close();
	}
}

//Addserver.java
import java.rmi.*;
//import javax.naming.*;
import java.rmi.server.*;

public class AddServer 
{
	public static void main(String[] args) 
	{
		try
		{
			AddServerImpl addServerImpl = new AddServerImpl();
			Naming.rebind("AServer",addServerImpl);
		 /*  Context namingContext = new InitialContext();
			namingContext.rebind("rmi:AdServer", addServerImpl);*/
			System.out.println("Server started");
		}
		catch(Exception e)
		{
			System.out.println("Exception: " +e);
		}

	}
}

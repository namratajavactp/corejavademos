import java.awt.*;
import java.applet.*;
import java.net.*;

public class ShowDoc extends Applet
{
	URL codb;
	AppletContext ac;
	Image image1;
	public void init()
	{
	   ac=getAppletContext();
	   codb=getCodeBase();
	   image1=getImage(codb,"");
	   try
		{
		   ac.showDocument(new URL(codb+"Demo.html"),"_blank");
	   }
	   catch(MalformedURLException e)
	   {
		   showStatus(""+e);
	   }
	
	}
};
import java.awt.*;
import java.applet.*;

public class  DisplayDetails extends Applet
{
	String name,address;
         Image img;

	public void paint(Graphics g)
	{
            img = getImage(getCodeBase(), "Blue hills.gif");
               g.drawImage(img, 0, 0, this);
  
    
		if(name==null && address==null || (name.trim()).equals("Name"))
		{
			g.drawString("No Information entered :- Please enter information",20,10);

		}
		else
		{
			g.drawString(name,10,10);
			g.drawString(address,10,30);
		}
	}
	public void setDetails(String name,String address)
	{
		this.name = name;
		this.address = address;
		repaint();
	}
	public void resetDetails()
	{
		name=null;
		address=null;
		repaint();
	}

}

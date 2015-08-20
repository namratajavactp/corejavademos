import java.applet.*;
import java.awt.*;
import java.net.*;
/*
<applet code=AppImage1 width=350 height=100 >
</applet>
*/


public class AppImage1 extends Applet
{
   Image img;
   URL codb;
	public void paint(Graphics g)
	{
	g.drawString("Playing Image",20,40);
	codb=getCodeBase();
	img=getImage(codb,"Water lilies.jpg");
	g.drawImage(img,10,10,this);
	}
};
import java.applet.*;
import java.awt.*;
import java.net.*;
/*
<applet code=AppAudio1 width=350 height=100 >
</applet>
*/


public class AppAudio1 extends Applet
{
   
	public void paint(Graphics g)
	{
	g.drawString("Playing Image",20,40);
	URL codb=getCodeBase();
	play(codb,"tada.aif");
	}
};
import java.applet.*;
import java.awt.*;
import java.net.*;
/*
<applet code=AppAudio2 width=350 height=100 >
</applet>
*/


public class AppAudio2 extends Applet
{
   
	public void paint(Graphics g)
	{
	g.drawString("Playing Image",20,40);
	URL codb=getCodeBase();
	AudioClip music=getAudioClip(codb,"bird.au");
	music.loop();
	}
};
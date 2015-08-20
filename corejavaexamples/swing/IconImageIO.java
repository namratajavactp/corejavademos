import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;


class IconImageIO
{

	public static void main(String[] args)
	{

	Image image = null;
    try {
        // Read from a file
        File file = new File("Pig.gif");
        image = ImageIO.read(file);
    
        // Read from an input stream
        InputStream is = new BufferedInputStream(
            new FileInputStream("Pig.gif"));
        image = ImageIO.read(is);
    
        // Read from a URL
//        URL url = new URL("http://hostname.com/image.gif");
  //      image = ImageIO.read(url);
    } catch (IOException e) {
    }
    
    // Use a label to display the image
    JFrame frame = new JFrame();
    JLabel label = new JLabel(new ImageIcon(image));
    frame.getContentPane().add(label, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
	}
}
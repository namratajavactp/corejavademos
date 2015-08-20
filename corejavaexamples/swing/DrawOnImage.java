import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.*;
 //to draw on given image
class DrawOnImage extends Component {
  BufferedImage img = null;
 
  DrawOnImage() {
    try {
      img = ImageIO.read(new File("Pig.gif"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    MediaTracker mediaTracker=new MediaTracker(this);
    mediaTracker.addImage(img, 0);
    try {
      mediaTracker.waitForID(0);	
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
 
    // Create an image to save
    RenderedImage rendImage = myCreateImage();
    
    // Write generated image to a file
    try {
        // Save as PNG
        File file = new File("newimage.png");
        ImageIO.write(rendImage, "png", file);
    
        // Save as JPEG
        file = new File("newimage.jpg");
        ImageIO.write(rendImage, "jpg", file);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
 
  public RenderedImage myCreateImage() {
    int width = img.getWidth();
    int height = img.getHeight();
    
    // Create a buffered image in which to draw
    BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    // Create a graphics contents on the buffered image
    Graphics2D g2d = bufferedImage.createGraphics();
 
    // Draw graphics
    g2d.drawImage(img, null, 0, 0);
    g2d.setColor(Color.white);
    g2d.fillRect(width/2-50, height/2-50, 100, 100);
    g2d.setColor(Color.red);
    g2d.fillOval(width/2-25, height/2-25, 50, 50);
    
    // Graphics context no longer needed so dispose it
    g2d.dispose();
   
    return bufferedImage;
  }
 
  public static void main(String[] args) {
    DrawOnImage d = new DrawOnImage();
  }
}


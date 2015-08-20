import javax.swing.*;
  import java.awt.*;
 
  public class NotHelloWorld
  {
     public static void main(String[] args)
     {
        NotHelloWorldFrame frame = new NotHelloWorldFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
       frame.setVisible(true);
   }
}

 /**
   A frame that contains a message panel
 */
 class NotHelloWorldFrame extends JFrame {
   public NotHelloWorldFrame()
   {
     setTitle("NotHelloWorld");
     //setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

     //setBackground(Color.green);
		
     //add panel to frame

      NotHelloWorldPanel panel = new NotHelloWorldPanel();
	  
      add(panel);
	  pack();
   }

   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 200;
 }

 /**
    A panel that displays a message.
 */
 class NotHelloWorldPanel extends JPanel
 {
	  NotHelloWorldPanel()
	 {
		  setBackground(Color.cyan);	

	 }
    public void paintComponent(Graphics g)
    {
	  super.paintComponent(g);
      setBorder(BorderFactory.createLineBorder(Color.black));

      setForeground(Color.blue);
	   
     g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
	}

	 public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }


    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
 }


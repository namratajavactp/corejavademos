import java.awt.*;
 import java.awt.event.*;
 import java.beans.*;
 import javax.swing.*;

 public class ToolBarTest
 {
    public static void main(String[] args)
    {
       ToolBarFrame frame = new ToolBarFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
 }

 /**
    A frame with a toolbar and menu for color changes.
 */
 class ToolBarFrame extends JFrame
 {
    public ToolBarFrame()
    {
       setTitle("ToolBarTest");
       setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

       // add a panel for color change

       panel = new JPanel();
	   add(panel);

       // set up actions

       Action blueAction = new ColorAction("Blue",new ImageIcon("z:\\images\\add.gif"),java.awt.Color.BLUE);
       Action yellowAction = new ColorAction("Yellow",new ImageIcon("z:\\images\\code.gif"), java.awt.Color.YELLOW);
       Action redAction = new ColorAction("Red",new ImageIcon("z:\\images\\docs.gif"), java.awt.Color.RED);

       Action exitAction = new AbstractAction("Exit", new ImageIcon("z:\\images\\read.gif"))
          {
             public void actionPerformed(ActionEvent event)
             {
                System.exit(0);
             }
          };
       exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");

       // populate toolbar

       JToolBar bar = new JToolBar();
       bar.add(blueAction);
       bar.add(yellowAction);
       bar.add(redAction);
       bar.addSeparator();
       bar.add(exitAction);
       add(bar, BorderLayout.NORTH);

       // populate menu

       JMenu menu = new JMenu("Color");
       menu.add(yellowAction);
       menu.add(blueAction);
       menu.add(redAction);
       menu.add(exitAction);
       JMenuBar menuBar = new JMenuBar();
       menuBar.add(menu);
       setJMenuBar(menuBar);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    private JPanel panel;

    /**
       The color action sets the background of the frame to a
       given color.
    */
    class ColorAction extends AbstractAction
    {
       public ColorAction(String name, Icon icon,java.awt.Color c)
       {
          putValue(Action.NAME, name);
          putValue(Action.SMALL_ICON, icon);
          putValue(Action.SHORT_DESCRIPTION, name + " background");
          putValue("Color", c);
       }

       public void actionPerformed(ActionEvent event)
       {
          java.awt.Color c = (java.awt.Color) getValue("Color");
		  System.out.println(c);
          panel.setBackground(c);
       }
    }
 }
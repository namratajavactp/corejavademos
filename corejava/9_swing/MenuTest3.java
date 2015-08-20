 import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  import javax.swing.event.*;
 
  public class MenuTest3
  {
     public static void main(String[] args)
     {
        MenuFrame frame = new MenuFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     }
  }

  class MenuFrame extends JFrame
  {
	  MenuFrame()
	  {
		  setTitle("MENU");
			setSize(300,300);

			JMenu file=new JMenu("File");
			TestAction t=new TestAction("Open");
			t.putValue(Action.SMALL_ICON,new ImageIcon("z:\\images\\docs.gif"));
		    t.putValue(Action.MNEMONIC_KEY,new Integer('O'));
			t.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK) );
			JMenuItem jm=file.add(t);
			
			final JMenuItem item=new JMenuItem("Exit");
                  
			item.setMnemonic(KeyEvent.VK_E);
			item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));

			item.addActionListener(new ActionListener()
		  {
				public void actionPerformed(ActionEvent event)
			  {
					System.exit(0);
			  }
		  });
		  file.add(item);
		  JMenuBar mb=new JMenuBar();
		  mb.add(file);
		  setJMenuBar(mb);
	  }
  }

  class TestAction extends AbstractAction
  {
	  TestAction( String name)
	  {
		  super(name);
	  }
	  public void actionPerformed(ActionEvent e)
	  {
		  System.out.println(getValue(Action.NAME));
	  }
  }
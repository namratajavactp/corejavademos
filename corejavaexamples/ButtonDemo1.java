import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame //implements ActionListener,WindowListener
{TextField name;
 Button okBut;

 
   ButtonDemo(String title)
   {   super(title);
       setLayout(new FlowLayout());
	   name=new TextField("hello");
	   okBut=new Button("click me");

	   add(name);
	   add(okBut);
	
	   setVisible(true);

   }


   
	public static void main(String[] args) 
	{
		ButtonDemo b=new ButtonDemo("ButtonDemo");

	}

	

	
}

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET
    CODE=list.class
    WIDTH=200
    HEIGHT=200 >
</APPLET>
*/

public class list extends Applet implements ActionListener {

    List list1;
    TextField text1;

    public void init(){

		
		 System.out.println("applet init");
		
        text1 = new TextField(20);
        add(text1);
        list1 = new List();
        list1.add("Item 1");
        list1.add("Item 2");
        list1.add("Item 3");
        list1.add("Item 4");
        list1.add("Item 5");
        list1.add("Item 6");
        list1.add("Item 7");
        list1.add("Item 8");
        list1.add("Item 9");
        add(list1); 
        list1.addActionListener(this); 
    }

    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == list1){
            text1.setText(list1.getSelectedItem());
        //}
}

		public void stop(){ System.out.println("applet stopped");
		}

		public void destroy()
		{ System.out.println("applet destroyed");
		}
    
}

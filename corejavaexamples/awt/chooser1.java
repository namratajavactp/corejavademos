import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class chooser1 extends Frame implements ActionListener
{
	
	MyList currentList;
	MyList mealList[];
	MenuBar mb;
	Menu Orderr;
	MenuItem BreakFast,Dinner,Lunch,Exit;
	String actComm[]={"BreakFast","Dinner","Lunch","Exit"};
	String msg="";


	String meals[]={"BreakFast","Lunch","Dinner"};
	String mealChoices[][]={
		{"pancakes","eggs","bacon","ham","toast","coffee"},
		{"pizza","hamburger","hot dog","pavbhaji","chole"},
		{"chiken","fish","bhajibhath","dosa"}
	};
	TextField text;

public chooser1(String title)
	{
		super(title);

		setLayout(new BorderLayout());
		setupLists();
		mb=new MenuBar();
		Orderr = new Menu("Order");
		BreakFast=new MenuItem("BreakFast",new MenuShortcut(KeyEvent.VK_1,false));
		Dinner=new MenuItem("Dinner",new MenuShortcut(KeyEvent.VK_2,true));
		Lunch=new MenuItem("Lunch",new MenuShortcut(KeyEvent.VK_3,false));
		Exit=new MenuItem("Exit");

		BreakFast.addActionListener(this);
		Dinner.addActionListener(this);
		Lunch.addActionListener(this);
		Exit.addActionListener(this);

		Orderr.add(BreakFast);
		Orderr.add(Dinner);
		Orderr.add(Lunch);
		Orderr.add(Exit);

        text=new TextField(40);
		text.setEditable(false);
		mb.add(Orderr);

		setCursor(CROSSHAIR_CURSOR);
		Image img=Toolkit.getDefaultToolkit().getImage("cuisine.gif");
		setIconImage(img);
		setResizable(false);
		setMenuBar(mb);
		add("South",text);
		//currentList = mealList[0];
		String arb[]={" "," "," "};
		currentList=new MyList(5,true,arb);
		currentList.setEnabled(false);
		add("East",currentList);
		setSize(400,400);
    
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false); }});
		setVisible(true);

	}
     


void setupLists()
	{
      mealList=new MyList[meals.length];
	  for(int i=0;i<meals.length;i++)
		{
		  mealList[i]=new MyList(5,true,mealChoices[i]);
		  mealList[i].addItemListener(new ListHandler());
		}
	}

        public void actionPerformed(ActionEvent ae)
	  {
			for(int i=0;i<actComm.length;i++)
		 {
			if(ae.getActionCommand().equals(actComm[i]))
			{
				  if(ae.getActionCommand().equals("Exit"))
				{
					  setVisible(false);
					  dispose();
					  System.exit(0);
				}

					chooser1.this.remove(currentList);
					currentList=mealList[i];
					currentList.setEnabled(true);
					chooser1.this.add("East",currentList);
					text.setText(actComm[i]);
					msg=actComm[i]+":";
			}
			chooser1.this.validate();
		  }


				
		}




   class ListHandler implements ItemListener
   {
	   public void itemStateChanged(ItemEvent ie)
	   {
		   String msg1="";
		   
		   String items[]=currentList.getSelectedItems();
		   for(int i=0;i<items.length;i++)
		   		   msg1+=items[i]+" ";
		   	    text.setText(msg+msg1);
		  		   
	   }


   }

	
	


	class MyList extends List
	{
		public MyList(int rows,boolean multiple,String label[])
		{
			super(rows,multiple);
			for(int i=0;i<label.length;i++)
			{
				try
				{
					add(label[i]);
				}
				catch(NullPointerException ex)
				{
					add(" ");
				}
			}
		}
	}


	
	public static void main(String[] args) 
	{
	  chooser1 chh=new chooser1("Hotel DalesHeaven");
	}
}

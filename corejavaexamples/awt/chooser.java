import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class chooser extends Frame 
{
	MyChoice mealchoice;
	MyList currentList;
	MyList mealList[];
	MenuBar mb;
	Menu Orderr;

	String meals[]={"Breakfast","Lunch","Dinner"};
	String mealChoices[][]={
		{"pancakes","eggs","bacon","ham","toast","coffee"},
		{"pizza","hamburger","hot dog","pavbhaji","chole"},
		{"chiken","fish","bhajibhath","dosa"}
	};
	TextField text;

public chooser(String title)
	{
		super(title);

		setLayout(new BorderLayout());
		mb=new MenuBar();
		Orderr = new Menu("Place Order");
		mb.add(Orderr);

		setCursor(CROSSHAIR_CURSOR);
		Image img=Toolkit.getDefaultToolkit().getImage("cuisine.gif");
		setIconImage(img);
		setResizable(false);
		setMenuBar(mb);
		setupChoice();
		setupLists();
		text=new TextField(40);
		add("North",new Label("place your order:"));
		add("South",text);
		add("West",mealchoice);
		currentList = mealList[0];
		add("East",currentList);
	//setSize(300,400);
		pack();
		addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false);dispose();System.exit(0); }});
		setVisible(true);

	}
     
void setupChoice()
	{
	   mealchoice = new MyChoice(meals);
	   mealchoice.addItemListener(new ChoiceHandler());
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

	class ChoiceHandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent ie)
		{
			for(int i=0;i<meals.length;i++)
			{
				if(meals[i].equals(mealchoice.getSelectedItem()))
				{
					chooser.this.remove(currentList);
					currentList=mealList[i];
					chooser.this.add("East",currentList);
					text.setText(meals[i]);
				}

				chooser.this.validate();
			}
		}
	}


   class ListHandler implements ItemListener
   {
	   public void itemStateChanged(ItemEvent ie)
	   {
		   String order=mealchoice.getSelectedItem() + ": ";
		   String items[]=currentList.getSelectedItems();
		   for(int i=0;i<items.length;i++)
			   order+=items[i]+" ";
		   text.setText(order);
	   }
   }

	
	public class MyChoice extends Choice
	{
		public MyChoice(String labels[])
		{
			super();
			int length=labels.length;
			for(int i=0;i<length;i++)
			{
				try
				{ 
					add(labels[i]);
				}
				catch(NullPointerException ex)
				{
					add(" ");
				}
			}
	   }
	}


	public class MyList extends List
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
	  chooser chh=new chooser("Hotel DalesHeaven");
	}
}

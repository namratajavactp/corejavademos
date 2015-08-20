import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  CheckBoxFrame extends JFrame
{
   static int ct=0,ct1=0;
	CheckBoxFrame(String s)
	{
		super(s);
		CheckBoxPanel jp=new CheckBoxPanel();
		add(jp);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


	public static void main(String[] args) 
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		CheckBoxFrame cb=new CheckBoxFrame("CheckBoxDemo");

		
	}


	class CheckBoxPanel extends JPanel implements ItemListener
	{ 
			
		StringBuffer main,main1;
		StringBuffer temp;
		String ss="Z:\\javabatch\\today\\swing\\CheckBox1\\image\\";
		int index;
		ImageIcon ic;
		

	    JLabel lb;
		JCheckBox jc,jc1,jc2,jc3;
		CheckBoxPanel()
		{
			main=new StringBuffer("geek-");			
			main1=new StringBuffer(".gif");

			temp=new StringBuffer("cght");
			
			ic=new ImageIcon(ss+"geek-cght.gif");
			lb=new JLabel(ic);

			jc=new JCheckBox("chin",true);
			
			jc.addItemListener(this);
		

			jc1=new JCheckBox("hair",true);
			jc1.addItemListener(this);
			
			

			jc2=new JCheckBox("glasses",true);
		
			jc2.addItemListener(this);		
			
			
			jc3=new JCheckBox("teeth",true);
		
			jc3.addItemListener(this);			
			

			add(jc);
			add(jc1);
			add(jc3);
			add(jc2);
			add(lb);


		}

		public void itemStateChanged(ItemEvent e)
		{
		    JCheckBox c=(JCheckBox)e.getItem();
			
			if(c==jc)
			{

				System.out.println("chin");
				index =0;
				if(ItemEvent.SELECTED==e.getStateChange())
				{
				System.out.println("selected");
                  
				  temp.setCharAt(index,'c');
				}
        		else 
				{
	  	    	   temp.setCharAt(index,'-');
				System.out.println("delected");
				}

				System.out.println(temp);
				main.append(temp).append(main1);
				ic=new ImageIcon(ss+main);
				lb.setIcon(ic);
				main.replace(0,main.length(),"geek-");
//				main1.replace(0,main1.length(),".gif");


					
				
				

			}
			else if(c==jc2)
            {


				index=1;
				System.out.println("glasses");
			if(ItemEvent.SELECTED==e.getStateChange())
				{
			  temp.setCharAt(index,'g');
	  				System.out.println("selected");
				}
			 else
				{

				temp.setCharAt(index,'-');
				System.out.println("deselected");
				}

				System.out.println(temp);
								main.append(temp).append(main1);
				ic=new ImageIcon(ss+main);
				lb.setIcon(ic);
				main.replace(0,main.length(),"geek-");
				main1.replace(0,main1.length(),".gif");

			}
			else if(c==jc1)
			{

				index=2;
				System.out.println("hair");
				if(ItemEvent.SELECTED==e.getStateChange())	 
				{
					System.out.println("selected");
				  temp.setCharAt(index,'h');
				}
				else 
				{
					System.out.println("deselected");
					temp.setCharAt(index,'-');
				}
				System.out.println(temp);
								main.append(temp).append(main1);
				ic=new ImageIcon(ss+main);
				lb.setIcon(ic);
				main.replace(0,main.length(),"geek-");
				main1.replace(0,main1.length(),".gif");

			}
			else if(c==jc3)
			{



              index=3;
				System.out.println("teeth");
			if(ItemEvent.SELECTED==e.getStateChange())	 
				{

				System.out.println("selected");
			  temp.setCharAt(index,'t');
				}
			else 
				{
				temp.setCharAt(index,'-');
				System.out.println("deselected");
				}

				System.out.println(temp);
								main.append(temp).append(main1);
				ic=new ImageIcon(ss+main);
				lb.setIcon(ic);
				main.replace(0,main.length(),"geek-");
				main1.replace(0,main1.length(),".gif");

			}

           
		   
		}

	}


  }





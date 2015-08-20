
import java.awt.*;
import java.awt.event.*;


public class password extends Frame implements ActionListener
{
	TextField tf;
	TextField tff;

	Label name;
	Label pasword;

	Button ok;
	String msg="";
	password ref;
    
	 password(String name1)
	{
		 super(name1);
		 ref=this;
		 GridBagLayout gb=new GridBagLayout();
		 GridBagConstraints gbc=new GridBagConstraints(); 
		 setLayout(gb);

		 gbc.gridwidth=1;
		 gbc.gridheight=1;

		 gbc.gridx=0;
		 gbc.gridy=0;

		 gbc.fill=GridBagConstraints.NONE;
		 gbc.weightx=100;
		 gbc.weighty=100;

		 name = new Label("Name:");
		 pasword=new Label("Password:");

	     tf=new TextField(20);
		 tff=new TextField(20);
		 tff.setEchoChar('?');
		 tf.setFocusTraversalKeysEnabled(true);
 		 tff.setFocusTraversalKeysEnabled(true);
		 add(name,gbc);

		 gbc.gridx=1;
		 add(tf,gbc);

		 gbc.gridx=0;
		 gbc.gridy=1;
		 add(pasword,gbc);

         gbc.gridx=1;
		 gbc.gridy=1;
		 add(tff,gbc);

         gbc.gridx=0;
		 gbc.gridy=2;
		 ok=new Button("OK");
		 add(ok,gbc);

		 ok.addActionListener(this);
		 ok.addKeyListener(new KeyAdapter() 
	 {
	    public void keyPressed(KeyEvent ke)
	  {
	   			
		Dialog dd;
	 	if(ke.getSource()==ok)
		{

			if((tf.getText().equals("Namrata")) && (tff.getText().equals("Marathe")))
			{
			
				msg="Access allowed";
               dd=new dDialog(ref,"Result",true,msg); 
			   dd.show();
			   tf.setText("");
			   tf.requestFocus();
			}
			else if((!tf.getText().equals("Namrata")) && (!tff.getText().equals("Marathe")))
			{
			
			   msg="Accessdenied:UserName & Password Failed";
               dd=new dDialog(ref,"Result",true,msg); 
			   dd.show();
			   tf.setText("");
			   tff.setText("");
			   tf.requestFocus();
			}
			else if(!tf.getText().equals("Namrata"))
			{ 
				msg="Access denied:User Name FAILED";
				dd=new dDialog(ref,"Result",true,msg);
				dd.show();
				tf.setText("");
				tf.requestFocus();
			}
			else if(!tff.getText().equals("Marathe"))
			{
				msg="Access denied:password FAILED";
				dd=new dDialog(ref,"Result",true,msg);
				dd.show();
				tff.setText("");
				tff.requestFocus();
			}
			
          }

      }
	 });

		 addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { setVisible(false); System.exit(0); }});
		 setSize(300,300);
		 setVisible(true);

	}

    public void actionPerformed(ActionEvent ae)
	{
		Dialog dd;
	 	if(ae.getSource()==ok)
		{

			if((tf.getText().equals("Namrata")) && (tff.getText().equals("Marathe")))
			{
			
				msg="Access allowed";
               dd=new dDialog(this,"Result",true,msg); 
			   dd.show();
			   tf.setText("");
			   tff.setText("");
			}
			else if((!tf.getText().equals("Namrata")) && (!tff.getText().equals("Marathe")))
			{
			
			   msg="Accessdenied:UserName & Password Failed";
               dd=new dDialog(this,"Result",true,msg); 
			   dd.show();
			   tf.setText("");
			   tff.setText("");
			   tf.requestFocus();

			}
			else if(!tf.getText().equals("Namrata"))
			{ 
				msg="Access denied:User Name FAILED";
				dd=new dDialog(this,"Result",true,msg);
				dd.show();
				tf.setText("");
				tf.requestFocus();
			}
			else if(!tff.getText().equals("Marathe"))
			{
				msg="Access denied:password FAILED";
				dd=new dDialog(this,"Result",true,msg);
				dd.show();
				tff.setText("");
				tff.requestFocus();
			}
			

		}

	}


    
	public static void main(String[] args) 
	{
		password pw= new password("Access Window");
	}
}

class dDialog extends Dialog implements ActionListener
{
	Button ok;
	Button cancel;
	String pass;

	dDialog(Frame namee,String nama,boolean ttrue,String msgg)
	{
        super(namee,nama,ttrue);
		setSize(300,200);
		System.out.println("inside dialog");
		
		setLayout(new FlowLayout());
		pass=msgg;

		ok=new Button("OK");
		cancel=new Button("Cancel");

		ok.addActionListener(this);
		cancel.addActionListener(this);

		ok.setFocusTraversalKeysEnabled(true);
 		cancel.setFocusTraversalKeysEnabled(true);
		

		ok.addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent ke){ 
			if(ke.getSource()==ok)
				dispose();
			else if(ke.getSource()==cancel)
				dispose();
		} });
		cancel.addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent ke){ 
			if(ke.getSource()==ok)
				dispose();
			else if(ke.getSource()==cancel)
				dispose();
		}});
         
		  add(ok);
		  add(cancel);
		  repaint();
	}

    
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==ok)
		{
			dispose();
		}
		else if(ae.getSource()==cancel)
			dispose();
      
    }


	public void paint(Graphics g)
	{
		g.drawString(pass,3,140);
	}
}  





    


import java.awt.*;
import java.awt.event.*;

class cutPaste extends Frame implements ActionListener
{
	TextArea nama;
	Button cut,copy,paste;
	boolean flag;
	String temp;

    cutPaste(String name)
	{
		super(name);
		GridBagLayout gb=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		setLayout(gb);
		nama=new TextArea("hello friends",5,19,TextArea.SCROLLBARS_BOTH);

		cut=new Button("Cut");
		copy=new Button("Copy");
		paste=new Button("Paste");
        
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);

		setSize(300,300);
        gbc.gridwidth=3;
		gbc.gridheight=1;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=100;
		gbc.weighty=100;
		add(nama,gbc);

		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.fill=GridBagConstraints.NONE;
		add(cut,gbc);

		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.fill=GridBagConstraints.NONE;
		add(copy,gbc);


		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.fill=GridBagConstraints.NONE;
		add(paste,gbc);
	    addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent we) { setVisible(false); System.exit(0);}});
		setVisible(true);
	}


	public void actionPerformed(ActionEvent ae)
	{
       if(ae.getSource()==cut)
		{
		    int i=nama.getSelectionStart();
			int j=nama.getSelectionEnd();
			temp=nama.getSelectedText();
			nama.replaceRange("",i,j);
		}

		if(ae.getSource()==copy)
		{
			temp=nama.getSelectedText();
		}

		if(ae.getSource()==paste)
		{
			int pos=nama.getCaretPosition();
			nama.insert(temp,pos);
			
		}
	}
 
        








	public static void main(String[] args) 
	{
		cutPaste cp=new cutPaste("note pad");
	}
}

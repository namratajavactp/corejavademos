import java.awt.*;
 import java.awt.event.*;
 import java.text.*;
 import java.util.*;
 import javax.swing.*;

 /**
    A program to test spinners.
 */
 public class SpinnerTest
 {
    public static void main(String[] args)
    {
       SpinnerFrame frame = new SpinnerFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
 }

 /**
    A frame with a panel that contains several spinners and
    a button that displays the spinner values.
 */
 class SpinnerFrame extends JFrame
 {
    public SpinnerFrame()
    {
       setTitle("SpinnerTest");
       setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
       JPanel buttonPanel = new JPanel();
       okButton = new JButton("Ok");
       buttonPanel.add(okButton);
       add(buttonPanel, BorderLayout.SOUTH);

       mainPanel = new JPanel();
       mainPanel.setLayout(new GridLayout(0, 3));
       add(mainPanel, BorderLayout.CENTER);

       JSpinner defaultSpinner = new JSpinner();
       addRow("Default", defaultSpinner);

       JSpinner boundedSpinner = new JSpinner(new SpinnerNumberModel(5, 0, 10, 0.5));
       addRow("Bounded", boundedSpinner);

       String[] fonts = GraphicsEnvironment
          .getLocalGraphicsEnvironment()
          .getAvailableFontFamilyNames();

       JSpinner listSpinner = new JSpinner(new SpinnerListModel(fonts));
       addRow("List", listSpinner);

       JSpinner reverseListSpinner = new JSpinner(
          new
             SpinnerListModel(fonts)
             {
                public Object getNextValue()
                {
                   return super.getPreviousValue();
                }
                public Object getPreviousValue()
                {
                   return super.getNextValue();
                }
             });
       addRow("Reverse List", reverseListSpinner);
	  
	   JSpinner timeSpinner = new JSpinner(
           new SpinnerDateModel(
              new GregorianCalendar(2000, Calendar.JANUARY, 1, 12, 0, 0).getTime(),
                 null, null, Calendar.HOUR));
        addRow("Time", timeSpinner);


       JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
       addRow("Date", dateSpinner);

/*
       JSpinner permSpinner = new JSpinner(new PermutationSpinnerModel(1));
       addRow("Word permutations", permSpinner); */
    }

    /**
       Adds a row to the main panel.
       @param labelText the label of the spinner
       @param spinner the sample spinner
    */
    public void addRow(String labelText, final JSpinner spinner)
    {
       mainPanel.add(new JLabel(labelText));
       mainPanel.add(spinner);
       final JLabel valueLabel = new JLabel();
       mainPanel.add(valueLabel);
       okButton.addActionListener(new
          ActionListener()
          {
             public void actionPerformed(ActionEvent event)
             {
                Object value = spinner.getValue();
                valueLabel.setText(value.toString());
             }
          });
    }

    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 250;

    private JPanel mainPanel;
    private JButton okButton;
 }

 /**
    A model that dynamically generates even numbers
 */
 /*
 class PermutationSpinnerModel extends AbstractSpinnerModel
 {
    
    public PermutationSpinnerModel(Integer w)
    {
     
    }

    public Object getValue()
    {
      
    }

    public void setValue(Object value)
    {
       
    }

    public Object getNextValue()
    {
       
       
    }

    public Object getPreviousValue()
    {
       
    }

   
   
 }*/




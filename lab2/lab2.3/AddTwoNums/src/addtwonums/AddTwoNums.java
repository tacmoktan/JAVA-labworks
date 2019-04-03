package addtwonums;

import javax.swing.*;            //imports swing components like Jframe, JLabel, etc.
import java.awt.*;               //imports all AWT components GridLayout and others.
import java.awt.event.*;         //imports all AWT event components like ActionListener, ActionEvent


public class AddTwoNums extends JFrame{
    AddTwoNums(){
        //creating frame
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(3,2));
        
        //adding grids
        JLabel n1Label = new JLabel("Enter num1:");
        f.add(n1Label);
        JTextField n1TextField = new JTextField();
        f.add(n1TextField);
        
        JLabel n2Label = new JLabel("Enter num2:");
        f.add(n2Label);
        JTextField n2TextField = new JTextField();
        f.add(n2TextField);
        
        JButton sumButton = new JButton("sum");
        f.add(sumButton);
        JTextField sumTextField = new JTextField();
        f.add(sumTextField);
        pack();
        
        //adding event/action listener
        sumButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               double n1 = Double.parseDouble( n1TextField.getText() );
               double n2 = Double.parseDouble( n2TextField.getText() );
               double sum = n1+n2;
               sumTextField.setText( String.valueOf(sum) );
           }
        });
        
        f.setVisible(true);     //displays frame in a window
    }
    
    public static void main(String[] args) {
        AddTwoNums operation1 = new AddTwoNums();
    }
    
}

package simpleinterestgrid;

import javax.swing.*;       //to import swing components like Jframe, JLabel, etc.
import java.awt.*;          //imports all AWT components GridLayout and others.
import java.awt.event.*;    //imports all AWT event components like ActionListener, ActionEvent

public class SimpleInterestGrid extends JFrame {
    
    SimpleInterestGrid(){
        //create frame
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(4,2) );
        
        //add grids to the frame
        JLabel principalLabel = new JLabel("Enter principal:");
        f.add(principalLabel);
        JTextField principalTextField = new JTextField();
        f.add(principalTextField);
        
        JLabel timeLabel = new JLabel("Enter time:");
        f.add(timeLabel);
        JTextField timeTextField = new JTextField();
        f.add(timeTextField);
        
        JLabel rateLabel = new JLabel("Enter rate:");
        f.add(rateLabel);
        JTextField rateTextField = new JTextField();
        f.add(rateTextField);
        
        //output interest grid
        JButton interestButton = new JButton("Calculate Interest");
        f.add(interestButton);
        JTextField interestTextField = new JTextField();
        f.add(interestTextField);
        pack();
        
        interestButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                double p = Double.parseDouble( principalTextField.getText() );
                double t = Double.parseDouble( timeTextField.getText() );
                double r = Double.parseDouble( rateTextField.getText() );
                double i = (p*t*r)/100;
                
                interestTextField.setText(String.valueOf(i));
            }
        });
        
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new SimpleInterestGrid();
    }
    
}

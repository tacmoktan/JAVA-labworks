package multiplicationgrid;

import javax.swing.*;                   //to import all swing components like JFrame, JLabel, JButton and so on.
import java.awt.GridLayout;             //to import grid layout
import java.awt.event.ActionEvent;      //to import ActionEvent
import java.awt.event.ActionListener;   //to import ActionListener

public class MultiplicationGrid extends JFrame {       //when we inherit JFrame, we can pack() frame;
    
    MultiplicationGrid(){
        //creating frame
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(3,2) );
        
        //adding grids

        //1st input grid
        JLabel num1Label = new JLabel("Enter num1:");
        f.add(num1Label);
        JTextField num1TextField = new JTextField();
        f.add(num1TextField);
        
        //2nd input grid
        JLabel num2Label = new JLabel("Enter num2:");
        f.add(num2Label);
        JTextField num2TextField = new JTextField();
        f.add(num2TextField);
        
        //output grid
        JButton mulButton = new JButton("Multiply");
        f.add(mulButton);
        JTextField mulTextField = new JTextField();
        f.add(mulTextField);
        pack();
        
        //adding event/action listener
        mulButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double n1 = Double.parseDouble( num1TextField.getText() );
                double n2 = Double.parseDouble( num2TextField.getText() );
                double mul = n1 * n2;
                mulTextField.setText(String.valueOf(mul));
            }
        });
        
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MultiplicationGrid();
    }
    
}

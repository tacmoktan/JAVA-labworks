
package genericswingquestion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Multiply extends JFrame{
    Multiply(){
     
        setLayout(new GridLayout(3,2));
        JLabel aLabel = new JLabel("a");
        add(aLabel);
        JTextField aTextField = new JTextField();
        add(aTextField);
        
        JLabel bLabel = new JLabel("b");
        add(bLabel);
        JTextField bTextField = new JTextField();
        add(bTextField);
        
        JButton mulButton = new JButton("add");
        add(mulButton);
        JLabel resultLabel = new JLabel();
        add(resultLabel);
        
        mulButton.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(aTextField.getText());
                int b = Integer.parseInt(bTextField.getText());
                resultLabel.setText(String.valueOf(a*b));
            }
        });
        pack();
    }
}

public class GenericSwingQuestion {
    public static void main(String[] args) {
        new Multiply().setVisible(true);
    }
    
}

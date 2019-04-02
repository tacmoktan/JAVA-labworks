/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageprompt;
import java.util.Scanner;
/**
 *
 * @author Tashi
 */
public class MessagePrompt {

    /**
     * @param args the command line arguments
     */
    public static int getInt(String prompt, Scanner s){
        
        
        System.out.println(prompt);
        try{
            int input = s.nextInt();
            return input;
        } catch(Exception e) {
            System.out.println("Please follow the instruction !!");
            return -1;
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num = -1;
        while(num == -1){
            Scanner in = new Scanner(System.in);
            num = getInt("Enter a num:",in);
        }
            
        System.out.println("num entered: " + num);
        
    }
    
}

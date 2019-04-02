/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumgame;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Tashi
 */
public class RandomNumGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int randomNum = (int) Math.round(Math.random()* 10);
        System.out.print("welcome to random number game!!");
        
        for(int i =0;i<5;i++){
            int numGuessed = getGuessedNum();
            if(randomNum == numGuessed){
                System.out.println("You win. The correct number is: "+ randomNum);
                break;
            }else{
                String message="";
                if(numGuessed > randomNum)
                    message = "Guessed number is greater than generated number";
                else if(numGuessed < randomNum)
                    message = "Guessed number is lesser than generated number";
                
                System.out.println(message);
                if(i==4) //0 chances left
                    System.out.println("The correct number is: " + randomNum);
            }        
        }
            
    }
    
    public static int getGuessedNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Guess a number from 0-10:");
        int guessedNum = in.nextInt();
        return guessedNum;
    }
}

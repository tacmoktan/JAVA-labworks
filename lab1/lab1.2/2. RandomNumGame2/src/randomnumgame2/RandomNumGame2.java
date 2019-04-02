/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumgame2;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Tashi
 */
public class RandomNumGame2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to Random Number Game 2 ");
        playGame();
          
    }
    
    public static void playGame(){
        int randomNum = (int) Math.round(Math.random()*10); //generates a num from 0-10

        for(int i=0;i<5;i++){
            int guessedNum = getGuessedNum();
            
            if(guessedNum == randomNum){
                System.out.println("You win. The correct number is " + randomNum);
                restartOrExitGame();
                break;
            }else{
                String message = "";
                if(guessedNum > randomNum)
                    message= "Number guessed is greater than number generated";
                else if(guessedNum < randomNum)
                    message = "Number guessed is lesser than number generated";
                
                System.out.println(message);
                if(i==4){
                    System.out.println("You Lose. The correct number is " + randomNum);
                    restartOrExitGame();
                }
            }
        }
    }
    
    public static int getGuessedNum(){
        
        Scanner in  = new Scanner(System.in);
        
        System.out.print("guess a num:");
        int guessedNum = in.nextInt();
        
        return guessedNum;
    }
    
    public static void restartOrExitGame(){
        Scanner response = new Scanner(System.in);
        
        System.out.println("Do you wish to continue? type 'yes' to continue or 'no' to exit ");
        String userResponse = response.nextLine();
        switch(userResponse){
            case "yes":
                playGame();
                break;
                
            case "no":
                System.out.println("GAMEOVER");
                break;
                
            default:
                System.out.println("Please follow the instructions");
                restartOrExitGame();
        }
        
    }
}

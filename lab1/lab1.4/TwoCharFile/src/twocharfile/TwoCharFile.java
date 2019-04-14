
package twocharfile;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwoCharFile {
    
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner (new File("words.txt"));
            
            String result="";
            
            
            while(in.hasNext()){                        
                String word = in.nextLine();            //nextLine reads whole row line
                String[] arrChar = word.split("");      //splits each char including spaces
                
                for(String c:arrChar){
                     result += c+c;                     //concatenating same two chars
                }
                
            }
            System.out.println(result);
            
            PrintWriter out = new PrintWriter(new File("twoCharWords.txt"));
            out.println(result);
            out.close();
            
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        
    }
    
}

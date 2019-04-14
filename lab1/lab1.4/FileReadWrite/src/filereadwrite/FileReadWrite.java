
package filereadwrite;

import java.util.Scanner;               
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileReadWrite {
    
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner( new File("nums.txt") );   //opens file 'nums.txt' in the root directory; to read 
            int a = in.nextInt();       //reads first num
            int b = in.nextInt();       //reads next num (2nd num)
            in.close();
            
            PrintWriter out = new PrintWriter( new File("sum.txt") );   //creates new file 'sum.txt' in the root directory; to write
            out.println( String.format("sum = %d", a+b ));      //writes in 'sum.txt'
            out.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File not found !");
        }
    }
    
}

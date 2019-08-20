
package genericfilereadwrite;

/**
 *
 * @author Tashi
 */

import java.io.*;
import java.util.Scanner;

public class GenericFileReadWrite {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("read.txt"));
        PrintWriter out = new PrintWriter(new File("write.txt"));
        
        while( in.hasNextLine()){
            out.println(in.nextLine());
        }
        out.close();
    }
    
}

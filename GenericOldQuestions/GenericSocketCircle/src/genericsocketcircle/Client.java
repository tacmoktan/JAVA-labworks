
/**
 *
 * @author Tashi
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] Args) throws IOException{
        Socket client = new Socket("localhost", 7070);
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        
        //send radius
        System.out.println("radius:");
        Scanner clientInput = new Scanner(System.in);
        double radius = clientInput.nextDouble();
        out.println(radius);
        
        //receive area
        Scanner ServerInput = new Scanner(client.getInputStream());
        System.out.println("area:" + ServerInput.nextDouble());
        
        out.close();
        
    }
}

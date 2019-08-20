
/**
 *
 * @author Tashi
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Server {
    public static void main(String[] Args) throws IOException{
        final int PORT = 7070;
        ServerSocket server = new ServerSocket(PORT);
        Socket client = server.accept();
        
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        
        //receive radius
        Scanner clientInput = new Scanner(client.getInputStream());
        double radius = clientInput.nextDouble();
        
        //calc area
        double area = Math.PI*radius*radius;
        
        //send area
        out.println(area);
        
        out.close();
    }
}

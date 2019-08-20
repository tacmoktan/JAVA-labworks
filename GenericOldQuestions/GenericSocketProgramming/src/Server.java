/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tashi
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] Args) throws IOException{
        final int PORT = 7070;
        ServerSocket server = new ServerSocket(PORT);
        Socket client = server.accept();
        
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        while(true){
            
            //receive client message
            Scanner clientInput = new Scanner(client.getInputStream());
            System.out.println("client:" + clientInput.nextLine());
            
            //send server message
            Scanner serverInput = new Scanner(System.in);
            String serverMessage = serverInput.nextLine();
            out.println(serverMessage);
            
            if(serverMessage.equalsIgnoreCase("exit")) break;
        }
        
        out.close();    //closes socket
    }
}

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

public class Client {
    public static void main(String[] Args) throws IOException{
        
        Socket client = new Socket("localhost",7070);
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        
        while(true){
            //send client message
            Scanner in = new Scanner(System.in);
            String clientMessage = in.nextLine();
            out.println(clientMessage);

            //receive server message
            Scanner serverInput = new Scanner(client.getInputStream());
            System.out.println("server:" + serverInput.nextLine());
            
            if(clientMessage.equalsIgnoreCase("exit")) break;
        }
        out.close();    //closes socket
    }
}

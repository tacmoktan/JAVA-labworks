package studentsfile;

import java.util.Scanner;
import java.io.*;

public class StudentsFile {
    
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("students.txt"));     //requires double quote to declare file path 
            int totalStudents = Integer.parseInt( in.nextLine() );  //reads first number on file i.e. 5
            String[] studentInfo = new String[totalStudents];       //string array to store info
            //reading from "students.txt"                           //NOTE: using both in.nextInt() & in.nextLine() will read the file from start
            for(int i=0;i<totalStudents;i++){
                studentInfo[i] = in.nextLine();                     //reads line
            }
            in.close();
            
            //writing
            PrintWriter out = new PrintWriter(new File("emp.doc"));  //creates "emp.doc" file
            for(int i=0;i<totalStudents;i++){
                out.println(studentInfo[i]);
            }
            out.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}

// program to read records of the employees back from the file created in #1.4.2 and 
// display records of students having salary more than 25,000.

package empdocreadwrite;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
*/

public class EmpDocReadWrite {

    public static void main(String[] args) {
      try{
        
        //BufferedReader inLine = new BufferedReader(new FileReader("../StudentsFile/emp.doc"));      //BufferReader enables readLine() method
        Scanner in = new Scanner(new File("emp.doc"));
        
        int salaryIndex = 3;
        String record = null;
        
        //while( (record = inLine.readLine()) != null){               //assigns value to record and reads whole row line till line-break
                                                                      //it reads till end of file
        
        while ( in.hasNextLine() ) {                                  //it don't check end of file but reads continously through out the file 
            record = in.nextLine();
            
            String[] words = record.split("\\s+");                  //regex to remove whitespaces
            
            int salary = Integer.parseInt(words[salaryIndex]);      
            
            if( salary > 25000)
              System.out.println(record);

        }
      }
      catch(FileNotFoundException e){
          System.out.println("File not found");
      }
      
      //IOException for BufferedReader
      /* catch(IOException e){
          System.out.println("IO error");
      }*/

    }
    
}

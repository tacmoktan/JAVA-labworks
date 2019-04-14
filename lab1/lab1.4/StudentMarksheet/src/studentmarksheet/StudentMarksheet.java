
package studentmarksheet;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StudentMarksheet {
    
    public static void main(String[] args) {
        try{
            
            Scanner in = new Scanner(new File("marksheet.txt"));
            
            int totalStudents = in.nextInt();
            int fields = in.nextInt();          //no. of fields in each record
            
            double totalMarks, percentage;
            String div;
            
            //int subStartIndex = 2 ;
            PrintWriter out = new PrintWriter( new File("marksheetReport.txt") );
            
            String outputHead = String.format("Symbol\tName\tJAVA\tNET\tINT\tDBMS\tProject\t Total\t Percent Division\n");
            System.out.println(outputHead);
            out.println(outputHead);
            
            //accessing each record
            for(int i=0;i<totalStudents;i++){
                totalMarks = 0;
                percentage = 0;
                div = null;
                
                String originalData= "";
                //accessing fields
                for(int j=0;j<fields;j++){
                    
                    String fieldData = in.next();
                    originalData += fieldData + "\t"  ;
                    //accessing subject marks field only
                    if(j>1)
                        totalMarks += Integer.parseInt( fieldData );
                    
                }
                
                //percentage
                percentage = totalMarks/5;
                //division
                if(percentage > 80)
                    div = "distinction";
                else if(percentage >= 70)
                    div = "first";
                else
                    div = "second";
                
                String outputBody = String.format("%s %.2f\t %.2f\t %s\n", originalData, totalMarks, percentage, div);
                System.out.println(outputBody);
                out.println(outputBody);
            }
            
            out.close();
            
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }

    }
    
}

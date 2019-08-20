
package genericjdbc;

import java.sql.*;
//import java.util.Scanner;
/**
 *
 * @author Tashi
 */
public class GenericJDBC {

    public static void main(String[] args) throws SQLException {
        
        //create connection
        String url="jdbc:mariadb://localhost:3306/javatest";
        String username="root";
        String pw="";
        Connection connection = DriverManager.getConnection(url, username, pw);
        Statement statement = connection.createStatement();
        
        String sql = "select * from users";
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString("username")+'\t'+rs.getString("accounttype"));
        }
        
        //update
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("username:");
        String usernameInput = in.next();
        System.out.println("password:");
        String pwInput = in.next();
        System.out.println("account type:");
        String actypeInput = in.next();
        
        String sql = String.format("insert into users(username, password,accounttype)values('%s','%s','%s')", 
                usernameInput, pwInput, actypeInput);
        
        int rs = statement.executeUpdate(sql); //rs = 1
        System.out.println(rs);*/
        
    }
    
}

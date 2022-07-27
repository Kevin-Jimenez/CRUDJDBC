
package COM.CONTROLLER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class ConnectionBD{
    
    public static Connection ConnecToDB(){
        String url="jdbc:mysql://localhost:3306/interview";
        String username = "root";
        String password = "";
        try{
           Connection con = DriverManager.getConnection(url,username,password);
           if(con != null)
                System.out.println("Conected....");
           return con;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
}


package assignment_3;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBCON {
    public DBCON getConnection(){
        DBCON con = null;
        try {
            try {  
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBCON.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = (DBCON) DriverManager.getConnection("jdbc:sqlserver://DESKTOP-E5IBCL1\\SQLEXPRESS;user=ZARAQABBAS;password=ZARAQABBAS123;database=Assignment3");
            System.out.println("Connected to database !");
        } catch (SQLException sqle) {
            System.out.print("Connection Error!");
        }       
        return con;       
    }
    
}

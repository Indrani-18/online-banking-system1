
package online.banking.system;


import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn() {
       try {
           
           c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "0987654321");
           s = c.createStatement();
           
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}

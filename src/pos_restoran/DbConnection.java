/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DbConnection {
    public Connection conn;
    public Statement stmt;
    public PreparedStatement prepare;
    public ResultSet rs;
    
    public void Connect()
    {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            conn =DriverManager.getConnection(  
            "jdbc:mysql://localhost/ta_alpro","root","");  
            //here sonoo is database name, root is username and password  
            stmt = conn.createStatement();
            
        }
        catch(Exception e){ 
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

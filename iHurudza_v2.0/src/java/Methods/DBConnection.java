/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.sql.*;
/**
 *
 * @author sinyoro
 */

public class DBConnection 
{
    public static Connection dbConnector(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iHurudza","root","");
            return myconn;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
}

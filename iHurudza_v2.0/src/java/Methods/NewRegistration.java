/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import MyValues.*;
import MySec.*;

import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sinyoro
 */
public class NewRegistration 
{
    public Connection myconn;
    
    Louisa loui = new Louisa();
    MySecCheck msc = new MySecCheck();
     Values vl = new Values();
    private String sID ;
    private String susrID ;
    private String spasID ;
    String response = null;
    
    public NewRegistration()
    {

        
        myconn = DBConnection.dbConnector();
        if(myconn == null)
            System.exit(1);
        
    }
    

    public boolean newReg(String a,String b,String c,String d,String e)
    {
    Values mv = new Values();
    
    
    String status = mv.status2(Nyasha.status2);
    String state = mv.accState1(Nyasha.state1);
    String role = mv.role3(Nyasha.role3);
    String usn = mv.usrnmeNull(Nyasha.username);
    String pass = mv.passNull(Nyasha.password);
    
    
       
            
        String query = "insert into users(systemID,systemUSRNME,systemPASS,username,password,name,surname,email,cell,accesslevel,address,accountstatus,accountstate)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = myconn.prepareStatement(query);
            ps.setString(1, sID);
            ps.setString(2,susrID);
            ps.setString(3, spasID);
            ps.setString(4, usn);
            ps.setString(5, pass);
            ps.setString(6, a);
            ps.setString(7, b);
            ps.setString(8, c);
            ps.setString(9, d);
            ps.setString(10, role);
            ps.setString(11, e);
            ps.setString(12, status);
            ps.setString(13, state);
            ps.execute();
          
             } catch (SQLException ex) {
            Logger.getLogger(NewRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    
}

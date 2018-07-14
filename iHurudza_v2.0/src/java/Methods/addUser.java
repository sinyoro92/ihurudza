/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import MyValues.*;

/**
 *
 * @author sinyoro
 */
public class addUser 
{
   public Connection myconn;
    public addUser()
    {
        myconn = DBConnection.dbConnector();
        if(myconn == null)
            System.exit(1);
    }
    public boolean isDBConnected()
    {
        try {

            return !myconn.isClosed();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean newAdmin(String a,String b,String c,String d,String e,String f)
    {
        
         Values mv = new Values();
    String status = mv.status2(Nyasha.status2);
    String state = mv.accState1(Nyasha.state1);
    String usn = mv.usrnmeNull(Nyasha.username);
    String pass = mv.passNull(Nyasha.password);
        
        
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String gy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sp ="!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String s = "";String x = "";String z ="";
        String sy = "";String xy = "";String zy ="";
        String sx = "";String xx = "";String zx ="";String yx="";
        String systemID ="";String sysSetID ="";String sypass = z;
        
         Random seed = new Random();
        int randomLen = seed.nextInt(5);
        for (int i = 0; i < randomLen; i++) {
            char ca = alphabet.charAt(seed.nextInt(26));
            char da = gy.charAt(seed.nextInt(26));
            s+=ca;
            x+=da;
           sy+=ca;
           xy+=da;
           
           int an = 1000+seed.nextInt(9000);
           int bn = 1000+seed.nextInt(9000);
           int any = 1000+seed.nextInt(9000);
           int anx = 1000+seed.nextInt(9000);
           int bnx = 1000+seed.nextInt(9000);
           
           String  r = Integer.toString(an);
           String w = Integer.toString(bn);
           String  ry = Integer.toString(any);
           String  rx = Integer.toString(anx);
           String wx = Integer.toString(bnx);
           
           z=s+x+r;
           zy = sy+ry+xy+sy+w;
           zx= sx+yx+xx+rx+sx+wx;
    }
    systemID =z;sysSetID =zy; sypass = zx;
        
    
          
               String sID = systemID;
        String susrID =sysSetID;
        String spsID = sypass;
        String query = "insert into users(systemID,systemUSRNME,systemPASS,username,password,name,surname,email,cell,accesslevel,address,accountstatus,accountstate)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = myconn.prepareStatement(query);
            ps.setString(1, sID);
            ps.setString(2,susrID);
            ps.setString(3, spsID);
            ps.setString(4, usn);
            ps.setString(5, pass);
            ps.setString(6, a);
            ps.setString(7, b);
            ps.setString(8, c);
            ps.setString(9, d);
            ps.setString(10, e);
            ps.setString(11 ,f);
            ps.setString(12, status);
            ps.setString(13, state);
            ps.execute();
          
            
            
             } catch (SQLException ex) {
            Logger.getLogger(addUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    
}


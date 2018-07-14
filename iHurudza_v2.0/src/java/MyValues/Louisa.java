/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyValues;

import Methods.*;
import java.sql.*;
import java.util.Random;

/**
 *
 * @author sinyoro
 */
public class Louisa 
{
    public Connection myconn;
    
    public Louisa()
    {
        
     myconn = DBConnection.dbConnector();
        if(myconn == null)
            System.exit(1);
    
    }

    public String sysID()
    {
          String alphabet= "abcdefghijklmnopqrstuvwxyz";
         String gy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = "";
        String x = "";
        String z ="";
        String systemID ="";
        
         Random seed = new Random();
        int randomLen = seed.nextInt(5);
        for (int i = 0; i < randomLen; i++) {
            char c = alphabet.charAt(seed.nextInt(26));
            char d = gy.charAt(seed.nextInt(26));
            s+=c;
            x+=d;
           int an = 1000+seed.nextInt(9000);
           int bn = 1000+seed.nextInt(9000);
           String  r = Integer.toString(an);
           z=s+x+r;
    }
   return systemID = z;
    
    }
    public String userSetName()
    {
          String alphabet= "abcdefghijklmnopqrstuvwxyz";
         String gy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = "";
        String x = "";
        String z ="";
        String sysSetID ="";
     
        
         Random seed = new Random();
        int randomLen = seed.nextInt(26);
        for (int i = 0; i < randomLen; i++) {
            char c = alphabet.charAt(seed.nextInt(26));
            char d = gy.charAt(seed.nextInt(26));
            s+=c;
            x+=d;
            int an = 100+seed.nextInt(9000);
            int bn = 1000+seed.nextInt(9000);
            String  r = Integer.toString(an);
            String  w = Integer.toString(bn);
            z = s+r+x+s+w;
            }
        return sysSetID = z;
    }
    public String syspass()
    {
          String alphabet= "abcdefghijklmnopqrstuvwxyz";
         String gy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String sp ="!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String s = "";
        String x = "";
        String y = "";
        String z ="";
        String sysSetPass ="";
     
         Random seed = new Random();
        int randomLen = seed.nextInt(26);
        for (int i = 0; i < randomLen; i++) {
            char c = alphabet.charAt(seed.nextInt(26));
            char d = gy.charAt(seed.nextInt(26));
          char e = sp.charAt(seed.nextInt(26));
            s+=c;
            x+=d;
            y+=e;
           int an = 1000+seed.nextInt(9000);
           int bn = 1000+seed.nextInt(9000);
                 String  r = Integer.toString(an);
                 String  w = Integer.toString(bn);
        z = s+y+x+r+s+w;
    }
        return sysSetPass = z;
}
       
}

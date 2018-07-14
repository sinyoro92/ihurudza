/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySec;

import Methods.*;
import java.sql.*;
/**
 *
 * @author devops20
 */
public class MySecCheck
{
    public Connection myconn;
    
    public MySecCheck()
    {
        
        myconn = DBConnection.dbConnector();
        if(myconn == null)
            System.exit(1);
        
    }
    
     public  boolean validateSysID(String sysID) throws SQLException{
                
                PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where systemID =?");
            ps.setString(1, sysID);
            
            rs = ps.executeQuery();
                        if(rs.next()){
				return true;
			}
                        else
			{
				return false;	
			}
                        
                        
		}
		catch ( Exception e)
		{
			return false;
		}
                
		finally{
			ps.close();
			rs.close();
                        
		}

    }

      public  boolean validateSysUSRNME(String sysUSRNME) throws SQLException{
                
                PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where systemUSRNME =?");
            ps.setString(1, sysUSRNME);
            
            rs = ps.executeQuery();
                        if(rs.next()){
				return true;
			}
                        else
			{
				return false;	
			}
                        
                        
		}
		catch ( Exception e)
		{
			return false;
		}
                
		finally{
			ps.close();
			rs.close();
                        
		}

    }

       public  boolean validateSysPass(String sysPASS) throws SQLException{
                
                PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where systemPASS =?");
            ps.setString(1, sysPASS);
            
            rs = ps.executeQuery();
                        if(rs.next()){
				return true;
			}
                        else
			{
				return false;	
			}
                        
                        
		}
		catch ( Exception e)
		{
			return false;
		}
                
		finally{
			ps.close();
			rs.close();
                        
		}

    }

    
}

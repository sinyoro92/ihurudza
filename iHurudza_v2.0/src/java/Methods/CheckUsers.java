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
public class CheckUsers
{
public Connection myconn;
    public CheckUsers()
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
    public  boolean validate(String unme, String pass, String a) throws SQLException{
		
		PreparedStatement ps = null;
		ResultSet rs = null;
        try{

            ps = myconn.prepareStatement ("select * from users where username =? and password =? and accesslevel =?");
            ps.setString(1, unme);
            ps.setString(2, pass);
            ps.setString(3,a);

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
        public  boolean validate2(String unme, String pass, String a) throws SQLException{
		
		PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where username =? and password =? and accesslevel =?");   ps.setString(1, unme);
            ps.setString(2, pass);
            ps.setString(3,a);

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
   public  boolean validate3(String unme, String pass, String a) throws SQLException{
		
		PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where username =? and password =? and accesslevel =?");   ps.setString(1, unme);
            ps.setString(2, pass);
            ps.setString(3,a);

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




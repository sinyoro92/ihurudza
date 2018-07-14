/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author root
 */


import java.sql.*;


public class CheckState 
{
    public Connection myconn;
    public CheckState()    
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
    public  boolean validateState(String unme, String pass, String a, String d) throws SQLException{
                
                PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where username =? and password =? and accesslevel =? and accountstate =?");   ps.setString(1, unme);
            ps.setString(2, pass);
            ps.setString(3,a);
            ps.setString(4, d);
            
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
     
    public  boolean validateState2(String unme, String pass, String a, String d) throws SQLException{
                
                PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where username =? and password =? and accesslevel =? and accountstate =?");   ps.setString(1, unme);
            ps.setString(2, pass);
            ps.setString(3,a);
            ps.setString(4, d);
            
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

    }   public  boolean validateState3(String unme, String pass, String a, String b) throws SQLException{
		
		PreparedStatement ps = null;
		ResultSet rs = null;
        try{

         
            ps = myconn.prepareStatement ("select * from users where username =? and password =? and accesslevel =? and accountstate =?");   ps.setString(1, unme);
            ps.setString(2, pass);
            ps.setString(3,a);
            ps.setString(4, b);
            
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
    

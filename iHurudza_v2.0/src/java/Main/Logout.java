/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import MyValues.Values;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sinyoro
 */
public class Logout extends HttpServlet {

    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
        	response.setContentType("text/html");
    	Values va = new Values();
    String n = va.getSessionName();
    	//invalidate the session if exists
        
        HttpSession session = request.getSession(false);
    	session.getAttribute(n);
    	if(session != null){
    		session.invalidate();
    	}
    	response.sendRedirect("administrator/index.jsp");
    }
    

}
